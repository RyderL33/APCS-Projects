import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadData {

    public void read()
    {
        Scanner in;
        try
        {
            in = new Scanner (new File("songs 2025-2026.csv"));
            while(in.hasNextLine())
            {
                System.out.println(in.nextLine());
            }
            in.close();
        }
        catch(IOException e)
        {
            System.out.println("Error in file reading");
        }
        
    }
}
