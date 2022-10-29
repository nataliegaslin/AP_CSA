public class Word {
    public String scrambleWord(String word){
        int i = 0;
        while(i < word.length() -1){
            if(word.substring(i, i+1).compareTo("A") == 0){
                if(word.substring(i+1, i+2).compareTo("A") == 0){
                    i++;
                }
                else if(word.substring(i+1, i+2).compareTo("A") != 0){
                    word = word.substring(i+1, i+2) + word.substring(i, i+1) + word.substring(i+2);
                    i+=2;
                }
            }
            else {
                i++;
            }
        }
        return word;
}
