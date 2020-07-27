import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

class Book{
    int bookId;
    String bookName, author, isbn;
    Book(int bookId, String bookName, String author, String isbn)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
    }
    static Book[] initData(){
        Book[] books = new Book[2];
        books[0] = new Book(1, "Deep Work", "Cal Newport","1111");
        books[1] = new Book(2, "Digital Minimalism", "Cal Newport","2222");
        return books;
    }   
    static void exportData(Book[] books,FileWriter bookData){
        String bookDataString  = "";
        for(int i = 0; i < books.length; i++)
        {
            bookDataString += books[i].bookId + "," +
                        books[i].bookName + "," +
                        books[i].author + "," +
                        books[i].isbn + "\n";
        }
        try{
            bookData.write(bookDataString.toCharArray());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

class CSVExport{
    public static void main(String[] args)
    {
        Book[] books = Book.initData();
        File f = new File("bookData.csv");
        try{
            FileWriter outFile = new FileWriter(f,true);
            Book.exportData(books,outFile);
            outFile.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}