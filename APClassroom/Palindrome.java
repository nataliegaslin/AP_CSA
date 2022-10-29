public class Palindrome {
    public static String removeSpaces(String str){
        String result = "";
        for(int b = 0; b <str.length(); b++){
            if(!str.substring(b, b+1).equals(" ")){
                result += str.substring(i, i+1);
            }
        }
        return result;
    }
    public static String reverseString(String str){
        String word = removeSpaces(str);
        String result = "";
        for(int h = word.length()-1; h > -1; h-=1){
            result += word.substring(h, h+1);
        }
        return result;

    }
    public static void palindromeChecker(String str){
        String newWord = removeSpaces(str);
        if (reverseString(newWord).equals(newWord)){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }
}
