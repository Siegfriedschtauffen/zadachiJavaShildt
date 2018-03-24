/*
    Создайте класс Circle, производный от класса TwoDShape.
    В нем должен быть определен метод area(), вычисляющий
    площадь круга, а также конструктор с ключевым словом super
    для инициализации членов, унаслодованных от класса TwoDShade.
 */
class TwoDShape{
    private int width;
    private int height;
    private String name;
    TwoDShape(){
        width=height=0;
    }
    TwoDShape(int w, String n){
        width = w;
        name = n;
    }
    TwoDShape(int w, int h, String n){
        width = w;
        height = h;
        name = n;
    }
    int getWidth() {return width;}
    int getHeight() {return height;}
    String getName() {return name;}
}
class Circle extends TwoDShape{
    private int diameter;
    private int radius;
    Circle(int w){
        super(w,"circle");
        diameter = w;
        radius = diameter/2;
    }
    double area(){
        return (Math.PI*Math.pow(radius,2));
    }
}
public class Shapes {
    public static void main(String[] args) {
        Circle ob = new Circle(8);
        System.out.println("Shape is "+ob.getName());
        System.out.println("Area is "+ob.area());
    }
}
