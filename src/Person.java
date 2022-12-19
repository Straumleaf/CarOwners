import java.util.ArrayList;

public class Person {
    private String name;
    private Car car;        // those who doesn't have a car it will be null

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Car getCar() { return car; }

    public void setCar(Car car) { this.car = car; }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public static Car[] getCars(Person[] persons) {
        Car cars[] = new Car[persons.length];

        return cars;
    }

    public static Car[] expensiveCars(Person[] persons, int minPrice) {
        Car[] cars = new Car[persons.length];

        return cars;
    }

    public static int getPrice(Person[] persons, String name) {

        //  if there is no person with this name - return (-2)
        //  if this name has no car - return(-1)

        int carPrice = 0;

        return carPrice;
    }
}
