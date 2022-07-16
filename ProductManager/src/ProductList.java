import java.io.IOException;
import java.util.ArrayList;

//lop nay de chua cac object product trong 1 array
public class ProductList {
    private ArrayList<Product> list;
    final String fileName = "src/product.txt";

    public ProductList() {
        try {
            list = FileDAO.loadData(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayProducts() {
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
