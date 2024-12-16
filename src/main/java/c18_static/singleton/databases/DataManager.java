package c18_static.singleton.databases;

public class DataManager {
    public void performDatabaseOperations() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        System.out.println("데이터베이스 연산을 수행 중");

        databaseConnection.closeConnection();
    }
}
