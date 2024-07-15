import java.util.*;

class myThread1 extends Thread{
     public void run(){
        for(int i=0;i<10;i++)
            try{
         System.out.println(i + " is thread - 1");
        // sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}
class myThread2 extends Thread{
     public void run(){
        for(int i=0;i<10;i++)
            try{
         System.out.println(i + " is thread - 2");
        // sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}
class Thread1{
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        //myThread t2 = new myThread();
        t1.start();
        // try{
        // Thread.sleep(1000);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();
    }
} 