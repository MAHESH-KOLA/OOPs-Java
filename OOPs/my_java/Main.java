import java.util.*;
 class shape{
  
   shape(){
    System.out.println("shape class");
    }
    void getArea(){
       System.out.println("area calculated: ");
       }
    void getPerimeter(){
       System.out.println("perimeter calculated: ");
       }
  }
 
 class Rectangle extends shape{
   int length;
   int bredth;
   Rectangle(int l, int b){
      length=l;
      bredth=b;
      }   
   void getArea(){
     //super.getArea();
     System.out.println(length*bredth);
     }
    void getPerimeter(){
    // super.getPerimeter();
    System.out.println(2*(length+bredth));
    }
  }
  
 class Square extends shape{
    int side;
    Square(int s){
    side=s;
    }
    void getArea(){
    System.out.println(side*side);
    }
    void getPerimeter(){
    System.out.println(4*side);
    }
 }
 
 class Circle extends shape{
    double radius;
    Circle(int r){
    radius=r;
    }
    void getArea(){
    System.out.println(3.14*radius*radius);
    }
    void getPerimeter(){
    System.out.println(2*3.14*radius);
    }
 }
 
class Main{
  public static void main(String args[]){
    shape S=new shape();
    Rectangle R=new Rectangle(2,3);
    R.getArea();
    R.getPerimeter();
    Square Sq=new Square(4);
    Sq.getArea();
    Sq.getPerimeter();
    Circle C=new Circle(4);
    C.getArea();
    C.getPerimeter();
    }
  }
 
