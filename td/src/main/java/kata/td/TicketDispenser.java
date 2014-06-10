package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TicketDispenser {
    public TurnTicket getTurnTicket()
    {
        int newTurnNumber = TurnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
