import java.util.*;

class person{
  String name;
   String address;
   person(String name, String address){
        this.name=name;
        this.address=address;
        }
   void getName(){
     System.out.println(name);
     }
   void getAddress(){
     System.out.println(address);
     }
}     
     
class Main2{
 public static void main(String args[]){
 	person P=new person("maahi", "Dharmapuri");
 	P.getName();
 	P.getAddress();
   }
   }
