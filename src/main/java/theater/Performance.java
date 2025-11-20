package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    int audience;
    String playID;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }
}
