package thoughtworks.com.example_gradle_project;

/**
 * Created by saylerb on 3/27/17.
 */
public class Rover {
    private int x;
    private int y;
    private String orientation;

    public Rover(int x, int y, String orientation) {

        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void report() {
        System.out.println(x + " " + y + " " + orientation);
    }

    public void moveForward() {
        switch (orientation) {
            case "N":
                y++;
                break;
            case "E":
                x++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
            default:
                throw new RuntimeException();
        }
    }
}
