package kata.td;

/**
 * Created by benwu on 14-6-16.
 */
public class VipTurnNumberSequence extends NumberSequence {
    private static int turnNumber;

    public VipTurnNumberSequence(int startingTurnNumber) {
        this.turnNumber = startingTurnNumber;
    }

    public int getNextTurnNumber() {
        return ++this.turnNumber;
    }
}
