import java.util.Arrays;

public class TicketManager {
    private TicketRepository repository;

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public void add(TicketInformation product) {
        repository.add(product);
    }

    public TicketInformation[] findAll(String from, String to) {
        TicketInformation[] result = new TicketInformation[0];
        for (TicketInformation ticket : repository.findAll()) {
            if (matches(ticket, from, to)) {
                TicketInformation[] tmp = new TicketInformation[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[result.length] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    private boolean matches(TicketInformation ticket, String from, String to) {
        if (ticket.getFrom().equals(from)) {
            if (ticket.getTo().equals(to)) {
                return true;
            }
        }
        return false;
    }
}