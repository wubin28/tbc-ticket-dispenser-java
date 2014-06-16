package kata.td;

/**
 * Created by benwu on 14-6-16.
 */
public class VipTurnNumberSequence implements NumberSequence {
    private static int turnNumber;

    public VipTurnNumberSequence(int startingTurnNumber) {
        this.turnNumber = startingTurnNumber;
    }

    @Override
    public int getNextTurnNumber() {
        return ++this.turnNumber;
    }
}
