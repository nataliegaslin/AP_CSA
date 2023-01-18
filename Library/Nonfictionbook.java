public class NonfictionBook extends Book{
    public NonfictionBook(String line){ //takes the attributes from the Book constructor
        super(line);
    }
    public void printInfo(){ //uses the same print method as Book does (doesn't add or remove any attributes)
        super.printInfo();
    }
}
