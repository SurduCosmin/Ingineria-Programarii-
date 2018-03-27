import java.util.ArrayList;

public class Product {
    Integer id;
    String name;
    String supplier;
    int price;
    boolean onPromotion=false;
    DataBase dataBase;
    ArrayList<Order> orders;


  public Product(Integer id, Integer price,String name, String supplier, DataBase dataBase) {
    this.id = id;
    this.name = name;
    this.supplier = supplier;
    this.dataBase = dataBase;
    this.orders = new ArrayList<>();
    this.price=price;
    boolean onPromotion=false;
  }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPromotion(int percentage)
  {
    try {
      if (!(percentage > 0 && percentage <= 100))
        throw new MyException("Valoarea procentajului este incorecta.");
    }
    catch(MyException e)
    {
      e.printStackTrace();
      return;
    }
      this.price = this.price * percentage / 100;
      onPromotion = true;
    }
  }