import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction;

import java.io.File;
import java.io.IOException;

public class ReadData {

    public Song[] read() //switch void to Song[] if you need to return something
    {
        Scanner in;
        Song [] songs = new Song[28372];
        try
        {
            int count = 1;
            in = new Scanner (new File("songs 2025-2026 ANSI ; separated.csv"));
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

            }
            in.close();
         
        }
        catch(IOException e)
        {
            System.out.println("Error in file reading");
        }
        
        return songs;
    }


    public String getLongestTitle (Song [] list)
    {
        String title = "";
        
        for(int i = 0; i < 28371; i++)
        {
            String newTitle = list[i].getTitle();
            if(newTitle.length() > title.length())
            {
                title = newTitle;
            }
        }
        return title;
    }

    public String getLoudest(Song [] list)
    {
        double loundess = 0;
        Song aSong = list[0]

        if(song[i].getLoudness() > aSong.loudness())
        {
            Song = song[i];
        }
        return loudness;
    }    


}
