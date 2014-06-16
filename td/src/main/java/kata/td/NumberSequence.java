package kata.td;

/**
 * Created by benwu on 14-6-16.
 */
public class NumberSequence {
    protected static int turnNumber = 0;

    public int getNextTurnNumber()
    {
        return ++turnNumber;
    }
    // TODO-working-on: Change the interface NumberSequence to be a class to remove the duplicated code in its subclasses

}
