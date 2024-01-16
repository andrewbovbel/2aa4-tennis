package ca.mcscert.se2aa4.demos.tennis;
import java.util.Optional;
public class Match {

    public static final String P1_NAME = "P1";
    public static final String P2_NAME = "P2";
    
    public Match(Integer p1Strength, Integer p2Strength) {

    }

    public Player play() {
        StupidMVP scorer = new ScoreSystem();
        while (! scorer.isEnded()) {
            Player who = decideGameWinner();
            scorer.score(who);
        }
        return scorer.winner()
        .orElseThrow(() -> new IllegalStateException("No winner"));
    }

    private Player decideGameWinner() {
        System.out.println("this player wins the game: " + P1_NAME);
        return new Player(P1_NAME);
    }



}
