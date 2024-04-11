package culturemedia.exception;
import java.text.MessageFormat;

public class DurationNotValidExeption extends CultureMediaException{
    public DurationNotValidExeption(String title, Double duration) {
        super(MessageFormat.format("Duration not valid for video: {0} and duration: {1}", title, duration));
    }
}
