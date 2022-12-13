public class TicketRepository {

    private TicketInformation[] tickets = new TicketInformation[0];

    public TicketInformation[] findAll() {
        return tickets;
    }

    public void add(TicketInformation ticketInformation) {
        TicketInformation[] tmp = new TicketInformation[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticketInformation;
        tickets = tmp;
    }
}