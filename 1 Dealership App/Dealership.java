public class Dealership {
    private Car[] cars;

    // constructors
    public Dealership() {}

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];

        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    // getters 
    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    // setters
    public void setCar(Car car, int index) {
        cars[index] = new Car(car);
    }

    // to String
    public String toString() {
        String temp="";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + (i+1) + "\n";

            if(this.cars[i] == null) {
                temp+= "Empty for this parking spot.\n\n";
                continue;
            }

            temp+=this.cars[i].toString()+"\n";
        }

        return temp;
    }

    // actions
    public void sellCar(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public int searchCar(String make, double budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if(this.cars[i] == null) { continue; }
            if(this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget ) {
                System.out.println("\nWe found a car in spot " + i + ":\n\n" + this.cars[i].toString());
                System.out.print("If you're intrested type 'yes': ");

                return i;
            }
        }
        
        System.out.println("\nYour search didn't match any results. \n");
        return 404;
    }


}
