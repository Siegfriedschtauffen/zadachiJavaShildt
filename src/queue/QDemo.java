package queue;

class Queue implements ICharQ{
    private char q[];
    private int putloc, getloc;
    public Queue(int size){
        q=new char[size+1];
        putloc=getloc=0;
    }
    public void put(char ch){

        if (putloc==q.length-1){
            reset();
        }
        putloc++;
        q[putloc]=ch;
    }
    public char get(){
        if (getloc==putloc){
            System.out.println(" - Queue is empty.");
            return (char)0;
        }
        getloc++;
        return q[getloc];
    }
    int getLength(){return q.length;}

    public void reset(){
        putloc=getloc=0;
    }
}

public class QDemo {
    public static void main(String[] args) {
        Queue ob = new Queue(10);
        for (int i=0;i<100;i++){
            ob.put((char)('A'+i));
            System.out.print(ob.get());
        }
        System.out.println();
        System.out.println(ob.getLength());

    }
}
