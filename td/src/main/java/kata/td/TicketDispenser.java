package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TicketDispenser {
    private NumberSequence numberSequence;

    public TicketDispenser() {
        this(new NumberSequence());
    }

    public TicketDispenser(NumberSequence numberSequence) {
        this.numberSequence = numberSequence;
    }

    public TurnTicket getTurnTicket()
    {
        int newTurnNumber = this.numberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
