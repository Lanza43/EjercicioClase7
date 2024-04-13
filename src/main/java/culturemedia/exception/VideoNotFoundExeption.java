package culturemedia.exception;

import java.text.MessageFormat;


public class VideoNotFoundExeption extends CultureMediaException{
    public VideoNotFoundExeption() {
        super("Videos not found");
    }
    public VideoNotFoundExeption(String title) {
        super(MessageFormat.format("Video not found with title: {0}", title));
    }
}
