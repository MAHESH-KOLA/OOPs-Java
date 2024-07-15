import java.util.ArrayList;

class al{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(10);
        a.add(2);
        a.add(3);
        for(Integer i: a){
            System.out.println(i);
        }
    }
}