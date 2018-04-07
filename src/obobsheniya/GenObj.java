package obobsheniya;

class Counter<T>{
    private T ob;
    public Counter(T o){
        ob = o;
    }
    public T getOb() {
        return ob;
    }
}

public class GenObj{
    public static void main(String[] args) {
        Counter obj = new Counter(new String("Hello, World!"));
        System.out.println(obj.getOb());
    }
}

