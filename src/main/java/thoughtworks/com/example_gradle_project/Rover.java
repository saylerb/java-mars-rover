package thoughtworks.com.example_gradle_project;

import static thoughtworks.com.example_gradle_project.Orientation.*;

public class Rover {
    private Coordinate position;
    private Orientation orientation;

    public Rover(Coordinate position, Orientation orientation) {

        this.position = position;
        this.orientation = orientation;
    }

    public void report() {
        position.print();
        System.out.println(orientation);
    }

    public void moveForward() {
        switch (orientation) {
            case NORTH:
                position.moveNorth();
                break;
            case EAST:
                position.moveEast();
                break;
            case SOUTH:
                position.moveSouth();
                break;
            case WEST:
                position.moveWest();
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
