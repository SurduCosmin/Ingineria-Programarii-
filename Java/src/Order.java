import java.util.ArrayList;

public class Order {
    private String orderDate;
    private String shipmentDate;
    private String shipToAdress;
    private String orderStatus;
    private ArrayList<Product> products;

    public Order(String orderDate, String shipmentDate, String shipToAdress, String orderStatus) {
        this.orderDate = orderDate;
        this.shipmentDate = shipmentDate;
        this.shipToAdress = shipToAdress;
        this.orderStatus = orderStatus;
        this.products = new ArrayList<>();
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public String getShipToAdress() {
        return shipToAdress;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
