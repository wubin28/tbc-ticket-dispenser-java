package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TicketDispenser {
    private TurnNumberSequence turnNumberSequence;

    public TicketDispenser(TurnNumberSequence turnNumberSequence) {
        this.turnNumberSequence = turnNumberSequence;
    }

    public TicketDispenser() {

    }

    public TurnTicket getTurnTicket()
    {
        // TODO: Depending on a static method violates the Dependency Inversion Principle and Open-Closed Principle.
        int newTurnNumber = turnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
