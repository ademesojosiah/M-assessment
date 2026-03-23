package takeHomeAssessment.dayThree;

import morningDrills.NumberToWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToWordsTest {


    @Test
    public void testNumberToWordsLessThan10_with6_returnsSix() {
        assertEquals("SIX", NumberToWords.numberToWords(6));
    }
    @Test
    public void testNumberToWordsLessThan20_with10_returnsTen() {
        assertEquals("TEN", NumberToWords.numberToWords(10));
    }

    @Test
    public void testNumberToWordsLessThan100_with56_returnsFiftySix() {
        assertEquals("FIFTY SIX", NumberToWords.numberToWords(56));
    }
}
