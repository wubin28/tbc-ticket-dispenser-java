package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TurnNumberSequence implements NumberSequence {
    private static int _turnNumber = 0;

    public static int getNextTurnNumber()
    {
        return _turnNumber++;
    }
}
