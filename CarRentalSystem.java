import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {
    private List<Car> cars; // list to store cars

    public CarRentalSystem() {
        cars = new ArrayList<>();
    }

    // Add a car
    public void addCar(Car car){
        cars.add(car);
    }

    // Remove a car by ID
    public void removeCar(int id){
        Car toRemove = null;
        for (Car car : cars) {
            if (car.getID() == id) {
                toRemove = car;
                break;
            }
        }
        if (toRemove != null) {
            cars.remove(toRemove);
        } else {
            throw new IllegalArgumentException("Car ID not found");
        }
    }

    // Get all cars (for GUI display)
    public List<Car> getCars(){
        return cars;
    }

    // Optional: display in console
    public void displayCars(){
        if(cars.isEmpty()){
            System.out.println("No cars available in the system.");
            return;
        }
        for(Car car : cars){
            System.out.println(car.toString());
        }
    }
}
