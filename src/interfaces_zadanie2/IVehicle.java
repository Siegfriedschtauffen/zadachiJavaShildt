package interfaces_zadanie2;

public interface IVehicle {
    // возвратить дальность действия транспортного средства
    int range();
    // рассчитать объем топлива, требующегося
    // для прохождения заданного пути
    double fuelneeded(int miles);
    // Методы доступа к переменным экземпляра.
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
