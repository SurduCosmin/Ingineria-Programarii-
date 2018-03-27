class Singleton {
    private static final Application INSTANCE = new Application();

    public static Application getInstance() {
        return Singleton.INSTANCE;
    }
    public static void main(String[] args)
    {
        Application app=getInstance();
        DataBase bs=new DataBase();
        ShoppingCart sh=new ShoppingCart("27 Martie");
        WebUser web=new WebUser(1,"ala",app,sh);
        Product p=new Product(5,10,"mere","piata",bs);
        Product p2=new Product(5,15,"pere","piata",bs);
        sh.addProduct(p,1);
        sh.addProduct(p2,3);
        sh.setDiscount(p2,10,5);
        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
        sh.getRecommandation();
        sh.setDiscount(p2,15,10);
        System.out.println(sh.getCreationDate());
        System.out.println(sh.getProducts());
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        p.setId(5);
        p.setName("Dan");
        p.setPrice(50);
        p.setPromotion(10);
        System.out.println(web.getAcces());
        System.out.println(web.getShoppingCart());
        p.setPromotion(50);

    }
}