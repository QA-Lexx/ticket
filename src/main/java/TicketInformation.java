public class TicketInformation implements Comparable<TicketInformation> {
    private int id;
    private String from;
    private String to;
    private int price;

    public TicketInformation(int id, String from, String to, int price) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(TicketInformation o) {
        if (this.getPrice() < o.getPrice()) {
            return -1;
        }
        if (this.getPrice() > o.getPrice()) {
            return 1;
        }
        return 0;
    }
}