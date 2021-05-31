import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class App {

    // This is a class called Getdate
    static class Getdate {

        // it has a member variable constant for the format string
        public static final String FORMAT = "yyyy-MM-dd hh:mm:ss";

        // it has a member function that returns the date as a string
        public String getDateString() {
            Date date = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat(FORMAT);
            return dateFormat.format(date);
        }
    } 

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
        // creating an instance of Getdate and we are naming this instance mydate
        Getdate mydate = new Getdate();
        // calling the member function getDateString and saving it in s
        String d = mydate.getDateString();

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

