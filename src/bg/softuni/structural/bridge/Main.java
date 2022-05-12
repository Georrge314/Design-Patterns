package bg.softuni.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Device radio = new Radio();
        Device tv = new Tv();

        Remote radioRemote = new Remote(radio);
        radioRemote.togglePower();
        radioRemote.channelUp();
        radioRemote.channelUp();
        radioRemote.channelUp();
        radioRemote.volumeDown();
        radioRemote.volumeDown();
        radioRemote.volumeDown();
        System.out.println(radio);

        Remote tvRemote = new Remote(tv);
        tvRemote.togglePower();
        tvRemote.channelDown();
        tvRemote.channelDown();
        tvRemote.channelDown();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        System.out.println(tv);
        AdvancedRemote advancedTvRemote = new AdvancedRemote(tv);
        advancedTvRemote.mute();
        System.out.println(tv);
    }
}
