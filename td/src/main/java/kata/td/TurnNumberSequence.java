package kata.td;

/**
 * Created by benwu on 14-6-16.
 */
public class TurnNumberSequence {
    protected static int turnNumber = 0;

    public TurnNumberSequence() {
        this(0);
    }
    public TurnNumberSequence(int startingTurnNumber) {
        turnNumber = startingTurnNumber;
    }

    public int getNextTurnNumber()
    {
        return ++turnNumber;
    }
}
