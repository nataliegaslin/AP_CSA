import java.util.*;
public class Word {
    public static String scrambleWord(String word){
        int i = 0;
        while(i < word.length() -1){
            if(word.substring(i, i+1).compareTo("A") == 0){
                if(word.substring(i+1, i+2).compareTo("A") == 0){
                    i++;
                }
                else if(word.substring(i+1, i+2).compareTo("A") != 0){
                    word = word.substring(0, i) + word.substring(i+1, i+2) + word.substring(i, i+1) + word.substring(i+2);
                    i+=2;
                }
            }
            else {
                i++;
            }
        }
        return word;
    }
    
    public static void scrambleOrRemove(List <String> wordList){
        for(int h = wordList.size() -1; h > -1; h--){
            String scrambled = scrambleWord(wordList.get(h));
            if(wordList.get(h).equals(scrambled)){
                wordList.remove(h);
            }
            else{
                wordList.set(h, scrambled);
            }
        }
    }

    public static void main (String[] args){
        System.out.println(scrambleWord("NATALIE"));
    }
}
