package bg.softuni.structural.bridge;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        if (device.isEnabled()) {
            device.setVolume(0);
        }
    }
}
