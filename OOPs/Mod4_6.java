import java.util.Scanner;

class Product{
    String product_name, product_company;
    int quantity;
    double  price;

    Product(String product_name, String product_company, int quantity, double price){
        this.product_name = product_name;
        this.product_company= product_company;
        this.quantity = quantity;
        this.price = price;
    }
}

class Amazon extends Product{
    Scanner sc = new Scanner(System.in);
    Amazon(String product_name, String product_company, int quantity, double price){
        super(product_name, product_company, quantity, price);
    }
        double findMoney(){
            double cost = super.quantity *  super.price;
            System.out.println("is you have HDFC card");
            boolean b=sc.nextBoolean();
            if(b){
                cost =0.90*cost;
            }
            if(cost>50000){
                cost=0.85*cost;
            }
            return cost;
        }
}

class Flipkart extends Product{
    Scanner sc = new Scanner(System.in);
     Flipkart(String product_name, String product_company, int quantity, double price){
         super(product_name, product_company, quantity, price);
     }
        double findMoney(){
            double cost = super.quantity *  super.price;
            System.out.println("is you are RGUKT student");
            boolean b=sc.nextBoolean();
            if(b){
                cost = 0.7*cost;
            }
            if(cost>30000){
                cost=0.95*cost;
            }
            return cost;
        }
}

public class Mod4_6 {
    public static void main(String[] args) {
        
   // Product P = new Product("mobile","honor",2,25000);
    Amazon A = new Amazon("mobile","honor",2,20000);
    Flipkart F = new Flipkart("mobile","honor",2,20000);
    if(A.findMoney()<F.findMoney()){
        System.out.println("buy from Amazon");
    }
    else{
        System.out.println("buy from Flipkart");
    }
    }
}