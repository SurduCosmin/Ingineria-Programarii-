public class WebUser {

  public Integer id;

  public String password=new String();

    public Application application=new Application();
    public ShoppingCart shopCart=new ShoppingCart("27 Martie");

  public WebUser(Integer id, String password, Application application, ShoppingCart shopCart) {
    this.id = id;
    this.password = password;
    this.application = application;
    this.shopCart = shopCart;
  }

  public Boolean getAcces() {
  return application.getAcces(id,password);
  }

  public ShoppingCart getShoppingCart() {
  return shopCart;
  }

}