package take_home_assessment.dayThree;

public class BackToSender {

    public  int calculateWage(int successfulDeliveries) {

        int amountPerParcel;
        int basePay = 5000;

        if (successfulDeliveries >= 70) {
            amountPerParcel = 500;
        } else if (successfulDeliveries >= 60) {
            amountPerParcel = 250;
        } else if (successfulDeliveries >= 50) {
            amountPerParcel = 200;
        } else {
            amountPerParcel = 160;
        }

        return (successfulDeliveries * amountPerParcel) + basePay;
    }
}
