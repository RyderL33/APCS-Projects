public class Song {

    private String artist, title, genre;
    private int year;
    private double danceability;

    public Song(String artist, String title, String genre, int year, double danceability)
    {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.danceability = danceability;
    }

    public String getArtist()
    {
        return artist;
    }

    
}
