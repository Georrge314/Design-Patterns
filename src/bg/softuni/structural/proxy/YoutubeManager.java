package bg.softuni.structural.proxy;


public class YoutubeManager {
    protected ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id) {
        System.out.println("---------------Video Page---------------");
        System.out.println(service.getVideoInfo(id));
        System.out.println("----------------------------------------");
    }

    public void renderListPanel() {
        System.out.println("----------List of other Videos----------");
        System.out.println(String.join("\n", service.listVideos()));
        System.out.println("----------------------------------------");
    }

    public void reactOnUserInput(int id) {
        renderVideoPage(id);
        renderListPanel();
    }
}
