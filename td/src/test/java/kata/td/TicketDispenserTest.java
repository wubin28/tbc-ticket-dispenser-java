package kata.td;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class TicketDispenserTest {
    @Test
    public void a_trivial_test() {
        assertEquals(5, 2 + 3);
    }
}

// TODO-characterization: a new ticket should have the turn number subsequent to the previous ticket
// TODO-characterization: a new ticket should have the turn number subsequent to the previous ticket from another dispenser

// TODO-unit-test: the class TicketDispenser should dispense the ticket number 11 if it is given the turn number 11

// TODO-new-feature: the turn number of VIP customers starts from 1001
// TODO-new-feature: the turn number of regular customers starts from 2001