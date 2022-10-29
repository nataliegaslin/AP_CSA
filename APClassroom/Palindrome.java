public class Palindrome {
    public static String removeSpaces(String str){
        for(int b = 0; b <str.length(); b++){
            if(!str.substring(b, b+1).equals(" ")){
                result += str.substring(i, i+1);
            }
        }
        return result;
    }
    public static String reverseString(String str){
        removeSpaces(str);
        String result = "";
        for(int h = str.length()-1; h > -1; h-=1){
            result += str.substring(h, h+1);
        }
        return result;

    }
    public static void palindromeChecker(String str){
        removeSpaces(str);
        if (reverseString(str).equals(str)){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }
}
