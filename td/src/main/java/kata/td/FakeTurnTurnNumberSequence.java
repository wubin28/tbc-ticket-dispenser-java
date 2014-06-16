package kata.td;

/**
 * Created by benwu on 14-6-16.
 */
public class FakeTurnTurnNumberSequence extends TurnNumberSequence {
    private int callsCount = 0;
    private int expectedNextTurnNumber;

    public void setExpectedNextTurnNumber(int expectedNextTurnNumber) {
        this.expectedNextTurnNumber = expectedNextTurnNumber;
    }

    public void verifyMethodGetNextTurnNumberWasCalledOnce() {
        if (this.callsCount != 1) {
            throw new IllegalStateException("The method getNextTurnNumber() should be called once.");
        }
    }

    public int getNextTurnNumber() {
        this.callsCount++;
        return this.expectedNextTurnNumber;
    }
}
