import pack.A;
import pack.B;

class C{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.m1();
        b.m2();
        a.m2();
    }
}