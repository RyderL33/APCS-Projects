public class Song {

    private String artist, title, genre, topic;
    private int year, length;
    private double danceability, shakeness, obscenity, loudness;


    public Song(String artist, String title, String genre, String topic, int year, int length, double danceability, double shakeness, double obscenity, double loudness)
    {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.topic = topic;
        this.year = year;
        this.length = length;
        this.danceability = danceability;
        this.shakeness = shakeness;
        this.obscenity = obscenity;
        this.loudness = loudness;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getYear()
    {
        return year;
    }
    

}
