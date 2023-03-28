public class Art{
    public static void main(String[] args){
System.out.println(containsArt ("rattrap", "similar", "today"));

System.out.println(containsArt ("start", "article", "Bart"));

System.out.println(containsArt ("harm", "chortle", "crowbar"));

System.out.println(containsArt ("matriculate", "carat", "arbitrary"));

System.out.println(containsArt ("darkroom", "cartoon", "articulate"));
    }

    public static boolean containsArt(String s1, String s2, String s3){
        String all = s1 + s2 + s3;
        return (all.indexOf("art") != 1);
    }
}