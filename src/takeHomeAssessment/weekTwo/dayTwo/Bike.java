package takeHomeAssessment.weekTwo.dayTwo;

public class Bike {
    private boolean isOn;
    private int gear;
    private int speed;

    public Bike() {
        this.gear = 1;
        this.speed = 0;
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void accelerate() {
        speed += gear;
        changeGear();

    }

    public void deccelerate() {
        speed -= gear;
        changeGear();
    }

    public int getBikeSpeed() {
        return speed;
    }

    public int getBikeGear() {
        return gear;
    }

    private void changeGear(){
        if(this.speed <= 20){
            this.gear = 1;
        }else if(this.speed <= 30){
            this.gear = 2;
        }else if(this.speed <= 40){
            this.gear = 3;
        }else {
            this.gear = 4;
        }
    }
}
