import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadData {

    public void read()
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
                String year = line.split(";")[2];



                songs[count] = new Song (artist, title, year);

                System.out.println(count + ": " + line.split(";")[2]);
                count++;

            }
            in.close();
         
        }
        catch(IOException e)
        {
            System.out.println("Error in file reading");
        }
        
    }
    
}
