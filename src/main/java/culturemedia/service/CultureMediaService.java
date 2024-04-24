package culturemedia.service;
import culturemedia.model.*;
import java.util.List;
import culturemedia.exception.VideoNotFoundException;

public interface CultureMediaService {
    List<Video> findAllVideos() throws VideoNotFoundException;
    List<Video> find(String title) throws VideoNotFoundException;
    List<Video> find(double fromDuration, double toDuration) throws VideoNotFoundException;
    Video add(Video video);
    View add(View view);
}
