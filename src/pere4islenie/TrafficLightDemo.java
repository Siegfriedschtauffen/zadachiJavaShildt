package pere4islenie;

enum TrafficLightColor{
    RED(12000), GREEN(10000), YELLOW(2000);
    private int delay;
    TrafficLightColor(int a){
        delay=a;
    }

    public int getDelay() {
        return delay;
    }
}
// Иммитация атоматизированного светофора.
class TrafficLightSimulator implements Runnable{
    private Thread thrd; // Поток для иммитации светофора
    private TrafficLightColor tlc; // Текущий цвет светофора
    boolean stop = false; // Остановка иммитации, если истинно
    boolean changed = false; // Переключение светофора, если истинно
    TrafficLightSimulator(TrafficLightColor init){
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }
    TrafficLightSimulator(){
        tlc = TrafficLightColor.RED;
        thrd = new Thread(this);
        thrd.start();
    }
    // Запуск иммитации автоматизированного светофора.
    @Override
    public void run() {
        while (!stop){
            try {
                Thread.sleep(tlc.getDelay());
            }catch (InterruptedException e){
                System.out.println(e);
            }
            changeColor();
        }
    }
    // Переключение цвета светофора.
    synchronized void changeColor(){
        if (tlc.ordinal()==0)
            tlc = TrafficLightColor.GREEN;
        else if (tlc.ordinal()==2)
            tlc = TrafficLightColor.RED;
        else if (tlc.ordinal()==1)
            tlc = TrafficLightColor.YELLOW;

        changed = true;
        notify(); // уведомить о переключении цвета светофора
    }
    // Ожидание перелючения цвета светофора.
    synchronized void waitForChange(){
        try {
            while (!changed) // ожидать переключение цвета светофора
                wait();
            changed=false;
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
    // Возврат текущего цвета.
    TrafficLightColor getColor(){
        return tlc;
    }
    // Прекращение иммитации светофора.
    void cancel(){
        stop = true;
    }
}
public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
