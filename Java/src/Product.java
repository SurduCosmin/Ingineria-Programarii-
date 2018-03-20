public class Product {
    int id;
    String name;
    String supplier;

    public Product(int id, String name, String supplier) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier;
    }
}
