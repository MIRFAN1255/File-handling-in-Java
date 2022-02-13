package readfromfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    
    public static void main(String[] args) {
        try{
        File f = new File("F:\\filing\\irfan.txt");
        Scanner r = new Scanner(f);
        while(r.hasNextLine()){
        String data = r.nextLine();
        System.out.println(data);
        }
        r.close();
        }
        catch(FileNotFoundException e)
        {
        System.out.println("An error occured");
        e.printStackTrace();               
        }
    }  
}