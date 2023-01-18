public class FictionBook extends Book{
    public FictionBook(String line){
        super(line);
    }
    public void printInfo(){
        System.out.println("title:" + title);
        System.out.println("author:" + author);
        System.out.println("edition: " + edition);
    }
}
