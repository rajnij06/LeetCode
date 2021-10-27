package Assignment1;

class Printer {
    private static Printer connection_instance = null;

    public String connection;
    private Printer() {
        this.connection="Your Printer is working";
    }
    public static Printer getInstance() {
        if(connection_instance == null ) {
            return connection_instance = new Printer();
        }
        return connection_instance;
    }
    public void getConnection() {
        System.out.println(this.connection);
    }
}
class Main {
    public static void main(String[] args) {
        Printer p1;
        p1= Printer.getInstance();
        p1.getConnection();
    }
}
