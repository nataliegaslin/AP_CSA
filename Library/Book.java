import java.lang.*;
import java.io.*;


abstract class Book{ //six instance fields
    String title;
    String genre;
    String subject;
    String author;
    int edition;
    int quantity;
    
    public Book(String line){ //creates an array that splits the input everywhere there's a comma
        String [] bookStuff = line.split(",");
        title = bookStuff[0];
        genre = bookStuff[1];
        author = bookStuff[2];
        subject = bookStuff[3];
        edition = Integer.parseInt(bookStuff[4]);
        quantity = 1;
    }
    public void printInfo(){ //prints out the general information for the books (besides TextBook)
        System.out.println("title:" + title);
        System.out.println("genre:" + genre);
        System.out.println("author:" + author);
        System.out.println(" ");
    }
    public void incQuantity(){ //setter method to increase quantity
        quantity++;
    }
    public void decQuantity(){ //setter method to decrease quantity
        quantity--;
    }
 public int getQuantity(){ //getter method to return quantity
        return quantity;
    }
    public String getTitle(){ //getter method to return title
        return title;
    }
    public int getEdition(){ //getter method to return edition
        return edition;
    }
    public String getSubject(){ //getter method to return subject
        return subject;
    }
    public String getAuthor(){ //getter method to return author
        return author;
    }
    public String getGenre(){ //getter method to return genre
        return genre;
    }

    public boolean equals(Book otherBook){ //checks if the books are the exact same 
        if(otherBook.title.equals(this.title) && otherBook.author.equals(author)&& otherBook.subject.equals(subject)&& otherBook.genre.equals(genre)&& otherBook.edition == edition){
                return true;
        }
        else{
            return false;
        }
    }
}
