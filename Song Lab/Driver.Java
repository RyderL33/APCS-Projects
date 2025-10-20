    public class Driver {
        
        public static void main(String [] args)
        {
            ReadData r = new ReadData();
            Song [] list = r.read();


            
            //Song s = new Song();
            //s.getArtist();

            System.out.println("Total number of songs: " );
            System.out.println("Total number of songs from 1982: ");
            System.out.println("Total number of songs from 2000: ");
            System.out.println("Total number of songs from 2015: ");
            System.out.println("Number of songs with danceability ratings > 0.80: ");
            System.out.println("Song with largest length: " + r.getLongestTitle(list));
            System.out.println("Song with lowest shakeability score: ");
            System.out.println("Loudest song (song with the highest loudness rating): ");
            System.out.println("Average obscenity level in 50s: ");
            System.out.println("Average obscenity level in 60s: ");
            System.out.println("Average obscenity level in 70s: ");
            System.out.println("Average obscenity level in 80s: ");
            System.out.println("Average obscenity level in 90s: ");
            System.out.println("Average obscenity level in 00s: ");
            System.out.println("Average obscenity level in 10s: ");
            System.out.println("Average obscenity level in 20s: ");
            System.out.println("Number of songs with Michael Jackson in it: ");
            System.out.println("Number of songs with Whitney Houston in it: ");


            //Total number of songs
            //Total number of songs from 1982, 2000, 2015 (each separate reports)
            //How many songs have danceability ratings > 0.80
            //Song with largest len
            //Song with lowest shakeability score
            //Loudest song (song with the highest loudness rating)
            //Average obscenity level in each decade (1950-1959, 1960-1969, etc.)
            //How many songs have Michael Jackson in it? How many have Whitney Houston in it?
        }
    }
