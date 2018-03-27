public class Product {
    Integer id;
    String name;
    String supplier;
    int price;
    boolean onPromotion=false;
    DataBase dataBase;
    Order orders;


  public Product(Integer id, String name, String supplier, DataBase dataBase, Order orders) {
    this.id = id;
    this.name = name;
    this.supplier = supplier;
    this.dataBase = dataBase;
    this.orders = orders;
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
    this.price=this.price*percentage/100;
    onPromotion=true;
  }




}