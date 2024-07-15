import java.util.*;
class book{
    String book_name, book_author;
    int book_count;
    Scanner sc=new Scanner(System.in);
    void setDetails(){
        System.out.println("enter book name: ");
        book_name=sc.next();
        System.out.println("enter book author: ");
        book_author=sc.next();
        System.out.println("enter book count: ");
        book_count=sc.nextInt();
    }
    void reduceCount(){
        book_count-=1;
    }
    void viewDetails(){
         System.out.println(book_name +"   " +book_author +"  "+ book_count);
    }
}
class customer extends book{
    String customer_id, customer_name, customer_Address;
    Scanner sc=new Scanner(System.in);
    void setDetails(){
        System.out.println("enter customer id: ");
        customer_id=sc.next();
        System.out.println("enter customer name: ");
        customer_name=sc.next();
        System.out.println("enter customer address: ");
        customer_Address=sc.next();
    }
    
}
class book_stall{
    public static void main(String args[]){

        System.out.println("enter no. of books: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        book b[] = new book[n];
        for(int i=0;i<n;i++){
            b[i] = new book();
            b[i].setDetails();
        }
         customer c[] = new customer[n];
        System.out.println("Do you want to buy book:\n 1 - buy \n 0 - not buy");
        int option=sc.nextInt();
        while(option!=0){
            System.out.println("enter book name"); 
            String name=sc.next();
        for(int i=0;i<n;i++){
            if(b[i].book_name.equals(name)){
                b[i].reduceCount();
                b[i].viewDetails();
            }
        }
        System.out.println("Do you want to buy book:\n 1 - buy \n 0 - not buy");
        option=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(b[i].book_name+"     "+b[i].book_count);
    }
}
}