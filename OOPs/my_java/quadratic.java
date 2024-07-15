import java.util.*;
import java.lang.*;
class quadratic{
 public static void main(String args[]){
  System.out.println("enter coefficients of a quadratic equation i.e, a,b,c: ");
  Scanner input = new Scanner(System.in);
  int a=input.nextInt();
  int b=input.nextInt();
  int c=input.nextInt();
  if(b*b - 4*a*c>0){
   double root1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
   double root2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
   System.out.println("roots are: "+root1+" "+root2);
   }
   else if(b*b - 4*a*c == 0){
   double root= -b/(2*a);
   System.out.println("roots are: "+root+" "+root);
   }
   else{
   System.out.println("roots are imaginary🤔️");
   }
   }
   }
