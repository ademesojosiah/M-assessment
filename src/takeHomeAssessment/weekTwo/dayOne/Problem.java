package takeHomeAssessment.weekTwo.dayOne;

import takeHomeAssessment.weekTwo.dayOne.enums.ProblemType;

public class Problem {
    private String name;
    private ProblemType type;
    private boolean isSolved;

    public Problem(String name, String type) {
        this.name = name;
        this.type = ProblemType.valueOf(type.toUpperCase());
        this.isSolved = false;
    }

    public String getName() {
        return name;
    }

    public ProblemType getType() {
        return type;
    }

    public void solveProblem() {
        this.isSolved = true;
    }

    public boolean isSolved() {
        return isSolved;
    }
}
