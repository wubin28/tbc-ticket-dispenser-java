package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TurnNumberSequence extends NumberSequence {
    private static int turnNumber = 0;

    public int getNextTurnNumber()
    {
        return ++turnNumber;
    }
}
