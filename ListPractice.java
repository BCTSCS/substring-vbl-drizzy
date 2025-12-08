import java.util.*;

class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("syntax");
        a.add("parser");
        a.add("token");
        a.add("lexical");
        for (String i : a){
            System.out.println(i);
        }
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i).toUpperCase());
        }
        for (int i = 0; i < a.size(); i++){
            if (a.get(i).length() > 5){
                System.out.println(a.get(i));
            }
        }
    }
}