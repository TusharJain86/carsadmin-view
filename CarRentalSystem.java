import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    //this is the class for the Car Rental System

    private List<Car> cars; //list to store cars

    public CarRentalSystem() {
        cars = new ArrayList<>();
    }

    //method to add a car to the system
    public void addCar(Car car){
        cars.add(car);
    }

    //method to display all cars
    public void displayCars(){

        //check if there are no cars
        if(cars.isEmpty()){
            System.out.println("No cars available in the system.");
            return;
        }

        else{
            //using for-each loop to iterate through the list of cars
            for(Car car : cars){
                System.out.println(car.toString());
            }
        }
    }
}