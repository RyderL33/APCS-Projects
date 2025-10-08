import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadData {

    public void read()
    {
        Scanner in;
        try
        {
            int count = 1;
            int nameLength = 0;
            String longestName = "";
            in = new Scanner (new File("songs 2025-2026 ANSI.csv"));
            while(in.hasNextLine())
            {
                String line = in.nextLine();
                System.out.println(count + ": " + line.split(",")[0]);
                count++;

                // find longest artist name
                if (line.length() > nameLength)
                {
                    nameLength = line.length();
                    longestName = line;
                }
            }
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("Longest Artist Name: " + longestName + ", Number of Characters: "+ nameLength);
            // need to add function to print string of longest name above
            in.close();
         
        }
        catch(IOException e)
        {
            System.out.println("Error in file reading");
        }
        
    }
}
