import java.util.*;

class prime{
 public static boolean isPrime(int n){
  if(n<=1) return false;
  for(int i=2;i*i<=n;i++){
   if(n%i==0)
      return false;
      }
    return true;
    }
  public static void main(String args[]){
   int arr[] = new int[4];
   Scanner input = new Scanner(System.in);
   for(int i=0;i<4;i++)
     arr[i]= input.nextInt();
     
    for(int i=0;i<4;i++)
     System.out.print(arr[i]);
     
     System.out.println("\n");
     
     int n=input.nextInt();
     if(isPrime(n))
        System.out.println("prime" );
     else
        System.out.println(" not prime" );
        
     }
     }
