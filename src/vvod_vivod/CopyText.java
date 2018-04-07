package vvod_vivod;
/*
    Напишите программу, которая будет копировать текстовые файлы.
    Видоизмените ее таким образом, чтобы все пробелы заменялись дефисами.
    Используйте при написании программы классы, представляющие байтовые потоки,
    а также традиционный способ закрытия файла явным вызовом метода close ().
 */

import java.io.*;

public class CopyText {
    public static void main(String[] args) {
        FileInputStream fin;
        FileOutputStream fout;
        int i;
        try {
            fin = new FileInputStream("first.txt");
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
            return;
        }
        try {
            fout = new FileOutputStream("second.txt");
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
            try {
                fin.close();
            }catch (IOException e2){
                System.out.println("I/O Error: "+e2);
            }
            return;
        }
        try {
            do {
                i = fin.read();
                if (i==' ')i='-';
                if (i!=-1)fout.write(i);
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
        try {
            fin.close();
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
        try {
            fout.close();
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
