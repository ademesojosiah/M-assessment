package takeHomeAssessment.weekTwo.dayTwo;

public class Ac extends Bike{
    private int temperature;

    public Ac() {
    }

    public void turnOn(){
       temperature = 16;
       super.turnOn();
    }

    public void turnOff(){
        temperature = 16;
        super.turnOff();
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(!isOn()){
            return;
        }
        int temp = temperature + 1;
        if (temp <= 32 && temp >= 16) {
            temperature = temp;
        };
    }

    public void decreaseTemperature() {
        if(!isOn()){
            return;
        }
        int temp = temperature - 1;
        if (temp <= 32 && temp >= 16) {
            temperature = temp;
        }
    }
}
