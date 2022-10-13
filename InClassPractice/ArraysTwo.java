import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

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
        
        for (int i=0; i<fileLines; i++){
            if (i % 2 == 0) {
                songs[i] = myScanner.nextLine();
            }
            else {
                artists[i] = myScanner.nextline();
            }
           
        }
    

        }
    
        catch(Exception e){
            System.out.println("failure :(");

            }        

}
}