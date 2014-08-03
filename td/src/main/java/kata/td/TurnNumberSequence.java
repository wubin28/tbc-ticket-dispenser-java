package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TurnNumberSequence {
    public static final int REGULAR_CUSTOMER_FIRST_NUMBER = 2001;
    public static final int VIP_CUSTOMER_FIRST_NUMBER = 1001;
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
