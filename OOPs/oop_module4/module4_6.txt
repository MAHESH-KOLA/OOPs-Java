import java.util.Scanner;

class Product {
    private String name;
    private String company;
    private int quantity;

    public Product(String name, String company, int quantity) {
        this.name = name;
        this.company = company;
        this.quantity = quantity;
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
}

class Amazon {
    public static double calculateCost(Product product) {
        double cost = product.getQuantity() * 100; // Assuming cost per unit is 100 (for demonstration purposes)

        // Applying discounts for Amazon
        if (cost > 50000) {
            cost *= 0.85; // 15% discount for purchase above 50,000
        } else {
            cost *= 0.9;  // 10% discount for HDFC credit card holders
        }

        return cost;
    }
}

class Flipkart {
    public static double calculateCost(Product product, boolean isRGUKTStudent) {
        double cost = product.getQuantity() * 100; // Assuming cost per unit is 100 (for demonstration purposes)

        // Applying discounts for Flipkart
        if (isRGUKTStudent) {
            cost *= 0.7; // 30% discount for RGUKT students
        } else if (cost > 30000) {
            cost *= 0.95; // 5% discount for purchase above 30,000
        }

        return cost;
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name:");
        String productName = scanner.nextLine();

        System.out.println("Enter company name:");
        String companyName = scanner.nextLine();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        Product product = new Product(productName, companyName, quantity);

        System.out.println("Are you an RGUKT student? (true/false):");
        boolean isRGUKTStudent = scanner.nextBoolean();

        double amazonCost = Amazon.calculateCost(product);
        double flipkartCost = Flipkart.calculateCost(product, isRGUKTStudent);

        System.out.println("Amazon cost: " + amazonCost);
        System.out.println("Flipkart cost: " + flipkartCost);

        if (amazonCost < flipkartCost) {
            System.out.println("Buy from Amazon for a cost-effective deal!");
        } else {
            System.out.println("Buy from Flipkart for a cost-effective deal!");
        }
    }
}
