package kata.td;

/**
 * Created by benwu on 14-7-26.
 */
public class MockTurnNumberSequence extends TurnNumberSequence {
    private int nextTurnNumber;
    private int callsCount = 0;

    public void arrangeNextTurnNumber(int nextTurnNumber) {
        this.nextTurnNumber = nextTurnNumber;
    }

    public void verifyMethodGetNextTurnNumberCalledOnce() {
        if (this.callsCount != 1) {
            throw new IllegalStateException("The method getNextTurnNumber() should be called once.");
        }
    }

    @Override
    public int getNextTurnNumber() {
        this.callsCount++;
        return this.nextTurnNumber;
    }
}
