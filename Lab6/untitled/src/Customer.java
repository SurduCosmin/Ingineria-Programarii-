import java.util.Vector;

public class Customer {

  public Integer id;

  public String address;

  public String phone;

  public String email;

    /**
   * 
   * @element-type Order
   */
  public Vector  orders;
    public DataBase dataBase;

  public Integer getId() {
  return id;
  }

  public String getAddress() {
  return address;
  }

  public String getPhone() {
  return phone;
  }

  public String getEmail() {
  return email;
  }

  public Vector<Order> getMyOrders() {
  return orders;
  }

}