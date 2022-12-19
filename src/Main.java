import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        ArrayList<Person> persons = new ArrayList<>();
        Person[] person = new Person[6];

        String[] carMake = {"Car_1","Car_2","Car_3","Car_2", null, null};
        String[] personName = {"Name 1","Name 2","Name 3","Name 4","Name 5","Name 6"};
        int[] carPrices = { 1000, 2000, 10000, 2000, 0, 0};

        for (int i=0; i<=5; i++) {
            car.setMake(carMake[i]);
            car.setPrice(carPrices[i]);

            person[i].setName(personName[i]);
            person[i].setCar(car);

        }

        System.out.println(person);

    }
}
