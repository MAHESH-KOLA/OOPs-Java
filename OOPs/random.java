import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random= new Random();
        for(int i=0;i<10;i++){
            int val=random.nextInt(5,10);
            System.out.println(val);
        }
    }
}
