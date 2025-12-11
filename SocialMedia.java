import java.util.ArrayList;

public class SocialMedia {
    private ArrayList<String> posts;

    public SocialMedia(String filename) {
        this.posts = FileOperator.getStringData(filename);
    }

    public int postsWithLength(int minLength) {
        int count = 0;
        return count;
    }

    public ArrayList<String> postsWithHashtag(String hashtag) {
        ArrayList<String> result = new ArrayList<>();
        return result;
    }

}