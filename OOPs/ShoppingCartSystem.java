import java.util.*;

interface Product{
    public String getProductName();
    public double getPrice();
}

class Book implements Product{
    String product_name, author;
    double price;
    Scanner sc = new Scanner(System.in);
    Book(){
        System.out.println("enter product_name: ");
        product_name=sc.next();
        System.out.println("enter author_name: ");
        author=sc.next();
        System.out.println("enter price : ");
        price=sc.nextDouble();
    }
    public String getProductName(){
        return this.product_name;
    }
    public double getPrice(){
        return this.price;
    }
}

class Electronics implements Product{
    String product_name, manufacturer;
    double price;
    Scanner sc = new Scanner(System.in);
    Electronics(){
         System.out.println("enter product_name: ");
        product_name=sc.next();
        System.out.println("enter manufactures_name: ");
        manufacturer=sc.next();
        System.out.println("enter price : ");
        price=sc.nextDouble();
    }
    public String getProductName(){
        return this.product_name;
    }
    public double getPrice(){
        return this.price;
    }
}
class ShoppingCart{
     private static ArrayList<Book> book_cart = new ArrayList<Book>();
     private static ArrayList<Electronics> electronics_cart = new ArrayList<Electronics>();
     ShoppingCart(){

      }
    public void AddedBook(Book b){
        System.out.println("Added book:     " +b.product_name +" "+ b.author + " "+ b.price);
    }
     public void AddedElectronic(Electronics e){
         System.out.println("Added book:     " +e.product_name +" "+ e.manufacturer + " "+ e.price);
     }
    public void AddToCart_book(Book b){
            book_cart.add(b);
    }
     public void AddToCart_electronics(Electronics e){
             electronics_cart.add(e);
     }
    public void showCart(){
        System.out.println("Books: " + book_cart.size());
        for(Book b: book_cart){
            System.out.println(b.product_name);
        }
         System.out.println("Electronics: ");
         for(Electronics e : electronics_cart){
             System.out.println(e.product_name);
         }

    }
    public  void TotalPrice(){
        double sum=0;
        for(Book b: book_cart){
            sum+=b.price;
        }
         for(Electronics e : electronics_cart){
             sum+=e.price;
         }
         System.out.println("total price of items that are in cart: ");
         System.out.println(sum);
    }
}

class ShoppingCartSystem{
    public static void main(String[] args) {
        Book b[] = new Book[10];
        Electronics e[] = new Electronics[10];
        ShoppingCart s[] = new ShoppingCart[20];
        int bc=0, ec=0,scc=0;
        Scanner sc  = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n\n");
            System.out.println("enter following numbers to do your required operations: \n 1 - To add book \n 2 - To add Electronic item \n 3 - To display cart \n 4 - To display amount \n 0 - exit");
            choice = sc.nextInt();
            s[scc] = new ShoppingCart();
            switch(choice){
            case 1:
                System.out.println("enter details of book: ");
                b[bc] = new Book();
             //   s[scc] = new ShoppingCart();
                s[scc].AddedBook(b[bc]);
                s[scc].AddToCart_book(b[bc]);
                s[scc].showCart();
                scc++;
                bc++;
                break;
            case 2:
                System.out.println("enter details of electronic item: ");
              e[ec] = new Electronics();
             // s[scc] = new ShoppingCart();
              s[scc].AddedElectronic(e[ec]);
              s[scc].AddToCart_electronics(e[ec]);
              s[scc].showCart();
              ec++;
              scc++;
              break;
            case 3:
                System.out.println("Details: ");
               s[0].showCart();
               break;
            case 4:
                s[0].TotalPrice();
                break;
            case 0:
              System.out.println("exited...");
              break;
            default:
              System.out.println("please give correct input..");
            }

        }while(choice!=0);
    System.out.println("Thank you");
    }
}

