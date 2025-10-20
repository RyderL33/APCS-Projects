public class Song {

    private String artist, title, genre, topic;
    private int year, length;
    private double danceability, shakeability, obscenity, loudness;


    public Song(String artist, String title, String genre, String topic, int year, int length, double danceability, double shakeability, double obscenity, double loudness)
    {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.topic = topic;
        this.year = year;
        this.length = length;
        this.danceability = danceability;
        this.shakeability = shakeability;
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

    public String getTopic()
    {
        return topic;
    }

    public int getYear()
    {
        return year;
    }

    public int getLength()
    {
        return length;
    }

    public double getDanceability()
    {
        return danceability;
    }

    public double getShakeability()
    {
        return shakeability;
    }

    public double getObscenity()
    {
        return obscenity;
    }

    public double getLoudness()
    {
        return loudness;
    }
    

    

}
