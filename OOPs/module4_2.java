import java.util.*;
interface shape{
    public void getArea();
    public void getVolume();
    // void print();
}
class square implements shape{
    Scanner sc = new Scanner(System.in);
    int side;
    square(){
        side=sc.nextInt();
    }
    public void getArea(){
        System.out.println(side*side);
    }
    public void getVolume(){
        System.out.println("oops..");
    }
     public void print(){
         System.out.println("print");
     }
}
class module4_2{
    public static void main(String[] args) {
        square sq = new square();
        sq.getArea();
        sq.getVolume();
        sq.print();
    }
  } 