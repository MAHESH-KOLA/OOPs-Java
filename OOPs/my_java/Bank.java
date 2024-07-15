import java.util.*;
class BankApp{
    String acc_no, name, acc_type, acc_balance;
    BankApp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account no. : ");
        acc_no=sc.next();
        System.out.println("enter account holder name: ");
        name=sc.next();
         System.out.println("enter acc_type: ");
        acc_type=sc.next();
        System.out.println("enter acc_balance: ");
        acc_balance=sc.next();
    }
    void viewDetails(){
         System.out.println(acc_no +"\n" +name +"\n" +acc_type +"\n"+ acc_balance);
    }
    public boolean search(String no){
        if(no==acc_no) return true;
        return false;
    }
}
class Bank{
    public static void main(String args[]){
        int n;
        System.out.println("enter no. of users: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        BankApp B[]=new BankApp[n];
        for(int i=0;i<n;i++){
            B[i]=new BankApp();
            B[i].viewDetails();
        }

        int choice;
        do{
            System.out.println(" 1:  To view details \n 2:  To search  \n 3:  To credit   \n 4:  To debit   \n 5:  To exit");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    for(int i=0;i<n;i++){
                        B[i].viewDetails();
                    }
                    break;
                case 2:
                    System.out.println("enter account number to search: ");
                    String num=sc.next();
                    boolean flag=false;
                    for(int i=0;i<n;i++){
                        boolean f=B[i].search(num);
                        if(f==true)
                             flag=true;
                    }
                    if(flag==false)
                    System.out.println("not found");
                    break;
                    
                case 5:
                     System.out.println("see you soon...");
                     break;

            }
        }while(choice!=5);
    }
}