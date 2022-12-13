import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketTest {

    @Test
    public void testSortTickets() {
        TicketRepository repository = new TicketRepository();
        TicketManager manager = new TicketManager(repository);
        TicketInformation ticket1 = new TicketInformation(1, "MSK", "SPB", 350);
        TicketInformation ticket2 = new TicketInformation(2, "SPB", "KAL", 150);
        TicketInformation ticket3 = new TicketInformation(3, "KAL", "SAR", 200);
        TicketInformation ticket4 = new TicketInformation(4, "MSK", "SPB", 250);
        TicketInformation ticket5 = new TicketInformation(5, "SAM", "YRA", 300);
        TicketInformation ticket6 = new TicketInformation(6, "MSK", "SPB", 100);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        TicketInformation[] expected = {ticket6, ticket4, ticket1};
        TicketInformation[] actual = manager.findAll("MSK", "SPB");
        Assertions.assertArrayEquals(expected, actual);
    }
}