import java.io.*;
public class Exception_throw2 {
    public static void method() throws FileNotFoundException {
        FileReader file = new FileReader(" C:\\Users\\Maahi\\cf_912_A.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        try{
            method();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("rest of code");
        
    }
    
}
