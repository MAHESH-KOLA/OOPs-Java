import java.util.*;
class book{
    String book_title, book_author;
    int book_count, isbn_no;
    Scanner sc=new Scanner(System.in);
    void setDetails(){
        System.out.println("enter book name: ");
        book_title=sc.next();
        System.out.println("enter book author: ");
        book_author=sc.next();
        System.out.println("enter book count: ");
        book_count=sc.nextInt();
    }
    void reduceCount(){
        book_count-=1;
    }
     boolean isAvailable(){
        return book_count>0;
    }
    void viewDetails(){
         System.out.println(book_title +"   " +book_author +"  "+ book_count);
    }
}
class customer{
    String user_name, password, customer_id, customer_name, customer_Address;
    Scanner sc=new Scanner(System.in);
     customer(){
         System.out.println("enter customer user name: ");
        user_name=sc.next();
         System.out.println("enter customer password: ");
        password=sc.next();
        System.out.println("enter customer id: ");
        customer_id=sc.next();
        System.out.println("enter customer name: ");
        customer_name=sc.next();
        System.out.println("enter customer address: ");
        customer_Address=sc.next();
    }
    
}
class internal_1{
    public static void main(String args[]){

        System.out.println("enter no. of books: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        book b[] = new book[n];
        for(int i=0;i<n;i++){
            b[i] = new book();
            b[i].setDetails();
        }
         int cust_count=0;
           System.out.println("enter no. of customers: ");
         int cust=sc.nextInt();
          customer c[] = new customer[cust];
         for(int i=0;i<cust;i++){
             c[i] = new customer();
         }
       // System.out.println("Do you want to buy book:\n 1 - buy \n 0 - not buy");
        int option=1;
        while(option!=0){
            System.out.println("1 - search \n 2 - buy \n 3 - display \n 0 - exit");
            option = sc.nextInt();
        // System.out.println("enter the details of customer..");
        // c[cust_count]=new c();
        switch(option){
        case 1:
            System.out.println("enter book name that you want to search.."); 
            String book = sc.next();
            int flag=0;
            for(int i=0;i<n;i++){
                if(b[i].book_title.equals(book) && b[i].book_count>0){
                    flag=1;
                    break;
                }
            }
            if(flag==1)
              System.out.println(book + " is available on book stall");
            else
               System.out.println(book + " is not available on book stall");
            break;
        case 2:
            System.out.println("enter book name"); 
            String name=sc.next();
            int isAvail=0;
            for(int i=0;i<n;i++){
                if(b[i].book_title.equals(name) && b[i].book_count>0){
                    b[i].reduceCount();
                    b[i].viewDetails();
                    isAvail=1;
                    break;
            }
        }
        if(isAvail==0){
            System.out.println("Sorry" + name + "is not available on book stall");
        }
        break;
        case 3:
        System.out.println("Displaying of books: ");
           for(int i=0;i<n;i++){
        System.out.println(b[i].book_title+"     "+b[i].book_count);
        }
        break;
        case 0:
          option=0;
          break;
         default:
           System.out.println("please choose correct option: ");
           break;
          
        // System.out.println("Do you want to buy book:\n 1 - buy \n 0 - not buy");
        // option=sc.nextInt();
        // break;
    }
}
    System.out.println("Final books available on book stall");
    for(int i=0;i<n;i++){
        System.out.println(b[i].book_title+"     "+b[i].book_count);
    }
}
}