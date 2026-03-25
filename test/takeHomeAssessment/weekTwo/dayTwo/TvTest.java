package takeHomeAssessment.weekTwo.dayTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TvTest {

    @Test
    void instantiateTv_turnsTvOn() {
        Tv tv = new Tv("Samsung");
        assertFalse(tv.isOn());

        tv.turnOn();
        assertTrue(tv.isOn());
    }

    @Test
    void turnOnTv_setsVolumeAndChannelToOne() {
        Tv tv = new Tv("Samsung");
        tv.turnOn();

        assertEquals(1, tv.getVolume());
        assertEquals(1, tv.getChannel());
    }

    @Test
    void increaseVolume_volumeIncreases() {
        Tv tv = new Tv("Samsung");
        tv.turnOn();

        assertEquals(1, tv.getVolume());

        tv.increaseVolume();

        assertEquals(2, tv.getVolume());
    }

    @Test
    void decreaseVolume_volumeDecreases() {
        Tv tv = new Tv("Samsung");
        tv.turnOn();

        tv.increaseVolume();
        assertEquals(2, tv.getVolume());

        tv.decreaseVolume();
        assertEquals(1, tv.getVolume());
    }

    @Test
    void decreaseVolumeBelowZero_nothingHappens() {
        Tv tv = new Tv("Samsung");
        tv.turnOn();

        assertEquals(1, tv.getVolume());

        tv.decreaseVolume();

        assertEquals(0, tv.getVolume());

        tv.decreaseVolume();

        assertEquals(0, tv.getVolume());
    }

    @Test
    void increaseVolumeAbove100_nothingHappens() {
        Tv tv = new Tv("Samsung");
        tv.turnOn();

        for (int i = 1; i <= 99; i++) {
            tv.increaseVolume();
        }

        assertEquals(100, tv.getVolume());

        tv.increaseVolume();

        assertEquals(100, tv.getVolume());
    }

    @Test
    void changeChannel_channelChanges() {
        Tv tv = new Tv("Samsung");
        tv.turnOn();

        assertEquals(1, tv.getChannel());

        tv.changeChannel(5);

        assertEquals(5, tv.getChannel());
    }

    @Test
    void changeChannelAbove10_nothingHappens() {
        Tv tv = new Tv("Samsung");
        tv.turnOn();

        assertEquals(1, tv.getChannel());

        tv.changeChannel(11);

        assertEquals(1, tv.getChannel());
    }

    @Test
    void changeChannelBelow1_nothingHappens() {
        Tv tv = new Tv("Samsung");
        tv.turnOn();

        assertEquals(1, tv.getChannel());

        tv.changeChannel(0);

        assertEquals(1, tv.getChannel());
    }
}