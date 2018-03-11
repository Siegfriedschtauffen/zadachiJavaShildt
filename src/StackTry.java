
/*
    Созданйте класс Stack, реализующий стек для хранения символов.
    Используйте методы push() и pop() для манипуляции содержимым стека.
    Пользователь класса Stack должен иметь возможность задавать размер
    стека при его создании. Все члены класса Stack, кроме push() и pop(),
    должны быть объявлены как private. (Подсказка: в качестве заготовки можете
    пользоваться классом Stack, изменив в нем лишь способ доступа к данным)
*/
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
        for (int i=0; i<a.length; i++) put(a[i]);
    }
    // поместить символ в стек
    void put(char ch){
        if (putloc==q.length-1){
            System.out.println(" - Stack is full.");
            return;
        }
        putloc++;
        q[putloc] = ch;
        getloc = putloc+1;
    }
    // извлечь символ из стека
    char get(){
        if(getloc == 0){
            System.out.println(" - Stack is empty.");
            return (char) 0;
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

        // поместить ряд символов в стек q1
        for (i=0; i<10; i++)
            q1.put((char) ('A' + i));
        // построить один стек из другого стека
        Stack q3 = new Stack(q1);
        // показать стек
        System.out.print("Contents of q1: ");
        for (i=0; i<10; i++){
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for (i=0; i<3; i++){
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for (i=0; i<10; i++){
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
