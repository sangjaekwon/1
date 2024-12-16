package c18_static.singleton.databases;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;

    private DatabaseConnection() {
        System.out.println("데이터베이스를 연결하였습니다.");
    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void closeConnection() {
        System.out.println("데이터베이스 연결을 끊었습니다.");
    }
}
