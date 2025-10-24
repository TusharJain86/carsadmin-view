public class Car{
    private int id;
    private String brand;
    private String model;
    private double rentPerDay;

    public Car(int id, String brand, String model, double rentPerDay){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    //getter and setter methods
    public int getID(){return id;}
    public void setID(int id){this.id = id;}

    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}

    public String getModel(){return model;}
    public void setModel(String model){this.model = model;}

    public double getRentPerDay(){return rentPerDay;}
    public void setRentPerDay(double rentPerDay){this.rentPerDay = rentPerDay;}

    //toString method
    @Override
    public String toString(){
        return "Car ID: " + id + ", Brand: " + brand + ", Model: " + model + ", Rent per Day: $" + rentPerDay;
    }

}