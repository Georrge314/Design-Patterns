package bg.softuni.structural.proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ThirdPartyYoutubeLib youtubeLib = new ThirdPartyYoutubeLibClass();
        ThirdPartyYoutubeLib proxyYoutubeLib = new CachedYoutubeClass(youtubeLib);
        YoutubeManager manager = new YoutubeManager(proxyYoutubeLib);
        System.out.println("Enter video id:");
        int id = scan.nextInt();
        manager.reactOnUserInput(id);
    }
}
