import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Random;
public class Hangman{
     public static int randomWord(){
        Random rand = new Random();
        int upperbound = 41;
        int lowerbound = 0;
        int randomNumber = rand.nextInt(upperbound);
        return randomNumber;
    }

    public static void letterGuess(){
        String input = "";
        System.out.println("Please guess a letter.");
        switch(input){
                case "a":
                    
                case "2":
                    passed = runTestTwo();
                    break;
                case "3":
                    passed = runTestThree();
                    break;
                case "e":
                    System.exit(0);
                default:
                    System.out.println("Please enter in a valid input.");
            }
    }

    public static void printWord(){
    
    }

    public static void main (String[] args) throws FileNotFoundException{
        File words = new File ("HangmanWords");
        Scanner myScanner = new Scanner(words);
        int fileLines = 0;

        while(myScanner.hasNextLine()){// does it have another line?
            myScanner.nextLine();
            fileLines ++;
        }

        String [] hangman = new String[fileLines];
        myScanner = new Scanner(words);

        for (int j=0; j<fileLines; j++){
            hangman[j] = myScanner.nextLine();


        }
        int i = randomWord();
        int n = hangman[i].length();
        System.out.println("Your word has " + n + " letters.");
        letterGuess();
            }

}