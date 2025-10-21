import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction;

import java.io.File;
import java.io.IOException;

public class ReadData {

    int count = 0;

    public Song[] read() //switch void to Song[] if you need to return something
    {
        Scanner in;
        Song [] songs = new Song[28372];
        try
        {

            in = new Scanner (new File("songs 2025-2026 ANSI ; separated.csv"));
            in.nextLine(); //first row has names for data that column holds, can't parseInt on a set of words, need to skip this line
            while(in.hasNextLine())
            {
                String line = in.nextLine();
                String artist = line.split(";")[0];
                String title = line.split(";")[1];
                int year = Integer.parseInt(line.split(";")[2]);
                String genre = line.split(";")[3];
                int length = Integer.parseInt(line.split(";")[4]);
                double shakeability = Double.parseDouble(line.split(";")[5]);
                double obscenity =  Double.parseDouble(line.split(";")[6]);
                double danceability = Double.parseDouble(line.split(";")[7]);
                double loudness =  Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];

                songs[count] = new Song(artist, title, topic, genre, year, length, danceability, shakeability, obscenity, loudness);

                //System.out.println(count + ": " + line.split(";")[2]);
                count++;


                //add stuff in while true loop here 



            }
            in.close();
         
        }
        catch(IOException e)
        {
            System.out.println("Error in file reading");
        }
        
        return songs;
    }


    public int totalNumSongs (Song [] list)
    {
        return count;
    }


    public int numSongs1982 (Song [] list)
    {
        int numSongs1982 = 0;
        for (int i = 0; i < count; i++)
        {
            int year = list[i].getYear();
            if (year == 1982)
            {
                numSongs1982++;
            }
        }
        return numSongs1982;
    }


    public int numSongs2000 (Song [] list)
    {
        int numSongs2000 = 0;
        for (int i = 0; i < count; i++)
        {
            int year = list[i].getYear();
            if (year == 2000)
            {
                numSongs2000++;
            }
        }
        return numSongs2000;
    }


    public int numSongs2015 (Song [] list)
    {
        int numSongs2015 = 0;
        for (int i = 0; i < count; i++)
        {
            int year = list[i].getYear();
            if (year == 2015)
            {
                numSongs2015++;
            }
        }
        return numSongs2015;
    }

    
    public String getLongestTitle (Song [] list)
    {
    String titleLongest = "";

        for(int i = 0; i < count; i++)
        {
            String newTitle = list[i].getTitle();
            if(newTitle.length() > titleLongest.length())
            {
                titleLongest = newTitle;
            }
        }
        return titleLongest;
    }


    public int numSongsDanceable (Song [] list)
    {
    int numSongsDanceable = 0;

        for(int i = 0; i < count; i++)
        {
            double danceability = (list[i].getDanceability());
            if(danceability > .8)
            {
                numSongsDanceable++;
            }
        }
        return numSongsDanceable;
    }


    public int shakeLowest (Song [] list)
    {
    String shakeLowest = "";
    double shakeability1 = 0;
    
        for(int i = 0; i < count; i++)
        {
            double shakeability2 = (list[i].getShakeability());
            if(shakeability2 > shakeability1)
            {
                shakeability 
            }
        }
        return numSongsDanceable;
    }


    public String shakeLowest (Song [] list)
    {
    String shakeLowest = "";

        for(int i = 0; i < count; i++)
        {
            String newTitle = list[i].getShakeability();
            if(newTitle.length() > titleLongest.length())
            {
                shakeLowest = 
            }
        }
        return shakeLowest;
    }

}
