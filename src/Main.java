public class Main
{
    public static void main(String[] args)
    {
        Movie marieMovie = new Movie();
        marieMovie.name = "Harry Potter e a Pedra Filosofal";
        marieMovie.releaseYear = 2001;
        marieMovie.totalMinutes = 155;

        System.out.println(marieMovie.name);
        System.out.println(marieMovie.releaseYear);
    }
}
