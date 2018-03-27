import java.util.Vector;

public class DataBase {

    public Application application;
    /**
   * 
   * @element-type Order
   */
  public Vector  orders;
    /**
   * 
   * @element-type Customer
   */
  public Vector  customers;
    /**
   * 
   * @element-type Product
   */
  public Vector  products;

  public Vector<Customer> getCustomers() {
  return customers;
  }

  public Vector<Order> getOrders() {
  return orders;
  }

  public Vector<Product> getNProducts(Integer id,Integer quantity) {
  return null;
  }

}