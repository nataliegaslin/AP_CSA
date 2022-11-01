public class HiddenWord {
    String secretWord;
    HiddenWord(String word) {
        secretWord = word;
    }
    
    public String getHint(String guess){
        String returnWord = "";   
        for(int i = 0; i < guess.length() -1; i++){      
            if(guess.substring(i, i+1).equals(secretWord.substring(i, i+1))){

            }
                  
            
            else if(guess.substring(i, i+1).compareTo(secretWord.substring(i, i+1)) != 0){
                if(guess.substring(i, i+1).indexOf(secretWord) <= secretWord.length)
                    
            }
        }        