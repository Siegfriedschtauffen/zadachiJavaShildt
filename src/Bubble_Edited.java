/*
    Измененная программа Bobble, написанная в примере 5.1.

    На этот раз она сортирует массив символьных строк.
 */
public class Bubble_Edited {
    public static void main(String[] args) {
        String str[] = {"Mitsubishi", "Toyota", "Nissan", "Mercedes-Benz", "Volvo", "Porsche", "Kia", "Lexus",
                "BMW", "Ferrari", "Lamborghini", "Jaguar", "Rolls-Royce", "Ford", "Dodge", "Tesla", "Mazda",
                "Volkswagen", "Audi", "Chevrolet", "Infinity", "Bugatti"};

        // отобразить исходный массив
        System.out.print("Original array is: ");
        for (String  x : str) System.out.print(" "+x);
        System.out.println();



        // реализовать алгоритм пузырьковой сортировки
        for (int a=1; a<str.length;a++){
            for (int b=str.length-1; b>=a; b--){
                for (int c=(str[b-1].length()<str[b].length())?str[b-1].length()-1:str[b].length()-1;c>=0;c--){
                    if (str[b-1].charAt(c)>str[b].charAt(c)) {
                        String t = str[b-1];
                        str[b-1]=str[b];
                        str[b]=t;

                    }
                }
            }
        }

        // отобразить отсортированный массив
        System.out.print("Sorted array is:   ");
        for (String  x : str) System.out.print(" "+x);
        System.out.println();
    }
}
