public class Palindrome {
    public static String reverseString(String str){
        String result = "";
        for(int h = str.length()-1; h > -1; h-=1){
            result += str.substring(h, h+1);
        }
        return result;

    }
    public static void palindromeChecker(String str){
        if (reverseString(str).equals(str)){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }
}
