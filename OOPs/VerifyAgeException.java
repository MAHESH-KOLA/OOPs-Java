import java.util.*;
class AgeException extends Exception{
     public AgeException(String s){
        super(s);
     }
}

class CheckAge { 
    public void verify(int age) throws AgeException{
        if(age>0){
            System.out.println("valid age");
        }
        else{
             throw new AgeException("invalid age");
           // throw(ae);
        }
    }
}

public class VerifyAgeException{
    public static void main(String[] args) {
        int age;
        System.out.println("enter age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        try{
            CheckAge ca = new CheckAge();
            ca.verify(age);
        }
        // catch(AgeException ae){
        //     System.out.println(ae);
        // }
        catch(Exception e){
            System.out.println(e);
        }
    }
}