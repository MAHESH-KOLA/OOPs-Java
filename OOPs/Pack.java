package sounds;

interface dolby{
     void playPodcast();
}
abstract class Inter implements dolby{
    abstract void PlayPodcast();
}
class Podcast extends Inter{
    public void PlayPodcast(){
        System.out.println("play XXXXXsound");
    }
}

public class Pack{
    public static void main(String[] args) {
     Podcast P = new Podcast();
    P.PlayPodcast();   
    }
}