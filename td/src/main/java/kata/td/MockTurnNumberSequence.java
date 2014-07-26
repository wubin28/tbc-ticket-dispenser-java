package kata.td;

/**
 * Created by benwu on 14-7-26.
 */
public class MockTurnNumberSequence extends TurnNumberSequence {
    private int nextTurnNumber;

    public void arrangeNextTurnNumber(int nextTurnNumber) {
        this.nextTurnNumber = nextTurnNumber;
    }

    // TODO-working-on: Finish the implementation of method MockTurnNumberSequence.verifyMethodGetNextTurnNumberCalledOnce().
    public void verifyMethodGetNextTurnNumberCalledOnce() {

    }

    @Override
    public int getNextTurnNumber() {
        return this.nextTurnNumber;
    }
}
