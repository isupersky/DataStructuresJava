import java.io.*;

public class FileHandling {
    public static void main(String args[]){
        File file = new File("InputForApp.txt");
        try
        {
            PrintWriter pw = new PrintWriter(file);
            //pw.println("Hello World");
            for(int i = 1; i<= 10000; i++){
                pw.println("This is list Item: "+ i);
            }
            pw.close();
        }
        catch (FileNotFoundException fnfe){
            System.out.println("File nhi milli");
        }
    }
}
