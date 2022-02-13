package writetofile;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    
    public static void main(String[] args) {
       try{
       FileWriter f = new FileWriter("F:\\filing\\irfan.txt");
       f.write("Helo! irfan, how are you, this is file writing. Checking the file writig");
       f.close();
       System.out.println("Successfully wrote to file.");
       }
       catch(IOException e){
           System.out.println("An error occured");
           e.printStackTrace();
       }
    }
    
}
