package c18_static.singleton.databases;

public class DatabaseMain {
    public static void main(String[] args) {
        //DataMager에 이미 DataConnection 객체를 만드는 코드가 있어 여기서 안 만듦
        DataManager dataManager1 = new DataManager();

        dataManager1.performDatabaseOperations();

        DataManager dataManager2 = new DataManager();

        dataManager2.performDatabaseOperations();
    }
}
