public class Textbook extends Book{
    public Textbook(String line){
        super(line);
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("subject: " + subject);
        System.out.println("edition: " + edition);
        
    }
}
