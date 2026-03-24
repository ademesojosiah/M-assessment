package takeHomeAssessment.weekTwo.dayTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    void instantiateBike_turnsBikeOn() {

        Bike bike = new Bike();
        assertFalse(bike.isOn());


        bike.turnOn();
        assertTrue(bike.isOn());

    }

    @Test
    void instantiateBike_turnsBikeOff() {
        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.isOn());

        bike.turnOff();
        assertFalse(bike.isOn());

    }

    @Test
    void accelerateBike_speedIncreases() {
        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0,bike.getBikeSpeed());

        bike.accelerate();

        assertTrue(bike.getBikeSpeed() > 0);
    }

    @Test
    void accelerateBike_gearOne_speedIncreasesByOne() {

        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0,bike.getBikeSpeed());

        bike.accelerate();

        assertEquals(1, bike.getBikeSpeed());
    }

    @Test
    void accelerateBike_gear1_speedIncreasesFrom15To16() {

        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0,bike.getBikeSpeed());

        bike.accelerate();
        assertEquals(1, bike.getBikeSpeed());

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        assertEquals(15, bike.getBikeSpeed());

        bike.accelerate();

        assertEquals(16, bike.getBikeSpeed());


    }



    @Test
    void accelerateBike_gear2_speedIncreasesFrom23To25() {

        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0,bike.getBikeSpeed());

        bike.accelerate();
        assertEquals(1, bike.getBikeSpeed());

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        assertEquals(23, bike.getBikeSpeed());
        assertEquals(2, bike.getBikeGear());

        bike.accelerate();
        assertEquals(25, bike.getBikeSpeed());



    }

    @Test
    void accelerateBike_gear3_speedIncreasesFrom31To34() {

        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0,bike.getBikeSpeed());

        bike.accelerate();
        assertEquals(1, bike.getBikeSpeed());

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        assertEquals(23, bike.getBikeSpeed());
        assertEquals(2, bike.getBikeGear());

        bike.accelerate();
        assertEquals(25, bike.getBikeSpeed());

        bike.accelerate();
        bike.accelerate();


        bike.accelerate();
        assertEquals(3, bike.getBikeGear());
        assertEquals(31, bike.getBikeSpeed());
        bike.accelerate();

        assertEquals(34, bike.getBikeSpeed());


    }

    @Test
    void deccelerateBike_gear1_speedDecreasesFrom15To14() {
        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0,bike.getBikeSpeed());

        bike.accelerate();
        assertEquals(1, bike.getBikeSpeed());

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        assertEquals(15, bike.getBikeSpeed());

        bike.deccelerate();

        assertEquals(14, bike.getBikeSpeed());

    }


    @Test
    void deccelerateBike_gear2_speedDecreasesFrom23To21() {

        Bike bike = new Bike();
        bike.turnOn();
        assertTrue(bike.isOn());

        assertEquals(0,bike.getBikeSpeed());

        bike.accelerate();
        assertEquals(1, bike.getBikeSpeed());

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        assertEquals(23, bike.getBikeSpeed());
        assertEquals(2, bike.getBikeGear());

        bike.deccelerate();
        assertEquals(21, bike.getBikeSpeed());


    }
}
