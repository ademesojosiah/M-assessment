package dayThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import takeHomeAssessment.dayThree.BackToSender;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest {

    BackToSender backToSender;

    @BeforeEach
    void setUp() {
        backToSender = new BackToSender();
    }

    @Test
    public void lessThan50PercentDelivery_calculateWage() {
        assertEquals(9000, backToSender.calculateWage(25));
    }

    @Test
    public void between50And59PercentDelivery_calculateWage() {
        assertEquals(16000, backToSender.calculateWage(55));
    }

    @Test
    public void between60And69PercentDelivery_calculateWage() {
        assertEquals(21250, backToSender.calculateWage(65));
    }

    @Test
    public void greaterThanOrEqual70PercentDelivery_calculateWage() {
        assertEquals(45000, backToSender.calculateWage(80));
    }
}