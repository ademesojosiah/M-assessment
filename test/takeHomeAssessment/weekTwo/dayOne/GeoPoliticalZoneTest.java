package takeHomeAssessment.weekTwo.dayOne;

import org.junit.jupiter.api.Test;
import takeHomeAssessment.weekTwo.dayOne.enums.PoliticalZones;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalZoneTest {


    @Test
    public void tellPoliticalZone_forOndoState_willReturn_southWest() {
        assertEquals("South West", PoliticalZones.getGeoPoliticalZone("ondo"));
    }


    @Test
    public void tellPoliticalZone_forImoState_willReturn_southEast() {
        assertEquals("South East", PoliticalZones.getGeoPoliticalZone("imo"));
    }
}
