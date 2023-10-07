package creational.singleton;

public class DataBaseService {
    private static DataBaseService INSTANCE;

    private DataBaseService() {
        //connection to DB
    }

    public static synchronized DataBaseService getInstance() {
        if (INSTANCE == null)
            INSTANCE = new DataBaseService();

        return INSTANCE;
    }

    public void showConnectionInfo() {
        System.out.println("Successfully connected to db.");
    }
}
