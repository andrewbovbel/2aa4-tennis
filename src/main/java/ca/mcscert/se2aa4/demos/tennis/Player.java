package ca.mcscert.se2aa4.demos.tennis;

public class Player {

    public final String name;

    public Player(String name) {this.name = name;}

    @Override
    public String toString() {
        return "Player: " + name;
    }


}
