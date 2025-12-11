import java.util.ArrayList;
public class SocialMedia {
    private ArrayList<String> posts;
    public SocialMedia(String filename) {
        this.posts = FileOperator.getStringList(filename);
    }
    public int postsWithMinLength(int minLength) {
        int count = 0;
        for(String post : posts) {
            if(post.length() >= minLength) {
                count++;
            }
        }
        return count;
    }
    public ArrayList<String> postsWithHashtag(String hastag) {
        ArrayList<String> result = new ArrayList<>();
        for(String post : posts) {
            if(post.contains("#")) {
                result.add(post);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SocialMedia Kowin = new SocialMedia("sample1.txt");
        Kowin.postsWithHashtag("#Java").stream().forEach(System.out::println);
    }
}
