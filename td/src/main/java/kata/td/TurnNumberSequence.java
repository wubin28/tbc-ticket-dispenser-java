package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TurnNumberSequence {
    private static int turnNumber = 0;

    public TurnNumberSequence(int firstNumber) {
        this.turnNumber = firstNumber;
    }

    public TurnNumberSequence() {
        this(0);
    }

    public int getNextTurnNumber()
    {
        return turnNumber++;
    }
}
