package mnogopoto4nost;
interface ICharQ{
    void put(char ch);
    char get();

}
class Queue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Queue is full.");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
public class QDemo {
    public static void main(String[] args) {
        Queue ob = new Queue(10);
        for (int i = 0; i < 12; i++) {
            ob.put((char) ('A'+i));
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(ob.get());
        }
    }
}
