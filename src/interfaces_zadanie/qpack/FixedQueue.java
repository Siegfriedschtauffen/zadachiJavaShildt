package interfaces_zadanie.qpack;

// Класс, реализуюзий очередь фиксированного размера
// для хранения символов.
public class FixedQueue implements ICharQ {
    private char q[]; // Массив для хранения элементов очереди.
    private int putloc, getloc; // Индексы размещения и извлечения
                                // элементов очереди

    // создать пустую очередь заданного размера
    public FixedQueue(int size){
        q = new char[size+1]; // выделить память для очереди
        putloc = getloc = 0;
    }
    // поместить символ в очередь
    public void put(char ch){
        if (putloc==q.length-1){
            System.out.println(" - Queue is full.");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    // извлечь символ из очереди
    public char get(){
        if (getloc==putloc){
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
