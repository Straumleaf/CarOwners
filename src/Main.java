import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Person[] persons =  new Person[7];

        car.setMake("Car_1");
        car.setPrice(1000);

        persons[0].setName("Name 1");
        persons[0].setCar(car);

        car.setMake("Car_2");
        car.setPrice(2000);

        persons[1].setName("Name 2");
        persons[1].setCar(car);

        car.setMake("Car_3");
        car.setPrice(10000);

        persons[2].setName("Name 3");
        persons[2].setCar(car);

        car.setMake("Car_2");
        car.setPrice(2000);

        persons[3].setName("Name 4");
        persons[3].setCar(car);

        car.setMake("Car_1");
        car.setPrice(1000);

        persons[4].setName("Name 5");
        persons[4].setCar(car);

        car = null;

        persons[5].setName("Name 6");
        persons[5].setCar(car);

        car = null;

        persons[6].setName("Name 7");
        persons[6].setCar(car);

        for (Person p: persons ) System.out.println(p);

    }
}
