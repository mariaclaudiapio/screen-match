public class Main
{
    public static void main(String[] args)
    {
        Movie marieMovie = new Movie();
        marieMovie.name = "Harry Potter e a Pedra Filosofal";
        marieMovie.releaseYear = 2001;
        marieMovie.totalMinutes = 155;

        marieMovie.printTechnicalSheet();
        marieMovie.addReviews(8);
        marieMovie.addReviews(5);
        marieMovie.addReviews(10);
        marieMovie.addReviews(9);

        System.out.println(marieMovie.review);
        System.out.println(marieMovie.totalReviews);
        System.out.println(marieMovie.calculateAverage());
    }
}
