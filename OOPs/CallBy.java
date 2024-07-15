import java.util.*;
import java.lang.*;
// class callByValue{
//     int a=10;
//     void sum(int a){
//         a=a+10;
//         System.out.println("age in local: " + a);
//     }
// }
class callByReference{
    int a=10;
    void sum(callByReference ref){
        ref.a=ref.a+12;
        System.out.println("age in local: " + ref.a);
    }
}

public class CallBy{
    public static void main(String[] args) {
        callByReference ref=new callByReference();
        System.out.println(ref.a);
        ref.sum(ref);
        System.out.println(ref.a);
    }
}
