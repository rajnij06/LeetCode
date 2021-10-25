package Practice;

class Database {
    private static Database connection_instance = null;
    public String connection;
    private Database() {
        this.connection="You are now connected to the database";
    }
    public static Database getInstance(){
        if(connection_instance==null){
            return connection_instance = new Database();
        }
        return connection_instance;
    }
    public void getConnection() {
        System.out.println(this.connection);
    }
}

class Main1 {
    public static void main(String[] args) {
        Database db1;
        db1= Database.getInstance();
        db1.getConnection();
    }
}