import java.util.*;

public class Main {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        boolean exit = false;

        //main working starting here

        System.out.println("============Welcome to the Car Rental System============");

        while(!exit){
            System.out.println("\n Please choose an option:");
            System.out.println("1. Add a car");
            System.out.println("2. Display all cars");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //consume newline

            switch(choice){
                case 1:
                    System.out.print("Enter Car ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); //consume newline

                    System.out.print("Enter Car Brand: ");
                    String brand = scanner.nextLine();

                    System.out.print("Enter Car Model: ");
                    String model = scanner.nextLine();

                    System.out.print("Enter Rent per Day: ");
                    double rentPerDay = scanner.nextDouble();
                    scanner.nextLine(); //consume newline

                    Car car = new Car(id, brand, model, rentPerDay);
                    carRentalSystem.addCar(car);
                    System.out.println("Car added successfully!");
                    break;

                case 2:
                    System.out.println("Displaying all cars:");
                    carRentalSystem.displayCars();
                    break;

                case 3:
                    exit = true;
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}