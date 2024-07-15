import java.util.*;

interface rect{
     void rectArea();
}
interface cir{
   public  void cirArea();
   
}

class shape implements rect, cir{
    public void rectArea(){
        System.out.println("rectangle area");
    }
    public void cirArea(){
        System.out.println("circle area");
    }
    public void print(){
        System.out.println("print method");
    }
}

class MultipleInterface{
    public static void main(String[] args) {
        shape s= new shape();
        s.rectArea();
        s.cirArea();
        s.print();
    }
}