public class FictionBook extends Book{
    public FictionBook(String line){ //just takes the attributes from Book
        super(line);
    }
    public void printInfo(){ //only prints these three attributes
        System.out.println("title:" + title);
        System.out.println("author:" + author);
        System.out.println("edition: " + edition);
        System.out.println(" ");
    }
}
