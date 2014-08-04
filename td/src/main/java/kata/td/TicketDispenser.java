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
        this(new TurnNumberSequence());
    }

    public TurnTicket getTurnTicket()
    {
        int newTurnNumber = turnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
