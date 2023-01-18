public class TextBook extends Book{
    public TextBook(String line){ //takes the constructor from Book
        super(line);
    }

    public void printInfo(){ //prints the info from Book, but adds subject and edition
        super.printInfo();
        System.out.println("subject: " + subject);
        System.out.println("edition: " + edition);
        
    }
}
