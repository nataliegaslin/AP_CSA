import java.util.Scanner;
import java.io.File;
public class LibraryMain{

    public static void main(String[] args){ //main method to add the books to myList and print the table (and sort them)
        BookList myList = new BookList();
        String bookListString = "";
        try{
            String listOfBooks = "BookList.csv";
            File myFile = new File(listOfBooks);
            Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            bookListString = sc.nextLine();
            String splitString[] = bookListString.split(",");
            if (splitString[1].equals("Fiction")){
                Book myBook = new FictionBook(bookListString);
                myList.addToList(myBook);
            }
            if (splitString[1].equals("Nonfiction")){
                Book myBook = new NonfictionBook(bookListString);
                myList.addToList(myBook);
            }
            if (splitString[1].equals("Textbook")){
                Book myBook = new TextBook(bookListString);
                myList.addToList(myBook);
            }
            
        }
        myList.sortList("Genre");
        myList.printTable();
        }
        catch(Exception e){
            System.out.println("That's a fail");
        }

    }
}