package thoughtworks.com.example_gradle_project;


public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.print(x + " " + y + " ");
    }
}
