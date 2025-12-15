import java.util.ArrayList;

public class SocialMedia{
    private ArrayList<String> posts;

    public SocialMedia(String filename){
        this.posts = FileOperator.getStringData(filename);
    }
    public int postsWithLength(int minLength){
        int count = 0;
        for(String post : posts){
            if(post.length() >= minLength){
                count++;
            }
        }
        return count;
    }
    public ArrayList<String> postsWithHashtag(String hashtag){
        ArrayList<String> result = new ArrayList<String>();
        for(String post : posts){
            if(post.contains(hashtag)){
                result.add(post);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== TESTING SAMPLE1.TXT ===");
        SocialMedia post = new SocialMedia("sample1.txt");
        SocialMedia post2 = new SocialMedia("sample2.txt");
        System.out.println(post.postsWithLength(50));
        System.out.println(post.postsWithLength(70));
        System.out.println(post.postsWithHashtag("#Java"));
        System.out.println("=== TESTING SAMPLE2.TXT ===");
        System.out.println(post2.postsWithLength(80));
        System.out.println(post2.postsWithHashtag("#Marvel"));
        System.out.println(post2.postsWithHashtag("#EndgameHype"));
    }
}