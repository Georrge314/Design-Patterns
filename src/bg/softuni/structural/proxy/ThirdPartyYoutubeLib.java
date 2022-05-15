package bg.softuni.structural.proxy;

import java.util.List;

public interface ThirdPartyYoutubeLib {
    List<String> listVideos();
    String getVideoInfo(int id);
    void downloadVideo(int id);
}
