package culturemedia.service.impl;

import java.util.List;

import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.service.CultureMediaService;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.exception.VideoNotFoundExeption;

public class CultureMediaServiceImpl implements CultureMediaService{
    private VideoRepository videoRepository;
    private ViewsRepository viewRepository;

    public CultureMediaServiceImpl(VideoRepository videoRepository, ViewsRepository viewRepository) {
        this.videoRepository = videoRepository;
        this.viewRepository = viewRepository;
    }

    @Override
    public Video add(Video video){
        Video videoAdd = videoRepository.save(video);
        return videoAdd;
    }

    @Override
    public View add(View view) {
        View viewAdd = viewRepository.save(view);
        return viewAdd;
    }

    @Override
    public List<Video> findAllVideos() throws VideoNotFoundExeption {
        List<Video> videos = videoRepository.findAll();
        if(videos.isEmpty()){
            throw new VideoNotFoundExeption();
        }
        else{
            return videos;
        }
    }

    @Override
    public List<Video> find(String title) throws VideoNotFoundExeption {
        List<Video> videos = videoRepository.find(title);
        if(videos.isEmpty()){
            throw new VideoNotFoundExeption();
        }
        else{
            return videos;
        }
    }

    @Override
    public List<Video> find(double fromDuration, double toDuration) throws VideoNotFoundExeption {
        List<Video> videos = videoRepository.find(fromDuration, toDuration);
        if(videos.isEmpty()){
            throw new VideoNotFoundExeption();
        }
        else{
            return videos;
        }
    }
}
