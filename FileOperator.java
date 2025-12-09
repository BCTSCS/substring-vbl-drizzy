import java.io.*;
import java.util.*;

public class FileOperator{
    private static File myFile;
    private static Scanner fileReader;
    
    public static void createFile(String filename){
        try {
            myFile = new File(filename);
            fileReader=new Scanner(myFile);
            }catch(IOException e){
                System.out.println("File does not exist");
            }
            finally{
                System.out.println("Continue");
            }
        }
    public static ArrayList<String> getStringData(String filename) {
        createFile(filename);
        ArrayList<String> result = new ArrayList<String>();
        while(fileReader.hasNextLine()){
            result.add(fileReader.nextLine());
        }
        return result;
    }
}