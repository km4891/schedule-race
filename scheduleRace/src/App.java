import java.util.*;

public class App {
    public static class Cars {

        // cars is an arraylist, which is a member variable of this class
        ArrayList<String> cars = new ArrayList<String>();

        // access routines
        public void addCar(String s) {
            cars.add(s);
        }

        public void removeCar(String s) {
            cars.remove(s);
        }

        public void printCars() {
            for (int i = 0; i < cars.size(); i++) {
                System.out.println(cars.get(i));
            }
        }

    }

    public static void main(String[] args) {

        // here c is an instance of the Cars class that we create
        Cars c = new Cars();

        // notice the . indirection to get to the variout things in the class
        c.addCar("Volvo");
        c.addCar("BMW");
        c.addCar("Ford");
        c.addCar("Mazda");
        c.printCars();

        System.out.println("");
        c.removeCar("BMW");
        c.printCars();

    }

}

