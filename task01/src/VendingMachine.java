// Интерфейс к классу вендингового автомата
// описаны прототипы методов класса
public interface VendingMachine {
    abstract public HotDrink GetProduct(String name, int temperature , double volume);

    HotDrink GetProduct(String name, int temperature);

    HotDrink GetProduct(String name);
}