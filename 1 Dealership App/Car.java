import java.util.Arrays;

public class Car {
    // fields
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // constructors
    public Car() {}

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    

    // getters
    public String getMake() { return this.make; }
    public double getPrice() { return this.price; }
    public int getYear() { return this.year; }
    public String getColor() { return this.color; }
    public String[] getParts() { return Arrays.copyOf(this.parts, this.parts.length); }

    // setters
    public void setMake(String make) { this.make = make; }
    public void setPrice(double price) { this.price = price; }
    public void setYear(int year) { this.year = year; }
    public void setColor(String color) { this.color = color; }
    public void setParts(String[] parts) { this.parts = Arrays.copyOf(parts, parts.length); }

    // to string
    public String toString() {
        return "Make: " + this.make + ".\n" 
            + "Price: " + this.price + ".\n" 
            + "Year: " + this.year + ".\n" 
            + "Color: " + this.color + ".\n" 
            + "Parts: " + Arrays.toString(this.parts) + ".\n";
    }
    
    // actions
    public void drive() {
        System.out.println("\nYou bought a beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }
}
