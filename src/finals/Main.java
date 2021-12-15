package finals;

public class Main {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    public static void main(String[] args) {
        int[][] room = {
                {0,0,-1,0},
                {0,0,0,-1},
                {-1,0,0,0},
                {-1,0,0,0}
        };
        System.out.println("Hello");
        Roomba robot = new Roomba(room);
    }
}
