import java.sql.DatabaseMetaData;

public class MainSingleton {
    private static MainSingleton ourInstance = new MainSingleton();
    private final DataBase DataBase;
    private final Application Application;

    public static MainSingleton getInstance() {
        return ourInstance;
    }

    private MainSingleton() {
        this.DataBase= new DataBase();
        this.Application = new Application(this.DataBase);
    }
}
