package takeHomeAssessment.weekTwo.dayTwo;

public class Tv extends Bike{
    private int volume;
    private int channel;
    private String brand;

    public Tv(String brand){
        this.brand = brand;
    }

    @Override
    public void turnOn(){
        volume = 1;
        channel = 1;
        super.turnOn();

    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        int newVolume = volume + 1;
        validateNewVolume(newVolume);
    }

    public void decreaseVolume() {
        int newVolume = volume - 1;
        validateNewVolume(newVolume);
    }

    public int changeChannel(int channel) {
        validateNewChanel(channel);
        return this.channel;
    }

    public int getChannel() {
        return channel;
    }

    private void validateNewVolume(int newVolume) {
        if(newVolume <= 100 && newVolume >= 0){
            volume = newVolume;
        }
    }

    private void validateNewChanel(int channelNumber) {
        if(channelNumber <= 10 && channelNumber >= 1){
            channel = channelNumber;
        }
    }
}
