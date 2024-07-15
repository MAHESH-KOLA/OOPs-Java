 class sub{
   
    static void add(){
        System.out.println(12);
    }
}

public class overload {
    static void sum(int a, int b){
        System.out.println(a+b);
    }
     static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void sum(double a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        sum(2,3,4);
        sum(2,3);
        sum(123.32);
        sub.add();
    }
}
