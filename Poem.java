import java.util.*;
import java.io.*;
public class Poem {
    private String title;              // The title of the poem
    private ArrayList<String> lines;   // The lines of the poem
    public Poem(String title) {
        this.title = title;
        this.lines = new ArrayList<>();
    }
}
