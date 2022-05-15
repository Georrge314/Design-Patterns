package bg.softuni.structural.proxy;

import java.util.ArrayList;
import java.util.List;

//proxy class
public class CachedYoutubeClass implements ThirdPartyYoutubeLib {
    private final ThirdPartyYoutubeLib service;
    private final List<String> listCache = new ArrayList<>();
    private String videoCache;
    private boolean needReset;

    public CachedYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    @Override
    public List<String> listVideos() {
        if (listCache.isEmpty() || needReset) {
            listCache.addAll(service.listVideos());
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(int id) {
        if (videoCache == null || needReset) {
            videoCache = service.getVideoInfo(id);
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        if (downloadExists(id) || needReset) {
            service.downloadVideo(id);
        }
    }

    //pseudo method
    private boolean downloadExists(int id) {
        return id % 2 == 0;
    }
}
