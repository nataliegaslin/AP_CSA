public interface BookList extends Book{
    ArrayList <Book> bookList = new ArrayList<Book>();
    Scanner sc = new Scanner(BookList.csv);
    

    public void addToList(Book newBook){
        while(sc.hasNextLine){
            String bookWords = sc.nextLine();
            if(bookWords.substring(","+1, ",").equals("Fiction")){
                bookList.add(new Fictionbook)
            }
        }
   }
}