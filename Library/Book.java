import java.io.*;
import java.util.Scanner;

abstract class Book{
    String title;
    String genre;
    String subject;
    int edition;
    
    public Book(){

    }
    public void printInfo(){
        System.out.println(title + genre + subject + edition);
    }

    public String getTitle(){
        return title;
    }
}