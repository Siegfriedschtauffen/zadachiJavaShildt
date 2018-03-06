/*
    Измененная программа Bobble, написанная в примере 5.1.

    На этот раз она сортирует массив символьных строк.
 */
public class Bubble_Edited {
    public static void main(String[] args) {
        int a,b,c,d;
        String str[] = {"Mitsubishi", "Toyota", "Nissan", "Mercedes-Benz", "Volvo", "Porsche", "Kia", "Lexus",
                "BMW", "Ferrari", "Lamborghini", "Jaguar", "Rolls-Royce", "Ford", "Dodge", "Tesla", "Mazda",
                "Volkswagen", "Audi", "Chevrolet", "Infinity", "Bugatti"};

        // отобразить исходный массив
        System.out.print("Original array is: ");
        for (String  x : str) System.out.print(" "+x);
        System.out.println();

        // реализовать алгоритм пузырьковой сортировки
        for (a=1; a<str.length;a++){
            for (b=str.length-1; b>=a; b--){
                if (str[b-1].length()<str[b].length()){
                    c=str[b-1].length()-1;
                }else c = str[b].length()-1;
                for (d=c;d>=0;d--) {
                    if (str[b - 1].charAt(d) > str[b].charAt(d)) {
                        String t = str[b - 1];
                        str[b - 1] = str[b];
                        str[b] = t;
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
