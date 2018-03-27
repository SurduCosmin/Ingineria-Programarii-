import java.util.Vector;

public class Order {

  public String orderDate;

  public String shippedDate;

  public String shipToAddress;

  public Boolean orderStatus;

    public Customer customers;
    public DataBase dataBase;
    /**
   * 
   * @element-type Product
   */
  public Vector  products;

  public Boolean getOrderStatus() {
  return orderStatus;
  }

  public String getOrderDate() {
  return orderDate;
  }

  public String getAddress() {
  return shipToAddress;
  }

  public Vector<Product> getProducts() {
  return products;
  }

}