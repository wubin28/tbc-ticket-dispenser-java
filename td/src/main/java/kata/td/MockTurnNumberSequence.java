package kata.td;

/**
 * Created by ben on 8/21/14.
 */
public class MockTurnNumberSequence extends TurnNumberSequence {
    private int nextTurnNumber;

    public void arrangeNextTurnNumber(int nextTurnNumber) {

    }

    public void verifyMethodGetNextTurnNumberCalledOnce() {

    }

    @Override
    public int getNextTurnNumber() {
        return this.nextTurnNumber;
    }
}
