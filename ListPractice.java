import java.util.ArrayList;
public class ListPractice{
    public void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("syntax");
        a.add("parser");
        a.add("token");
        a.add("lexical");
        for (String s : a) {
            System.out.println(s);
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i).length() > 5) {
                System.out.println(a.get(i));
            }
        }
    }
}
