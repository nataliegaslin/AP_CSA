import java.io.*;
import java.util.Scanner;

abstract class Book{
    String title;
    String genre;
    String subject;
    int edition;
    Scanner sc = new Scanner(BookList.csv);
    
    public Book(){
        String bookLine = sc.nextLine();
        String [] words = bookLine.split(“,”);
    }
    public void printInfo(){
        title = words[0];
        genre = words[1];
        System.out.println(title + genre + subject + edition);
    }

    public String getTitle(){
        return title;
    }
}