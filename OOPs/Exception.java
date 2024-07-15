import java.util.*;
import java.lang.*;
import java.io.*;
class Exception{
public static void main(String args[]){
    try{
        int res=3/0;
      //  System.out.println(res);
    }
    catch(Exception e){
        System.out.println("divide by 0");
    }
    // finally{
    //     System.out.println("finally block");
    // }

}
}