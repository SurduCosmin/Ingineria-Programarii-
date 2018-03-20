import java.util.ArrayList;

public class Shoppingcart {
    private String date;
    private String lastUpdate;
    private ArrayList<Product> products;

    public Shoppingcart(String date, String lastUpdate) {
        this.date = date;
        this.lastUpdate = lastUpdate;
        this.products = new ArrayList<>();
    }

    public void addItem(Product product) {
        products.add(product);
    }
}
