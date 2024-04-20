package culturemedia.service;
import culturemedia.model.*;
import java.util.List;
import culturemedia.exception.VideoNotFoundExeption;

public interface CultureMediaService {
    List<Video> findAllVideos() throws VideoNotFoundExeption;
    Video add(Video video);
    View add(View view);
}
