public class Daniel {
    private String month, gift;
    private int day;

    public Daniel(String g){
        month = "October";
        day = 20;
        gift = g;
    }
    public String getGift(){
        return gift;
    }
    public void setGift(String g){
        gift = g;
    }
    public String toString(){
        return "Daniel : "+month+" "+day+" : "+gift;
    }

    public static void main(String[] args) {
        Daniel person = new Daniel("bike");
        System.out.println(person.toString());
    }
}
