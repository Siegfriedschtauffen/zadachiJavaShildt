
// Упражнения, глава 3.
/*
    Напишите программу которая вводила бы символы с клавиатуры до тех пор, пока
    не встретится точка. Предусмотрите в программе счетчик числа пробелов. Сведения
    о количестве пробелов должны выводится в конце программы.

 */

import java.io.IOException;

public class Tochka {
    public static void main(String[] args) throws IOException {
        char ch,ignore;
        int probels = 0;

        do{
            System.out.print("Введите какой-нибудь символ: ");
            ch = (char) System.in.read();
            do{
                ignore = (char) System.in.read();
            }while (ignore!='\n');
            if (ch == ' ') probels++;

        }while (ch!='.');
        System.out.println("Количество введенных пробелов - " + probels);


    }
}           // YA AHUENEN!!!
