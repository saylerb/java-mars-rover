package thoughtworks.com.example_gradle_project;

import static thoughtworks.com.example_gradle_project.Orientation.*;

public class Rover {
    private int x;
    private int y;
    private Coordinate position;
    private Orientation orientation;

    public Rover(Coordinate position, Orientation orientation) {

        this.position = position;
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void report() {
        position.print();
        System.out.println(orientation);
    }

    public void moveForward() {
        switch (orientation) {
            case NORTH:
                y++;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y--;
                break;
            case WEST:
                x--;
                break;
            default:
                throw new RuntimeException();
        }

    }
    public void turnRight() {
        switch (orientation) {
            case NORTH:
                orientation = EAST;
                break;
            case EAST:
                orientation = SOUTH;
                break;
            case SOUTH:
                orientation = WEST;
                break;
            case WEST:
                orientation = NORTH;
                break;
            default:
                throw new RuntimeException();
        }

    }
}
