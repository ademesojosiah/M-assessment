package takeHomeAssessment.weekTwo.dayOne;

import org.junit.jupiter.api.Test;
import takeHomeAssessment.weekTwo.dayOne.enums.ProblemType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {

    @Test
    public void createProblem_withNameAndType() {
        Problem problem = new Problem("financial gbese", "Financial");

        assertEquals("financial gbese",problem.getName());
        assertEquals(ProblemType.FINANCIAL,problem.getType());
    }
}
