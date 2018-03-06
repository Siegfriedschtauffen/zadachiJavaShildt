
// Упражнения, глава 2.
// Найти простые числа от 2 до 100.

public class ProstieChisla {
    public static void main(String[] args) {
        int i;

        for(i=2;i<=100;i++){
            if(i==2|i==3|i==5|i==7){
                System.out.println(i);
            }else if ((i%2)!=0&(i%3)!=0&(i%5)!=0&(i%7)!=0){
                System.out.println(i);
            }
        }
    }
}
