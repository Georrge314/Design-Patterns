package bg.softuni.structural.proxy;

import java.util.List;

public class ThirdPartyYoutubeLibClass implements ThirdPartyYoutubeLib {
    private final List<String> videos;

    public ThirdPartyYoutubeLibClass() {
        videos = List.of(
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&t=44s",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4iSDAHJ@21",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&ta231rafssa",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&t-dadsa==dasdsa",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&t=44dassadsad",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&t=44@12hidsas",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&t=44dasda@DAs",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&t=dASDAAAASDwq",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&t=44sSDada@RR",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&t=s@3s@$FSA",
                "https://www.youtube.com/watch?v=-3m2_wHWXf4&t=44Asd@@#");
    }

    @Override
    public List<String> listVideos() {
        return videos;
    }

    @Override
    public String getVideoInfo(int id) {
        return videos.get(id);
    }

    @Override
    public void downloadVideo(int id) {
        if (id <= 0 && id < videos.size()) {
            System.out.println("Downloading video with url: " + videos.get(id));
        }
    }
}
