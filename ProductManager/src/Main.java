import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        ProductList x = new ProductList();
        do {
            System.out.println("1. Display all products");
            System.out.println("2. Update the product by id");
            System.out.println("3. Find product by id");
            System.out.println("4. Add a new product");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    x.displayProducts();
                    break;
            }
        } while (choice <= 4);
    }
}