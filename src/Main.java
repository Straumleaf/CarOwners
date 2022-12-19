import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Person persons =  new Person();

        car.setMake("Car_1");
        car.setPrice(1000);


        persons.setName("Name 1");
        persons.setCar(car);

        System.out.println(persons);

    }
}
