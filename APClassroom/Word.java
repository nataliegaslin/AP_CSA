import java.lang.*;
public class Word {
    public String scrambleWord(String word){
        for(int i : word){
            if(Character.isUpperCase(word.charAt(i))){
                return "Cannot scramble";
            }
        }
        return "yes";
    }
}