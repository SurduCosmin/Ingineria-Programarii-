public class Application {

    private DataBase dataBase;

    public void GetAccess() {

    }

    public Application(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


}
