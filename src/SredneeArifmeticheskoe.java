/*
    Программа, в которой массив используется для нахождения
    среднего арифметического десяти значений double.
 */
class SredArifm{
    double getSredArifm (double[] mass){
        double summMass = 0;
        for (double mas : mass) {
            summMass += mas;
        }
        return summMass/mass.length;
    }
}
public class SredneeArifmeticheskoe {
    public static void main(String[] args) {
        double d[]={212,34,65,7867,8,-32,3,-1356,31,23};
        SredArifm val = new SredArifm();
        System.out.println(val.getSredArifm(d));
    }
}
