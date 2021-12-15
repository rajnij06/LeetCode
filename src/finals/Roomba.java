package finals;

class Roomba implements iRobot{
    int[][] room;
    int i; // column
    int j; // row
    Main.Direction dir;
    public Roomba(int[][] room) {
        this.room = room;
        dir = Main.Direction.DOWN;
        this.i = 0;
        this.j = 0;
    }
    public final boolean move() {
        switch (dir) {
            case DOWN:
                if (this.j+1 < this.room.length && this.room[i][j+1] != -1) {
                    j++;
                    return true;
                }
                break;
            case UP:
                if (this.j-1 >= 0 && this.room[i][j-1] != -1) {
                    j--;
                    return true;
                }
                break;
            case LEFT:
                if (this.i-1 >= 0 && this.room[i-1][j] != -1) {
                    i--;
                    return true;
                }
                break;
            case RIGHT:
                if (this.i+1 < this.room[0].length && this.room[i+1][j] != -1) {
                    i--;
                    return true;
                }
                break;
        }
        return false;
    }
    public final void turnLeft() {
        switch (dir) {
            case DOWN:
                dir = Main.Direction.RIGHT;
                break;
            case UP:
                dir = Main.Direction.LEFT;
                break;
            case LEFT:
                dir = Main.Direction.DOWN;
                break;
            case RIGHT:
                dir = Main.Direction.UP;
                break;
        }
    }
    public final void turnRight() {
        switch (dir) {
            case DOWN:
                dir = Main.Direction.LEFT;
                break;
            case UP:
                dir = Main.Direction.RIGHT;
                break;
            case LEFT:
                dir = Main.Direction.UP;
                break;
            case RIGHT:
                dir = Main.Direction.DOWN;
                break;
        }
    }
    public final void clean() {
        this.room[i][j] = 1;
    }
}

