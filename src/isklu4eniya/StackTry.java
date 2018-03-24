package isklu4eniya;

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



class Stack {
    private char q[];           // Массив для хранения элементов стека
    private int putloc, getloc; // Индексы размещения и извлечения элементов стека

    // сконструировать пустой массив заданного размера
    Stack(int size){
        q = new char[size+1]; // выделить память для стека
        putloc = getloc = 0;
    }
    // сконструировать стек из существующего объекта типа Stack
    Stack(Stack ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        // копировать элементы стека
        for (int i=putloc; i>=0; i--)
            q[i] = ob.q[i];
    }
    // сконструировать стек из массива исходных значений
    Stack(char a[]){
        putloc = 0;
        getloc = 0;
        q = new char[a.length+1];
        for (int i=0; i<a.length; i++) {
            try {
                put(a[i]);
            } catch (StackFullException e) {
                e.printStackTrace();
            }
        }
    }
    // поместить символ в стек
    void put(char ch) throws StackFullException{
        if (putloc==q.length-1){
            throw new StackFullException(10);
        }
        putloc++;
        q[putloc] = ch;
        getloc = putloc+1;
    }
    // извлечь символ из стека
    char get() throws StackEmptyException {
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
        Stack q1 = new Stack(10);
        char name[] = {'T', 'o', 'm'};
        // построить стек из массива
        Stack q2 = new Stack(name);

        char ch;
        int i;

        try {
            // поместить ряд символов в стек q1
            for (i = 0; i < 11; i++)
                q1.put((char) ('A' + i));
        }catch (StackFullException e){
            System.out.println(e);
        }

        // построить один стек из другого стека
        Stack q3 = new Stack(q1);

        try {
            // показать стек
            System.out.print("Contents of q1: ");
            for (i = 0; i < 13; i++) {
                ch = q1.get();
                System.out.print(ch);
            }
        }catch (StackEmptyException e){
            System.out.println(e);
        }

        System.out.println("\n");

        try {
            System.out.print("Contents of q2: ");
            for (i=0; i<5; i++){
                ch = q2.get();
                System.out.print(ch);
            }
        }catch (StackEmptyException e){
            System.out.println(e);
        }

        System.out.println("\n");

        try {
            System.out.print("Contents of q3: ");
            for (i = 0; i < 13; i++) {
                ch = q3.get();
                System.out.print(ch);
            }
        }catch (StackEmptyException e){
            System.out.println(e);
        }
    }
}
