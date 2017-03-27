package thoughtworks.com.example_gradle_project;

/**
 * Created by saylerb on 3/20/17.
 */
public class main {

    public static void main(String[] args) {
        createAndMoveRover("N");
        createAndMoveRover("E");
        createAndMoveRover("S");
        createAndMoveRover("W");
    }

    public static void createAndMoveRover(String orientation) {
        new Rover(1, 2, orientation).report();
    }

}
