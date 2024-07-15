import java.util.*;


class Exceptions{

   public static  void check() throws ArithmeticException{
        int c=100/2;
    }
     public static void main(String[] args) {
        try{
            check(); 
        }
        catch(Exception e){
         System.out.println(e);
        }
    }
}