package thoughtworks.com.example_gradle_project;

public class main {

    public static void main(String[] args) {
        createAndMoveRover(Orientation.N);
        createAndMoveRover(Orientation.E);
        createAndMoveRover(Orientation.S);
        createAndMoveRover(Orientation.W);
    }

    public static void createAndMoveRover(Orientation orientation) {

        Rover rover = new Rover(1, 2, orientation);

        System.out.println("Starting location and orientation:");
        rover.report();

        System.out.println("Moving forward...");
        rover.moveForward();
        rover.report();

        System.out.println("Turning right...");
        rover.turnRight();
        rover.report();

        System.out.println();
    }

}
