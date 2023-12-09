public class Main {
    public static void main(String[] args)  {
        System.out.println("__________________________________\n");
        DivMediaPlayer Div = new DivMediaPlayer();
        Div.playVideo();
        Div.playAudio();
        System.out.println("__________________________________\n");
        VlcMediaPlayer Vlc= new VlcMediaPlayer();
        Vlc.playVideo();
        Vlc.playAudio();
        System.out.println("__________________________________\n");
        WinampMediaPlayer Winamp= new WinampMediaPlayer();
        Winamp.playAudio();
        System.out.println("__________________________________\n");

    }
}