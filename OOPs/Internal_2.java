import java.util.Scanner;

class Product {
     String name, company;
     int quantity, price;

    public Product(String name, String company, int quantity, int price) {
        this.name = name;
        this.company = company;
        this.quantity = quantity;
        this.price= price;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getQuantity() {
        return quantity;
    }
    public int getPrice(){
        return price;
    }
}

class Amazon {
    public static double calculateCost(Product product, boolean isHDFC) {
        double cost = product.getQuantity()*product.getPrice(); 
        if(isHDFC){
            cost = cost * 0.90;
        }
         if (cost > 50000) {
            cost *= 0.85; 
        } 
        return cost;
    }
}

class Flipkart {
    public static double calculateCost(Product product, boolean isRGUKTStudent) {
        double cost = product.getQuantity()*product.getPrice();

    
        if (isRGUKTStudent) {
            cost *= 0.7; 
        } else if (cost > 30000) {
            cost *= 0.95; 
        }

        return cost;
    }
}

public class Internal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter company name: ");
        String companyName = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
         System.out.print("Enter Price of the product: ");
        int price = scanner.nextInt();
        Product product = new Product(productName, companyName, quantity, price);
         System.out.println("Do you have HDFC card...? :");
        boolean isHDFC = scanner.nextBoolean();

        System.out.println("Are you an RGUKT student? :");
        boolean isRGUKTStudent = scanner.nextBoolean();

        double amazonCost = Amazon.calculateCost(product, isHDFC);
        double flipkartCost = Flipkart.calculateCost(product, isRGUKTStudent);

        System.out.println("Amazon cost: " + amazonCost);
        System.out.println("Flipkart cost: " + flipkartCost);

        if (amazonCost < flipkartCost) {
            System.out.println("Buy from Amazon!");
        } else {
            System.out.println("Buy from Flipkart!");
        }
    }
}
