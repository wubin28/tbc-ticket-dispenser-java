package kata.td;

/**
 * Created by ben on 8/21/14.
 */
public class MockTurnNumberSequence extends TurnNumberSequence {
    private int nextTurnNumber;
    private int callsCount = 0;

    public void arrangeNextTurnNumber(int nextTurnNumber) {
        this.nextTurnNumber = nextTurnNumber;
    }

    public void verifyMethodGetNextTurnNumberCalledOnce() {
        if (callsCount != 1) {
            throw new IllegalStateException("The method MockTurnNumberSequence.getNextTurnNumber() should be called once.");
        }
    }

    @Override
    public int getNextTurnNumber() {
        return this.nextTurnNumber;
    }
}
