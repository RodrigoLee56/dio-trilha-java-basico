public class SmartTv {

    boolean power = false;
    int channel = 1;
    int volume = 25;

    public void turnOnTv() {
        power = true;
    }

    public void turnOffTv() {
        power = false;
    }

    public void increaseVolume() {
        volume++;
        System.out.println("Volume increased: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Volume decreased: " + volume);
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Channel changed to: " + channel);
    }
}