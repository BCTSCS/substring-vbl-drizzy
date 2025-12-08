import java.util.*;
public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("syntax");
        arrayList.add("parser");
        arrayList.add("token");
        arrayList.add("lexical");
        for (String a : arrayList){
            System.out.println(a);
        }
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).toUpperCase() + i);
        }
        for (String a : arrayList){
            if(a.length() > 5){
            System.out.println(a);
            }
        }
    }
}
