package createfile;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    
    public static void main(String[] args) {
    try{
        File f = new File("F:\\filing\\irfan.txt");
        if(f.createNewFile())
        {
        System.out.println("file created: " + f.getName());
        }
        else{
        System.out.println("file already exists");
        }
    }
    catch(IOException e){
        System.out.println("an error occured");
        e.printStackTrace();
    }    
    } 
}