public class Store {
    Movie[] movies;

    // constructors
    public Store() {
        this.movies = new Movie[10];
    }

    public Store(Movie[] movies) {
        this.movies = new Movie[movies.length];

        for (int i = 0; i < movies.length; i++) {
            this.movies[i] = new Movie(movies[i]);
        }
    }


    // getters
    public Movie getMovie(int index) {
        return new Movie(movies[index]);
    }

    // setters
    public void setMovie(int index, Movie movie) {
        movies[index] = new Movie(movie);
    }

    // to string
    public String toString() {
        String temp = "";

        for (int i = 0; i < this.movies.length; i++) {
            if(this.movies[i] == null) continue;

            temp += this.movies[i].toString() + "\n";
        }

        return temp;
    }
}
