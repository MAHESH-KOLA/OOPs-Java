import java.util.*;
import java.lang.*;
class BMS{
    String acc_no, acc_name, acc_type, branch;
    double balance;
    Scanner sc= new Scanner(System.in);
    BMS(){
        
        System.out.println("enter account number: ");
        this.acc_no=sc.next();
        System.out.println("enter account holder name: ");
        this.acc_name=sc.next();
        System.out.println("enter account type: ");
        this.acc_type=sc.next();
        System.out.println("enter account branch: ");
        this.branch=sc.next();
        System.out.println("enter account balance: ");
        this.balance=sc.nextDouble();
    }
    void viewDetails(){
        System.out.println("account holder details: ");
        System.out.println(acc_no +"    "+acc_name + "      "+acc_type+ "       "+branch+"      "+balance);
    }
    boolean search(String num){
        if(acc_no.equals(num)) return true;
        return false;
    }
    void creditBalance(){
        System.out.println("enter amount to be credit: ");
        double amt;
        amt= sc.nextDouble();
        this.balance+=amt;
    }
    void debitBalance(){
        System.out.println("enter amount to be debit: ");
        double amt;
        amt= sc.nextDouble();
        if(balance>=amt){
            this.balance-=amt; 
        }
        else{
         System.out.println("insufficient balance ");
        }
    }

}
class bank{
    public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        BMS b[] = new BMS[n];
        for(int i=0;i<n;i++){
            b[i]= new BMS();
            b[i].viewDetails();
        }
       int option;

       do{
         System.out.println("1 : search \n 2 : credit \n 3 : debit \n  4 : viewDetails \n 0: exit\n");
         option=sc.nextInt();
         switch(option){
        case 1:
            System.out.println("enter user account no. to search: ");
            String num;
            int  flag=0;
            num=sc.next();
            for(int i=0;i<n;i++){
                if(b[i].search(num)){
                    flag=1;
                    break;
                }
            }
            if(flag==1)  System.out.println("account found...");
            else  System.out.println("account not found...");
            break;
        case 2:
            flag=0;
            num=sc.next();
            int i;
            for(i=0;i<n;i++){
                if(b[i].search(num)){
                    flag=1;
                    break;
                }
            }
            if(flag==0)  System.out.println("account not fount found...");
            else {
                b[i].creditBalance();
                }
            
            break;
        case 3:
            System.out.println("debit:  ");
            break;
        case 4:
             for(i=0;i<n;i++){
                b[i].viewDetails();
             }
        case 0:
             System.out.println("exit... ");
             break;
        default:
             System.out.println("please enter correct value: ");
             break;
         }
       } while(option!=0);
    }
}