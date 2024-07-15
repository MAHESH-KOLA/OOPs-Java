import java.util.*; 
class ExceptionHandling{
public static void main(String args[]){
    try{
        int a[] = new int[2];
            a[3]=5;
       
        try{
             int res=3/0;
        }
        catch(ArithmeticException e){
        System.out.println(e);
            
    }
        
    }
    catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
   
}
}