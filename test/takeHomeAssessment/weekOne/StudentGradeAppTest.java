package takeHomeAssessment.weekOne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeAppTest {

    int[][] allStudentsScoresPerSubject;

    @BeforeEach
    void setUp() {
        allStudentsScoresPerSubject = new int[][]{
                {67, 21, 49},
                {98, 62, 56},
                {93, 34, 27},
                {78, 83, 66}
        };
    }

    @Test
    public void calculateStudentTotalScore_returnsCorrectTotal() {
        assertEquals(137, StudentGradeApp.calculateStudentTotalScore(allStudentsScoresPerSubject[0]));
    }

    @Test
    public void calculateStudentAverageScore_returnsCorrectAverage() {
        assertEquals(45.67, StudentGradeApp.calculateStudentAverageScore(allStudentsScoresPerSubject[0]), 0.01);
    }

    @Test
    public void calculateTotalScoreForEachStudent_returnsCorrectTotals() {
        assertArrayEquals(new int[]{137, 216, 154, 227},
                StudentGradeApp.calculateTotalScoreForEachStudent(allStudentsScoresPerSubject));
    }

    @Test
    public void calculateEachStudentPosition_returnsCorrectPositions() {
        int[] totalScores = {137, 216, 154, 227};
        assertArrayEquals(new int[]{4, 2, 3, 1},
                StudentGradeApp.calculateEachStudentPosition(totalScores));
    }

    @Test
    public void calculateBestGraduatingStudent_returnsStudentWithHighestTotal() {
        int[] totalScores = {137, 216, 154, 227};
        assertArrayEquals(new int[]{227, 3},
                StudentGradeApp.calculateBestGraduatingStudent(totalScores));
    }

    @Test
    public void calculateWorstGraduatingStudent_returnsStudentWithLowestTotal() {
        int[] totalScores = {137, 216, 154, 227};
        assertArrayEquals(new int[]{137, 0},
                StudentGradeApp.calculateWorstGraduatingStudent(totalScores));
    }


    @Test
    public void calculateEasiestSubject_returnsSubjectWithMostPasses() {
        assertArrayEquals(new int[]{4, 0},
                StudentGradeApp.calculateEasiestSubject(allStudentsScoresPerSubject, 3));
    }
}