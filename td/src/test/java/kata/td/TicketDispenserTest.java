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
        TurnTicket previousTicket = ticketDispenser.getTurnTicket();

        // Act
        TurnTicket newTicket = ticketDispenser.getTurnTicket();

        // Assert
        assertEquals(1, newTicket.getTurnNumber() - previousTicket.getTurnNumber());
    }

    @Test
    public void a_new_ticket_should_have_the_turn_number_subsequent_to_the_previous_ticket_from_another_dispenser() {
        // Arrange
        TicketDispenser anotherTicketDispenser = new TicketDispenser();
        TicketDispenser ticketDispenser = new TicketDispenser();

        // Act
        TurnTicket previousTicket = anotherTicketDispenser.getTurnTicket();
        TurnTicket newTicket = ticketDispenser.getTurnTicket();

        // Assert
        assertEquals(1, newTicket.getTurnNumber() - previousTicket.getTurnNumber());
    }

    @Test
    public void the_class_TicketDispenser_should_dispense_the_ticket_number_11_if_give_a_turn_number_11_to_it() {
        // Arrange
        FakeTurnNumberSequence fakeTurnNumberSequence = new FakeTurnNumberSequence();
        fakeTurnNumberSequence.setExpectedNextTurnNumber(11);
        TicketDispenser ticketDispenser = new TicketDispenser(fakeTurnNumberSequence);

        // Act
        TurnTicket ticket = ticketDispenser.getTurnTicket();

        // Assert
        assertEquals(11, ticket.getTurnNumber());
        fakeTurnNumberSequence.verifyMethodGetNextTurnNumberWasCalledOnce();
    }

    @Test
    public void the_turn_number_sequence_of_the_vip_customers_starts_from_1001() {
        // Arrange
        VipTurnNumberSequence vipTurnNumberSequence = new VipTurnNumberSequence(1000);
        TicketDispenser ticketDispenser = new TicketDispenser(vipTurnNumberSequence);

        // Act
        TurnTicket ticket = ticketDispenser.getTurnTicket();

        // Assert
        assertEquals(1001, ticket.getTurnNumber());
    }

    // TODO-new-feature-working-on: the turn number sequence of the regular customers starts from 2001
    @Test
    public void the_turn_number_sequence_of_the_regular_customers_starts_from_2001() {
        // Assert
        assertEquals(2001, ticket.getTurnNumber());
    }
}
