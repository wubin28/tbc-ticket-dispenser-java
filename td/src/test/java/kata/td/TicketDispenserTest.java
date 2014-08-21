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

    @Test
    public void the_class_TicketDispenser_should_dispense_the_ticket_number_11_if_it_is_given_the_turn_number_11() {
        // Arrange
        MockTurnNumberSequence mockTurnNumberSequence = new MockTurnNumberSequence();
        mockTurnNumberSequence.arrangeNextTurnNumber(11);
        TicketDispenser dispenser = new TicketDispenser(mockTurnNumberSequence);

        // Act
        TurnTicket ticket = dispenser.getTurnTicket();

        // Assert
        assertEquals(11, ticket.getTurnNumber());
        mockTurnNumberSequence.verifyMethodGetNextTurnNumberCalledOnce();
    }

    @Test
    public void the_turn_number_of_VIP_customers_starts_from_1001() {
        // Arrange
        TurnNumberSequence vipTurnNumberSequence = new TurnNumberSequence(1001);
        TicketDispenser vipCustomerTicketDispenser = new TicketDispenser(vipTurnNumberSequence);

        // Act
        TurnTicket firstTicketOfVipCustomer = vipCustomerTicketDispenser.getTurnTicket();

        // Assert
        assertEquals(1001, firstTicketOfVipCustomer.getTurnNumber());
    }

    @Test
    public void the_turn_number_of_regular_customers_starts_from_2001() {
        // Arrange
        TurnNumberSequence regularTurnNumberSequence = new TurnNumberSequence(2001);
        TicketDispenser regularCustomerTicketDispenser = new TicketDispenser(regularTurnNumberSequence);

        // Act
        TurnTicket firstTicketOfRegularCustomer = regularCustomerTicketDispenser.getTurnTicket();

        // Assert
        assertEquals(2001, firstTicketOfRegularCustomer.getTurnNumber());
    }
}

