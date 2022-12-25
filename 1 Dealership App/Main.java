import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car cars[] = {
            new Car("Nissan", 5000, 2020, "Red", new String[] {"Tyres", "Keys"}),
            new Car("Dodge", 8500, 2019, "Navy Blue", new String[] {"Tyres", "Keys"}),
            new Car("Nissan", 5000, 2017, "Yellow", new String[] {"Tyres", "Filters"}),
            new Car("Honda", 7000, 2019, "Yellow", new String[] {"Tyres", "Filters"}),
            new Car("Mercedes", 12000, 2015, "Jet Black", new String[] {"Tyres", "Filters"}),
        };

        Dealership dealership = new Dealership(cars);

        Scanner scan = new Scanner(System.in);

        System.out.println("\n ****** JAVA DEALERSHIP! ***** \n");
        System.out.print("Welecome! Enter the type of car you are looking for: ");
        String make = scan.nextLine();

        System.out.print("Enter your budget: ");
        double budget = scan.nextDouble();

        int index = dealership.searchCar(make, budget);

        if(index == 404) {
            System.out.println("Feel free to browse through our collection of cars.\n");
            System.out.println(dealership);
        } else {
            scan.nextLine();
            String choice = scan.nextLine();
            if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
                dealership.sellCar(index);
            } else {
                System.out.println("\nIt was nice seeing you. Visit again please!\n");
            }
        }

        scan.close();
    }
}
