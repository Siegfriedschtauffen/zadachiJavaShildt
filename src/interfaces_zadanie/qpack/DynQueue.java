package interfaces_zadanie.qpack;

// Динамическая очередь.
public class DynQueue implements ICharQ{
    private char q[]; // Массив для хранения элементов очереди.
    private int putloc, getloc; // Индексы размещения и извлечения
    // элементов очереди

    // создать пустую очередь заданного размера
    public DynQueue(int size){
        q = new char[size+1]; // выделить память для очереди
        putloc = getloc = 0;
    }
    public void put(char ch){
        if (putloc==q.length-1){
            // увеличить размер очереди
            char t[]=new char[q.length*2];

            // скопировать элементы в новую очередь
            for (int i=0;i<q.length;i++)
                t[i]=q[i];
            q=t;
        }
        putloc++;
        q[putloc]=ch;
    }
    public char get() {
        if (getloc==putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
