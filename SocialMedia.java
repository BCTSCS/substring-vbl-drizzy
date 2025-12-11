import java.util.ArrayList;

public class SocialMedia {
    private ArrayList<String> posts;

    public SocialMedia(String filename) {
        this.posts = FileOperator.getStringData(filename);
    }

    public int postsWithLength(int minLength) {
        int count = 0;
        for (String post : posts) {
            if (post.length() >= minLength) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<String> postsWithHashtag(String hashtag) {
        ArrayList<String> result = new ArrayList<>();
        // .contains
        for (String post : posts) {
            if (post.contains(hashtag)) {
                result.add(post);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SocialMedia jayden = new SocialMedia("sample1.txt");
        System.out.println(jayden.postsWithHashtag("Java"));
        System.out.println(jayden.postsWithLength(5));
        // jayden.postsWithHashtag("Java").stream().forEach(System.out::println); // Advanced java
        // SocialMedia unknown = new SocialMedia("sample2.txt");
    }
}