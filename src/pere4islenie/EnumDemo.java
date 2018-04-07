package pere4islenie;

enum Tools{
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
public class EnumDemo {
    public static void main(String[] args) {
        Tools allTools[] = Tools.values();
        for (Tools x : allTools)
            System.out.println(x);
    }
}
