package culturemedia.exception;

import java.text.MessageFormat;


public class VideoNotFoundException extends CultureMediaException{
    public VideoNotFoundException() {
        super("Videos not found");
    }
    public VideoNotFoundException(String title) {
        super(MessageFormat.format("Video not found with title: {0}", title));
    }
}
