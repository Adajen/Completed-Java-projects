import java .util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Product product = new Product("Banana", 1.1, 13);
        product.printProduct();
        
        // This is an empty main method for testing the Product class
        // Try:

        // Product product = new Product("Banana", 1.1, 13);
        // product.printProduct();
    }
}
