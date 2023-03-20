import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.lang.Math.*;

public class Hangman{
    private String diff;
    private String theWord;
    private String hiddenWord = "";
    private int numBodyParts = 0;

    public Hangman (String difficulty){
        diff = difficulty;
        theWord = getWord(randNumber());
        for(int i = 0; i < theWord.length(); i++){
            hiddenWord += "_";
        }
    }

    public int randNumber(){
        if(diff == "easy"){
            int randomNumber = 2 + (int)(Math.random() * 846);     
            return randomNumber;
        }
        else if (diff == "medium"){
            int randomNumber = 1 + (int)(Math.random()* 218);
            return randomNumber;
        }
        else if (diff == "hard"){
            int randomNumber = 2 + (int)(Math.random()*211);
            return randomNumber;
        }
        else{
            return 0;
        }
    }

    public String getWord(int randomNumber){
        if(diff == "easy"){
            try{
                String easyWord = "EasyWord.txt";
                File myFile = new File(easyWord);
                Scanner sc = new Scanner(myFile);
                ArrayList <String> words = new ArrayList<String>();
                while(sc.hasNextLine()){
                    words.add(sc.nextLine());
                }
                return (words.get(randomNumber));
            }
            catch (FileNotFoundException ev){
                return null;
            }
        }
        else if(diff == "medium"){
            try {
                String mediumWord = "MediumWord.txt";
                File myFile = new File(mediumWord);
                Scanner sc = new Scanner(myFile);
                ArrayList <String> words = new ArrayList<String>();
                while(sc.hasNextLine()){
                    words.add(sc.nextLine());
                }

                return (words.get(randomNumber));

            }
            catch (FileNotFoundException ev){
                return null;
            }
        
        }
        else if(diff == "hard"){
            try {
                String hardWord = "HardWord.txt";
                File myFile = new File(hardWord);
                Scanner sc = new Scanner(myFile);
                ArrayList <String> words = new ArrayList<String>();
                while(sc.hasNextLine()){
                    words.add(sc.nextLine());
                }
                return (words.get(randomNumber));
            }
            catch (FileNotFoundException ev){
                return null;
            }
        }
        else{
            return "";
        }
    }

    public void addLetter(String letter){
        int startIndex = 0;
        while(theWord.indexOf(letter, startIndex) >= 0){
           int num = theWord.indexOf(letter, startIndex);
           String firstPart = hiddenWord.substring(0,num);
           String secondPart = hiddenWord.substring(num+1,hiddenWord.length());
           hiddenWord = firstPart + letter + secondPart;
           startIndex = num+1;
        }
    }
    public String returnTheWord(){
        return theWord;
    }

    public String returnHiddenWord(){
        return hiddenWord;
    }

    public int returnNumBodyParts(){
        return numBodyParts;
    }

    public static void main(String[] args){
        Hangman myGame = new Hangman("medium");
        Hangman myGame2 = new Hangman("medium");
        Hangman myGame3 = new Hangman("hard");
        System.out.println(myGame.returnTheWord());
        System.out.println(myGame.returnHiddenWord());
        myGame.addLetter("a");
        System.out.println(myGame.returnHiddenWord());
        myGame.addLetter("r");
        System.out.println(myGame.returnHiddenWord());
        myGame.addLetter("t");
        System.out.println(myGame.returnHiddenWord());
        myGame.addLetter("e");
        System.out.println(myGame.returnHiddenWord());
    }
}