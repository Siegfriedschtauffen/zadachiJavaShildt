package mnogopoto4nost;

class Queue2 {
    private char q[];
    private int putloc, getloc;

    Queue2(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    synchronized public void put(char ch) {
        if (putloc == q.length - 1) {
            reset();
        }
        putloc++;
        q[putloc] = ch;
    }

    synchronized public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

    public void reset(){
        putloc=getloc=0;
    }
}

class MyThread2 implements Runnable{
    Thread t;
    static Queue2 que = new Queue2(20);

    MyThread2(String name){
        t = new Thread(this,name);
        t.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            que.put((char)('A'+i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + " thread - " + que.get());

        }
    }
}


public class ThreadQDemo {
    public static void main(String[] args) {
        MyThread2 mt1 = new MyThread2("One");
        MyThread2 mt2 = new MyThread2("Two");



    }
}


