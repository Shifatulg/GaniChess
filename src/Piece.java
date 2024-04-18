public class Piece {
    private boolean isAlive;
    public Piece() {
        isAlive = true;
    }
    public void captured() {
        isAlive = false;
    }
    public void canMove() {

    }
}
