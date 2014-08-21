package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TurnNumberSequence {
    private static int _turnNumber = 0;

    public TurnNumberSequence(int startingTurnNumber) {
        this._turnNumber = startingTurnNumber;
    }

    public TurnNumberSequence() {
        this(0);
    }

    public int getNextTurnNumber()
    {
        return _turnNumber++;
    }
}
