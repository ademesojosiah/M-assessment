package takeHomeAssessment.weekTwo.dayTwo;

public class Ac extends Bike{
    private int temperature;

    public Ac() {
    }

    @Override
    public void turnOn(){
       temperature = 16;
       super.turnOn();
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(!isOn()){
            return;
        }
        int temp = temperature + 1;
        validateTemperature(temp);
    }

    private void validateTemperature(int temp) {
        if (temp <= 32 && temp >= 16) {
            temperature = temp;
        }
    }

    public void decreaseTemperature() {
        if(!isOn()){
            return;
        }
        int temp = temperature - 1;
        validateTemperature(temp);
    }
}
