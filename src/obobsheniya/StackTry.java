package obobsheniya;

/*
    Созданйте класс Stack, реализующий стек для хранения символов.
    Используйте методы push() и pop() для манипуляции содержимым стека.
    Пользователь класса Stack должен иметь возможность задавать размер
    стека при его создании. Все члены класса Stack, кроме push() и pop(),
    должны быть объявлены как private. (Подсказка: в качестве заготовки можете
    пользоваться классом Stack, изменив в нем лишь способ доступа к данным)
*/

// Добавление исключений для реагирования на попытку поместить элемент
// в переполненный стек и извлечь элемент из пустого стека.

/*
    Видоизмените программу таким образом, чтобы сделать класс обобщенным.
    По ходу дела создайте интерфейс стека IGenStack, объявив в нем обобщенные
    методы push() и pop().
 */
interface IGenStack<T>{
    void push(T o) throws StackFullException;
    T pop() throws StackEmptyException;
}

class StackFullException extends Exception{
    private int size;
    StackFullException(int s){
        size=s;
    }
    public String toString(){
        return "\nStack is full. Maximum stack size - "+size;
    }
}

class StackEmptyException extends Exception{
    public String toString(){
        return "\nStack is empty.";
    }
}


class Stack<T> implements IGenStack<T>{
    private T q[];           // Массив для хранения элементов стека
    private int putloc, getloc; // Индексы размещения и извлечения элементов стека

    // сконструировать стек из массива исходных значений
    // или пустой массив заданного размера
    Stack(T a[]){
        putloc = -1;
        getloc = a.length;
        q = a;
    }
    // сконструировать стек из существующего объекта типа Stack
    Stack(Stack<T> ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = ob.q;
    }

    // поместить символ в стек
    public void push(T o) throws StackFullException {
        if (putloc==q.length-1){
            throw new StackFullException(q.length);
        }
        putloc++;
        q[putloc] = o;
        getloc = putloc+1;
    }
    // извлечь символ из стека
    public T pop() throws StackEmptyException {
        if(getloc == 0){
            throw new StackEmptyException();
        }
        getloc--;
        return q[getloc];
    }
}

// продемонстрировать класс Stack в действии
public class StackTry {
    public static void main(String[] args) {
        // построить пустой стек для хранения 10 элементов
        Stack<Character> q1 = new Stack<>(new Character[10]);
        // построить стек из массива
        Integer iOb[] = { 1, 2, 3, 4 ,5 };
        Stack<Integer> q2 = new Stack<>(iOb);
        // построить один стек из другого стека
        Stack q3 = new Stack(q1);
        try {
            // поместить ряд символов в стек q1
            for (int i = 0; i < 15; i++)
                q1.push((char)('A' + i));
        }catch (StackFullException e){
            System.out.println(e);
        }
        try {
            // показать стек
            System.out.print("Contents of q1: ");
            for (int i = 0; i < 11; i++) System.out.print(q1.pop());
        }catch (StackEmptyException e){
            System.out.println(e);
        }
        System.out.println("\n");
        try {
            System.out.print("Contents of q2: ");
            for (int i=0; i<6; i++) System.out.print(q2.pop());
        }catch (StackEmptyException e){
            System.out.println(e);
        }
        System.out.println("\n");
        try {
            System.out.print("Contents of q3: ");
            for (int i = 0; i < 13; i++) System.out.print(q3.pop());
        }catch (StackEmptyException e){
            System.out.println(e);
        }
    }
}
