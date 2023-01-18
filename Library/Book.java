import java.lang.*;
import java.io.*;


abstract class Book{
    String title;
    String genre;
    String subject;
    String author;
    int edition;
    int quantity;
    
    public Book(String line){
        String [] bookStuff = line.split(",");
        title = bookStuff[0];
        genre = bookStuff[1];
        author = bookStuff[2];
        subject = bookStuff[3];
        edition = Integer.parseInt(bookStuff[4]);
        quantity = 1;
    }
    public void printInfo(){
        System.out.println("title:" + title);
        System.out.println("genre:" + genre);
        System.out.println("author:" + author);
    }
    public void incQuantity(){
        quantity++;
    }
    public void decQuantity(){
        quantity--;
    }
 public int getQuantity(){
        return quantity;
    }
    public String getTitle(){
        return title;
    }
    public int getEdition(){
        return edition;
    }
    public String getSubject(){
        return subject;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }

    public boolean equals(Book otherBook){
        if(otherBook.title.equals(this.title) && otherBook.author.equals(author)&& otherBook.subject.equals(subject)&& otherBook.genre.equals(genre)&& otherBook.edition == edition){
                return true;
        }
        else{
            return false;
        }
    }
}
