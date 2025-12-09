import java.util.ArrayList;
import java.io.*;

public class Poem {
    private String title;              // The title of the poem
    private ArrayList<String> lines;   // The lines of the poem

    public Poem (String title, ArrayList<String> lines) {
        this.title = title;
        this.lines = lines;
    }
}