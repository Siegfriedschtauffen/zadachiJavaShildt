
/*Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
(Опционально) Найдите человека, который прибежал вторым.*/

public class Marafon {
    public static void main(String[] args) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
        for (int i=1; i<times.length;i++){
            for (int j=times.length-1;j>=i;j--){
                if (times[j-1]>times[j]){
                    int k = times[j-1];
                    String z = names[j-1];
                    times[j-1]=times[j];
                    names[j-1]=names[j];
                    times[j]=k;
                    names[j]=z;
                }
            }
        }

        System.out.println("Первым прибежал(а) - "+names[0]);
        System.out.println("Вторым прибежал(а) - "+names[1]);
    }
}
