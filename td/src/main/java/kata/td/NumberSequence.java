package kata.td;

/**
 * Created by benwu on 14-6-16.
 */
public class NumberSequence {
    protected static int turnNumber = 0;

    public NumberSequence() {
        this(0);
    }
    public NumberSequence(int startingTurnNumber) {
        turnNumber = startingTurnNumber;
    }

    public int getNextTurnNumber()
    {
        return ++turnNumber;
    }
}
