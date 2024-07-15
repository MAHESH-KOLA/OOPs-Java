public class Exception_throw {
    public static void validate(int age){
        
    
        if(age<18){
             throw new ArithmeticException("age sould be greater than 18");
        }
        else{
            System.out.println("eligble to vote");
        }

    }
    public static void main(String args[]){
        validate(13);
        System.out.println("rest of the code...");
    }
}
