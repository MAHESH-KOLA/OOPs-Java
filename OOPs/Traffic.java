import java.util.*;
class myThread extends Thread{
    public void run(){
        int red=1, yellow=0, green=0;
        while(true){
            try{
                sleep(10000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            if(red==1){
                System.out.println("Red light is glowing");
                red=0;
                yellow=1;
                continue;
            }
            else if(yellow==1){
                System.out.println("Yellow light is glowing");
                green=1;
                yellow=0;
                continue;
            }
            else if(green==1){
                System.out.println("green light is glowing");
                green=0;
                yellow=1;
                continue;
            }


        }
    } 
}
class Traffic{
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();    
    }
}