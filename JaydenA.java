public class JaydenA {
    private String month;
    private int day;
    private String gift;
    public JaydenA(String month, int day, String gift) {
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
        return "JaydenA: " + this.month + this.day + " - " + this.gift;
    } 
    public static void main(String[] args) {
        JaydenA jayden = new JaydenA("April ", 3, "bike");
        System.out.println(jayden.toString());
    }
}