package bg.softuni.structural.bridge;

public class Remote {
    protected final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeUp(){
        if (device.isEnabled()) {
            int old = device.getVolume();
            if (old == 50) {
                device.setVolume(1);
            } else {
                device.setVolume(old + 1);
            }
        }
    }

    public void volumeDown() {
        if (device.isEnabled()) {
            int old = device.getVolume();
            if (old != 1) {
                device.setVolume(old - 1);
            }
        }
    }

    public void channelUp() {
        if (device.isEnabled()) {
            int old = device.getChannel();
            if (old == 99) {
                device.setChannel(1);
            } else {
                device.setChannel(old + 1);
            }
        }
    }

    public void channelDown() {
        if (device.isEnabled()) {
            int old = device.getChannel();
            if (old == 1) {
                device.setChannel(99);
            } else {
                device.setChannel(old - 1);
            }
        }
    }
}
