import java.util.*;

class book{
    String book_title, book_author;
    int book_count, isbn_no;
    Scanner sc=new Scanner(System.in);
    book (){
        System.out.println("enter book name: ");
        book_title=sc.next();
        System.out.println("enter book author: ");
        book_author=sc.next();
        System.out.println("enter book count: ");
        book_count=sc.nextInt();
    }
}

class Details{
    private ArrayList<book> books;
     Details(){
         books = new ArrayList<>();
     }
    void addStore(book b){

        books.add(b);
    }
    void getStore(){
        System.out.println("hello");
        for(book i: books)
            System.out.println(i.book_author + "  "+ i.book_title);
    }

}
class store{
    public static void main(String args[]){

       // System.out.println("enter no. of books: ");
       // Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        book b = new book();
        
        Details s = new Details();
        s.addStore(b);
        s.getStore();
    }
}