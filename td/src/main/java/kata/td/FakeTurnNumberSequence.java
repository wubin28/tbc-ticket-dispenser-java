package kata.td;

/**
 * Created by benwu on 14-6-16.
 */
public class FakeTurnNumberSequence implements NumberSequence {
    private int callsCount = 0;

    public void setExpectedNextTurnNumber(int expectedNextTurnNumber) {

    }

    public void verifyMethodGetNextTurnNumberWasCalledOnce() {
        if (this.callsCount != 1) {
            throw new IllegalStateException("The method getNextTurnNumber() should be called once.");
        }
    }
}
