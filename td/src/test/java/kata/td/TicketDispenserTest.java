package kata.td;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class TicketDispenserTest {

    @Test
    public void a_new_ticket_should_have_the_turn_number_subsequent_to_the_previous_ticket() {
        // Arrange
        TicketDispenser ticketDispenser = new TicketDispenser();

        // Act
        TurnTicket previousTicket = ticketDispenser.getTurnTicket();
        TurnTicket newTicket = ticketDispenser.getTurnTicket();

        // Assert
        assertEquals(1, newTicket.getTurnNumber() - previousTicket.getTurnNumber());
    }

    @Test
    public void a_new_ticket_should_have_the_turn_number_subsequent_to_the_previous_ticket_from_another_dispenser() {
        // Arrange
        TicketDispenser dispenser = new TicketDispenser();
        TicketDispenser anotherDispenser = new TicketDispenser();

        // Act
        TurnTicket previousTicket = dispenser.getTurnTicket();
        TurnTicket newTicketFromAnotherDispenser = anotherDispenser.getTurnTicket();

        // Assert
        assertEquals(1, newTicketFromAnotherDispenser.getTurnNumber() - previousTicket.getTurnNumber());
    }

    // TODO-unit-test: the class TicketDispenser should dispense the ticket number 11 if it is given the turn number 11

    // TODO-new-feature: the turn number of VIP customers starts from 1001
    // TODO-new-feature: the turn number of regular customers starts from 2001
}

