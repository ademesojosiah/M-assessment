package takeHomeAssessment.weekTwo.dayTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {


    @Test
    void instantiateAc_turnsAcOn() {

        Ac ac = new Ac();
        assertFalse(ac.isOn());


        ac.turnOn();
        assertTrue(ac.isOn());

    }

    @Test
    void instantiateAc_turnsAcOff() {

        Ac ac = new Ac();
        ac.turnOn();
        assertTrue(ac.isOn());

        ac.turnOff();
        assertFalse(ac.isOn());

    }

    @Test
    void increasesTemperature_TemperatureIncreases() {

        Ac ac = new Ac();
        ac.turnOn();
        assertTrue(ac.isOn());

        assertEquals(16,ac.getTemperature());

        ac.increaseTemperature();

        assertEquals(17,ac.getTemperature());


    }

    @Test
    void decreaseTemperature_TemperatureDecreases() {

        Ac ac = new Ac();
        ac.turnOn();
        assertTrue(ac.isOn());

        assertEquals(16,ac.getTemperature());

        ac.increaseTemperature();

        assertEquals(17,ac.getTemperature());

        ac.decreaseTemperature();

        assertEquals(16,ac.getTemperature());


    }

    @Test
    void decreaseTemperatureBelow16_NothingHappens(){
        Ac ac = new Ac();
        ac.turnOn();
        assertTrue(ac.isOn());
        assertEquals(16,ac.getTemperature());
        ac.decreaseTemperature();

        assertEquals(16,ac.getTemperature());
    }
}
