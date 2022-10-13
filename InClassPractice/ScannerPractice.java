import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class ScannerPractice {
    
    public static void main(String[] args) throws FileNotFoundException {
        File topForty = new File("./Top_40s_September_22.txt");
        try{
        Scanner myScanner = new Scanner(topForty);
        int fileLines = 0;
        //String first = ((line).substring(0,1));
        //System.out.println(first);

			
		while(myScanner.hasNextLine()){// does it have another line?
            myScanner.nextLine();
            fileLines ++;
        }

        
        String []lines = new String[fileLines];
        myScanner = new Scanner(topForty);

        for (int i=0; i<fileLines; i++){
            lines[i] = myScanner.nextLine();
            System.out.println(lines);
        }

         // for(int i =0; i<lines.length; i++){
            //lines[i] = lines[i].substring(0,(lines[i].length())/2);
    

        for(String line : lines){
            System.out.println(line);
        }
        }
    
        catch(Exception e){
            System.out.println("failure :(");

            }        

}
}
