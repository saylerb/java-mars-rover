package thoughtworks.com.example_gradle_project;

import static thoughtworks.com.example_gradle_project.Orientation.*;

public class Rover {
    private int x;
    private int y;
    private Orientation orientation;

    public Rover(int x, int y, Orientation orientation) {

        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void report() {
        System.out.println(String.format("%s, %s, %s", x, y, orientation));
    }

    public void moveForward() {
        switch (orientation) {
            case N:
                y++;
                break;
            case E:
                x++;
                break;
            case S:
                y--;
                break;
            case W:
                x--;
                break;
            default:
                throw new RuntimeException();
        }

    }
    public void turnRight() {
        switch (orientation) {
            case N:
                orientation = E;
                break;
            case E:
                orientation = S;
                break;
            case S:
                orientation = W;
                break;
            case W:
                orientation = N;
                break;
            default:
                throw new RuntimeException();
        }

    }
}
