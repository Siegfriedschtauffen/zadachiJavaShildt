package vvod_vivod;
/*
    Измененная версия.
 */

import java.io.*;

public class CopyText2 {
    public static void main(String[] args) {

        int i;
        try (FileReader fr = new FileReader("first.txt");
            FileWriter fw = new FileWriter("second.txt")){
            do {
                i = fr.read();
                if (i==' ')i='-';
                if (i!=-1)fw.write(i);
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
