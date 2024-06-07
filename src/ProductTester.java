import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProductTester {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Pen", 97, 0.99));
        productList.add(new Product(2, "Pencil", 55, 8.15));
        productList.add(new Product(3, "Notebook", 32, 12.9));
        productList.add(new Product(4, "Ruler", 21, 6.9));
        productList.add(new Product(5, "Compass", 9, 32.9));
        productList.add(new Product(6, "Eraser", 120, 0.5));

        ProductTableModel model = new ProductTableModel(productList);
        JTable table = new JTable(model);

        JFrame frame = new JFrame("Product Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(table));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

/* public class ProductTester {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setItemId (1);
        product1.setItemName ("Pen");
        product1.setNumberOfItemsInStock (97);
        product1.setPriceOfEachUnit (0.99);

        Product product2 = new Product();
        product2.setItemId (2);
        product2.setItemName ("Pencil");
        product2.setNumberOfItemsInStock (55);
        product2.setPriceOfEachUnit (8.15);

        Product product3 = new Product (3, "Notebook", 32, 12.9);
        Product product4 = new Product (4, "Ruler", 21, 6.9);
        Product product5 = new Product (5, "Compass", 9, 32.9);
        Product product6 = new Product (6, "Eraser", 120, 0.5);

        System.out.println(product1);
        System.out.println();
        System.out.println(product2);
        System.out.println();
        System.out.println(product3);
        System.out.println();
        System.out.println(product4);
        System.out.println();
        System.out.println(product5);
        System.out.println();
        System.out.println(product6);
        System.out.println();

    }
}
 */
