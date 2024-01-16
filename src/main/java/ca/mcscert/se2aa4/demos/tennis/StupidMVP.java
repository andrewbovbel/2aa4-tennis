package ca.mcscert.se2aa4.demos.tennis;

import java.util.Optional;

public interface StupidMVP {

    void score(Player playerName);

    boolean isEnded();

    Optional<Player> winner();

}