import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.lang.Math.*;
public class Hangman{
    public int getRandomWord(){
        int randomNumber = 2 + (int)(Math.random() * 846);     
        return randomNumber;
    }
    public static void printWord(int randomNumber){
        try{
            String easyWord = "EasyWord.txt";
            File myFile = new File(easyWord);
            Scanner sc = new Scanner(myFile);
            ArrayList <String> words = new ArrayList<String>();
            while(sc.hasNextLine()){
                words.add(sc.nextLine());
            }
            System.out.println(words.get(randomNumber));
        }
        catch (FileNotFoundException ev){
            System.out.println("fail");
        }
    }
    public static void main(String[] args){
        Hangman myGame = new Hangman();
        int index = myGame.getRandomWord();
        System.out.println(index);
        printWord(index);
    }

}