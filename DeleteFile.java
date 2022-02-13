package deletefile;
import java.io.File;

public class DeleteFile {
    
    public static void main(String[] args) {
       File f = new File("F:\\filing\\irfan.txt");
       if(f.delete()){
       System.out.println("Following file deleted successfully: " + f.getName());
       }
       else{
       System.out.println("File not deleted");
       }
    }
    
}
