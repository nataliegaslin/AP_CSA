public class TextBook extends Book{
    public TextBook(String line){
        super(line);
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("subject: " + subject);
        System.out.println("edition: " + edition);
        
    }
}
