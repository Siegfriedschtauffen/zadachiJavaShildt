package mnogopoto4nost;

class MyThrd implements Runnable{
    Thread thrd;
    MyThrd(String name){
        thrd = new Thread(this,name);
        thrd.start();

    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println("interrupted");
            }
        }
    }
}
public class ThreadJoin {
    public static void main(String[] args) {
        MyThrd mt1 = new MyThrd("one");
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+3);

        try {
            mt1.thrd.join();
            System.out.println("Thread joined.");
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
