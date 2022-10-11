import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Random;
public class Hangman{
    public static void main (String[] args) throws FileNotFoundException{
        File words = new File ("HangmanWords");
        Scanner myScanner = new Scanner(words);
        int fileLines = 0;

        while(myScanner.hasNextLine()){// does it have another line?
            myScanner.nextLine();
            fileLines ++;
        }

        String [] lines = new String[fileLines];
        myScanner = new Scanner(words);
        for (int i = 1; i<randomWord(); i++){
            lines[i] = myScanner.nextLine();
            if i == randomWord(){
                System.out.println(i);
            }


        }

    }
    public static int randomWord(){
        Random rand = new Random();
        int upperbound = 41;
        int lowerbound = 0;
        int randomNumber = rand.nextInt(upperbound);
        return randomNumber;
    }
}