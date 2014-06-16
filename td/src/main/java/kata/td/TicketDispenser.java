package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TicketDispenser {
    private NumberSequence numberSequence;

    public TicketDispenser() {
        this(new TurnNumberSequence());
    }

    public TicketDispenser(NumberSequence numberSequence) {
        this.numberSequence = numberSequence;
    }

    public TurnTicket getTurnTicket()
    {
        // TODO-working-on: Depending on a static method violates the Dependency Inversion Principle and Open-Closed Principle.
        int newTurnNumber = this.numberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
