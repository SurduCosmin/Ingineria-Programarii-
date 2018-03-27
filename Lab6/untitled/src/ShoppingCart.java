import java.util.ArrayList;
import java.util.Vector;

public class ShoppingCart {

    private String creationDate;
    private ArrayList<Product> products;
    public ShoppingCart(String creationDate) {
        this.creationDate = creationDate;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product, Integer Quantity) {
        for (Integer i = 0; i < Quantity; ++i) {
            products.add(product);
        }
    }

    public String getCreationDate() {
        return this.creationDate;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void removeProduct(Product product) {
        for (Product item : products) {
            if (item.getName().equals(product.getName())) {
                products.remove(product);
            }
        }
    }

    public void getRecomandation() {

        int ok = 0;
        do {
            ok = 1;
            for (int i = 0; i < products.size() - 1; i++) {
                if (products.get(i).price > products.get(i + 1).price) {
                    Integer id = products.get(i).id;
                    Integer price = products.get(i).price;
                    String name = products.get(i).name;
                    String supplier = products.get(i).supplier;

                    products.get(i).id = products.get(i + 1).id;
                    products.get(i).price = products.get(i + 1).price;
                    products.get(i).name = products.get(i + 1).name;
                    products.get(i).supplier = products.get(i + 1).supplier;

                    products.get(i + 1).id = id;
                    products.get(i + 1).price = price;
                    products.get(i + 1).name = name;
                    products.get(i + 1).supplier = supplier;
                    ok = 0;
                }
            }
        } while (ok == 0);


        System.out.println("Top 3 produse sunt :");
        for (int i = 0; i < 3; i++)
            System.out.println(products.get(i).name + " cu pretul " + products.get(i).price);

    }

    public void setDiscount(Product product, Integer upperLimit,Integer discountPromotion) {
        int count = 0;
        for (Product item : products) {
            if (item.getName().equals(product.getName())) {
                count++;
            }
        }
        if (count>=upperLimit) {
            for (Product item : products) {
                if (item.getName().equals(product.getName())) {
                    item.setPromotion(discountPromotion);
                }
            }
        }
    }
}