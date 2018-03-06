
// Упражнения, глава 1.
// Вычислить мой вес на луне.
// Гравитация луны 17% от земной

import java.util.Scanner;

public class SilaTyazhestiNaLune {
    public static void main(String[] args) {
        System.out.print("Мой вес, кг - ");
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextInt();
        double weightInMoon = Math.round(weight*0.17);
        System.out.println("Мой вес на луне - "+ weightInMoon + " кг");
    }
}
