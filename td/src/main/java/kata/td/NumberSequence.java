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

    // TODO-working-on: create a constructor NumberSequence(int) to eliminate the duplicated code in the constructors of its subclass VipTurnNumberSequence and RegularTurnNumberSequence

    public int getNextTurnNumber()
    {
        return ++turnNumber;
    }
}
