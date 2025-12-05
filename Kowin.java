public class Kowin {
    private String month;
    private int day;
    private String gift;
    public Kowin(String month, int day, String gift) {
        this.month = month;
        this.day = day;
        this.gift = gift;
    }
    public String getGift() {
        return gift;
    }
    public void setGift(String gift) {
        this.gift = gift;
    }
    public String toString() {
        return "Kowin:" + this.month + this.day + this.gift;
    }
    public static void main(String[] args) {
        Kowin kowin = new Kowin("August ", 14, " Pokemon Cards");
        System.out.println(kowin.toString());
    }
}
