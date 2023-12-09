public class VideoUnsupportedException extends Exception
{
    public VideoUnsupportedException()
    {
        super("Play video is not supported");
    }
}