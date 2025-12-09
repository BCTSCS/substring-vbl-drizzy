import java.util.*;
import java.io.*;

public class FileOperator {
    private static File myfile;
    private static Scanner fileReader;
    
    public static void createFile(String filename) throws IOException{
        try{
            myfile = new File(filename);
            fileReader = new Scanner(myfile);
        }
        catch (IOException e){
            System.out.println("Ts Exception: "+ e);
        } finally{
            System.out.println("Continue");
        }
    }
    
    public static ArrayList<String> getStringList(String filename) throws IOException{
        ArrayList<String> result = new ArrayList<>();
        createFile(filename);
        while(fileReader.hasNextLine()){
            result.add(fileReader.nextLine());
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(FileOperator.getStringList("poem.txt"));
    }
}
