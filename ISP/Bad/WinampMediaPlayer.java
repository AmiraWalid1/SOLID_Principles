public class WinampMediaPlayer implements MediaPlayer {
    // Winamp do not support video player
    @Override
    public void playVideo() {
        try {
            throw new VideoUnsupportedException();
        } catch (VideoUnsupportedException e) {
            System.out.println(e.getMessage()+ "by Winamp");
        }
    }

    @Override
    public void playAudio() {
        System.out.println("Playing audio by Winamp..............");

    }
}