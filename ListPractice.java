import java.util.*;

public class ListPractice {
    public ListPractice(){

    }
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("syntax");
        a.add("parser");
        a.add("token");
        a.add("lexical");

        for (String i : a) {
            System.out.println(i);
        }

        for (int i=0; i < a.size(); i++){
            System.out.println(i+" : " + a.get(i).toUpperCase());
        }

        for (String i : a){
            if (i.length() > 5){
                System.out.println(i);
            }
        }
    }

}