import java.util.*;

class calculater{
  public static void main(String[] args){
   Scanner in = new Scanner(System.in);
   System.out.println("enter first number: ");
   int a=in.nextInt();
   System.out.println("enter second number: ");
   int b=in.nextInt();
   char op= in.next().charAt(0);
   int res;
   switch(op){
   case '+':
     System.out.println(a+b);
     break; 
    case '-':
      System.out.println(a-b);
      break; 
    case '*':
       System.out.println(a*b);
       break; 
     case '/':
      System.out.println(a/b);
      break; 

      default:
       System.out.println("enter correct operater");
   }
  }
  }
