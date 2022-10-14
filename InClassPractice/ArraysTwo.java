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
        int nums = 0;
        
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
            for(int j=0; j< numSongs-1; j++){
                if (nums < numSongs-1){
                    String a = songs[j];
                    String b = songs[j+1];
                    if (a.compareTo(b) == -1){
                        songs[nums] = a;
                        nums ++;
                } 
                }
                
            }

        for(String line : songs){
            System.out.println(line);
        }
      

        }
    
        catch(Exception e){
            e.printStackTrace();

            }        

}
}