import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Movie[] movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        // for (int i = 0; i < movies.length; i++) {
        //     System.out.println(movies[i].toString());
        // }

        Store store = new Store(movies);

        System.out.println(store.toString());

        

        Scanner scan = new Scanner(System.in);
        while(true) {

            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int index = scan.nextInt();
            Movie editMovie = store.getMovie(index);

            System.out.print("Set a new rating for " + editMovie.getName() + ": ");
            double editRating = scan.nextDouble();

            editMovie.setRating(editRating);
            store.setMovie(index, editMovie);

            System.out.println(store.toString());

            System.out.print("To edit another rating, type: 'continue': ");
            String choice = scan.next();
            if( !choice.equalsIgnoreCase("continue") ) {
                System.out.println("\nThanks for visiting our store. Visit again ;)\n");
                break;
            } 
        }        
        scan.close();
    }
}
