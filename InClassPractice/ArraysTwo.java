import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArraysTwo {
    
    public static void main(String[] args) throws FileNotFoundException {
        File topForty = new File("./Top_40s_September_22.txt");
        try{
        Scanner myScanner = new Scanner(topForty);
        int fileLines = 0;

			
		while(myScanner.hasNextLine()){// does it have another line?
            myScanner.nextLine();
            fileLines ++;
        }

        
        String []artists = new String[40];
        String []songs = new String[40];
        myScanner = new Scanner(topForty);

        int numSongs = 0;
        int numArtists = 0;
        
        for (int i=0; i<fileLines; i++){
            if (i % 2 == 0) {
                songs[numSongs] = myScanner.nextLine();
                numSongs++;
            }
            else {
                artists[numArtists] = myScanner.nextLine();
                numArtists++;
            }

        }
            for(int j=0; j< numArtists-1; j++){
                int currentLowest = j;

                for(int k = j + 1; k < numArtists; k++){
                    if(artists[currentLowest].compareTo(artists[k]) > 0) {
                        currentLowest = k;
                    }
                }

            String temp = artists[j];
            artists[j] = artists[currentLowest];
            artists[currentLowest] = temp;
                
            }

        for(String line : artists){
            System.out.println(line);
        }
      

        }
    
        catch(Exception e){
            e.printStackTrace();

            }        

}
}