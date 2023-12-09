public class Main {
    public static void main(String[] args)  {
        System.out.println("__________________________________\n");
        MediaPlayer Div = new DivMediaPlayer();
        Div.playVideo();
        Div.playAudio();
        System.out.println("__________________________________\n");
        MediaPlayer Vlc= new VlcMediaPlayer();
        Vlc.playVideo();
        Vlc.playAudio();
        System.out.println("__________________________________\n");
        MediaPlayer Winamp= new WinampMediaPlayer();
        Winamp.playVideo();
        Winamp.playAudio();
        System.out.println("__________________________________\n");

    }
}