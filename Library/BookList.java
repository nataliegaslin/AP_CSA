import java.util.ArrayList;
public class BookList{
    ArrayList <Book> bookList = new ArrayList<Book>();
    
    public void addToList(Book newBook){ //adds a book to the arraylist
        boolean isItAMatch = false;
        for(Book line : bookList){
            if(newBook.equals(line) == true){
                isItAMatch = true;
                line.incQuantity();
            }
        }
        if (isItAMatch != true){
            bookList.add(newBook);
        
        }
   }
    public void removeFromList(Book oldBook){ //removes a book from the arraylist
        boolean isItAMatch = false;
        for(Book line : bookList){
            if(oldBook.equals(line)){
                isItAMatch = true;
                line.decQuantity();
            }
        }
        if (isItAMatch == true && oldBook.getQuantity() < 1){ //increases the quantity if the books are exactly the same
            bookList.remove(oldBook);
        }
   }

    public void sortList(String sorting_method){ //sorts the books alphabetically (depending on input)
        String testingMet = "";
        int currentLowest;
        String lowestString = "";
       
        for(int r = 0; r<bookList.size()-1; r++) {
            currentLowest = r;
            for(int j = r+1; j<bookList.size(); j++) {
                if(sorting_method.equals("Title")){
                    testingMet = bookList.get(j).getTitle();
                    lowestString = bookList.get(currentLowest).getTitle();
                }
                else if(sorting_method.equals("Author")){
                    testingMet = bookList.get(j).getAuthor();
                    lowestString = bookList.get(currentLowest).getAuthor();
                }
                else if(sorting_method.equals("Genre")){
                    testingMet = bookList.get(j).getGenre();
                    lowestString = bookList.get(currentLowest).getGenre();
                }
                else if(sorting_method.equals("Subject")){
                    testingMet = bookList.get(j).getSubject();
                    lowestString = bookList.get(currentLowest).getSubject();
                    if(bookList.get(j).getSubject().equals("N/A")){ //for those without a subject
                        testingMet = "";
                    }
                }
                if(testingMet.compareTo(lowestString) < 0){
                    currentLowest = j;
                }
            
            }
            Book temp = bookList.get(r);
            bookList.set(r, bookList.get(currentLowest)); //changes the bookList by adding the lowest values first 
            bookList.set(currentLowest, temp);
        }
    }
    public void printTable(){ //prints out the table
            System.out.println(" ______________________________________________________________________________________");
            System.out.println("| Title                     | Genre    | Author            | Subject   | Edition |QTY|");
            System.out.println("|---------------------------|----------|-------------------|-----------|---------|---|");
            for(int i = 0; i < bookList.size(); i++){
                String tableTitle = bookList.get(i).getTitle();
                int numSpaceTitle = 27 - tableTitle.length(); //longest title is 27
                for(int j = 0; j < numSpaceTitle; j ++){
                    tableTitle += " ";
                }
                String tableAuthor = bookList.get(i).getAuthor();
                int numSpaceAuthor = 19 - tableAuthor.length(); //longest author is 19
                for(int j = 0; j < numSpaceAuthor; j ++){
                    tableAuthor += " ";
                }
                String tableGenre =  bookList.get(i).getGenre();
                int numSpaceGenre = 10 - tableGenre.length(); //longest genre is 10
                for(int j = 0; j < numSpaceGenre; j ++){
                    tableGenre += " ";
                }
                String tableSubject = bookList.get(i).getSubject();
                if(tableSubject.equals("")){
                    tableSubject += "N/A";
                }
                int numSpaceSubject = 11 - tableSubject.length(); //longest subject is 11
                for(int j = 0; j < numSpaceSubject; j ++){
                    tableSubject += " ";
                }
                int tableEdition = bookList.get(i).getEdition();
                String tableEditionString = "";
                if(tableEdition < 10){
                    tableEditionString = "" + tableEdition; //adds tableEdition as a string
                    tableEditionString += "        ";
                }
                else{
                    tableEditionString = "" + tableEdition;
                    tableEditionString += "       ";
                }
                int tableQuantity = bookList.get(i).getQuantity();
                System.out.print("|" + tableTitle);
                System.out.print("|" + tableGenre);
                System.out.print("|" + tableAuthor);
                System.out.print("|" + tableSubject);
                System.out.print("|" + tableEditionString);
                System.out.println("|" + tableQuantity + "  " + "|");
                
            }
            System.out.println("|------------------------------------------------------------------------------------|");

    }
        
   
}
