package takeHomeAssessment.weekTwo.dayOne;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {



    @Test
    public void testPerson_canHaveProblems() {
        Person person = new Person("josiah");
        assertEquals(new ArrayList<Problem>(), person.getProblems());
    }

    @Test
    public void testPerson_canAddProblem() {
        Person person = new Person("josiah");

        Problem problem = new Problem("financial gbese", "Financial");

        person.addProblem(problem);

        assertTrue(person.getProblems().contains(problem));
    }

    @Test
    public void testPerson_canSolveProblem() {
        Person person = new Person("josiah");

        Problem problem = new Problem("financial gbese", "Financial");

        person.addProblem(problem);

        person.getProblem(problem.getName()).solveProblem();
        assertTrue(person.getProblem(problem.getName()).isSolved());
    }


    @Test
    public void testPerson_canTellProblems() {
        Person person = new Person("josiah");

        Problem problem1 = new Problem("financial gbese", "Financial");
        Problem problem2 = new Problem("Technical depth", "Technical");

        person.addProblem(problem1);
        person.addProblem(problem2);

        person.getProblem(problem1.getName()).solveProblem();
        assertTrue(person.tellProblems().contains(problem2));
    }

}
