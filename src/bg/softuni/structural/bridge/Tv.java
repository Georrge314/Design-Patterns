package bg.softuni.structural.bridge;

public class Tv implements Device {
    private int volume = 20;
    private int channel = 1;
    private boolean enabled;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tv{");
        sb.append("volume=").append(volume);
        sb.append(", channel=").append(channel);
        sb.append(", enabled=").append(enabled);
        sb.append('}');
        return sb.toString();
    }
}
