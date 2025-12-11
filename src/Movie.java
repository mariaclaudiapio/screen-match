public class Movie
{
    String name;
    int releaseYear;
    boolean included;
    double review;
    int totalReviews;
    int totalMinutes;

    // Métodos
    void printTechnicalSheet()
    {
        System.out.println(name);
        System.out.println(releaseYear);
    }

    void addReviews(double note)
    {
        review += note;
        totalReviews++;
    }

    double calculateAverage()
    {
        return review / totalReviews;
    }
}
