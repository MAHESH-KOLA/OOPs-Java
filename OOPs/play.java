import s.dolby;
import s.podcast;

class play implements dolby{
    public void playDolby(){
        System.out.println("interface");
    }
    public static void main(String[] args) {
        podcast p=new podcast();
        p.play();
    }
}