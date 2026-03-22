package take_home_assessment.dayThree;

import java.util.Scanner;

public class StudentGradeApp {

    static final int MIN_SCORE = 0;
    static final int MAX_SCORE = 100;
    static final int PASS_SCORE = 50;
    static final String DIVIDER_EQUALS = "===============================================================";
    static final String DIVIDER_EXCLAMATION = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int totalNumberOfStudents = scanner.nextInt();

        System.out.print("How many subject do they offer? ");
        int totalNumberOfSubjects = scanner.nextInt();

        int[][] allStudentScoresPerSubject = new int[totalNumberOfStudents][totalNumberOfSubjects];

        collectAllStudentScores(scanner, allStudentScoresPerSubject, totalNumberOfStudents, totalNumberOfSubjects);

        printStudentScoreTable(allStudentScoresPerSubject, totalNumberOfStudents, totalNumberOfSubjects);

        printSubjectSummaryForEachSubject(allStudentScoresPerSubject, totalNumberOfStudents, totalNumberOfSubjects);

        printOverallClassSummary(allStudentScoresPerSubject, totalNumberOfStudents, totalNumberOfSubjects);

        scanner.close();
    }

    private static void collectAllStudentScores(Scanner scanner, int[][] allStudentScoresPerSubject,
                                                 int totalNumberOfStudents, int totalNumberOfSubjects) {
        for (int studentIndex = 0; studentIndex < totalNumberOfStudents; studentIndex++) {
            for (int subjectIndex = 0; subjectIndex < totalNumberOfSubjects; subjectIndex++) {
                System.out.println("Entering score for student " + (studentIndex + 1));
                System.out.print("Enter score for subject " + (subjectIndex + 1) + ": ");
                int enteredScore = scanner.nextInt();

                while (enteredScore < MIN_SCORE || enteredScore > MAX_SCORE) {
                    System.out.print("Invalid! Score must be between 0 and 100. Re-enter: ");
                    enteredScore = scanner.nextInt();
                }

                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
                allStudentScoresPerSubject[studentIndex][subjectIndex] = enteredScore;
                System.out.println("Saved successfully");
            }
        }
    }

    private static int calculateTotalScoreForStudent(int[] studentScoresAcrossAllSubjects) {
        int totalScoreForStudent = 0;
        for (int score : studentScoresAcrossAllSubjects) {
            totalScoreForStudent += score;
        }
        return totalScoreForStudent;
    }

    private static double calculateAverageScoreForStudent(int[] studentScoresAcrossAllSubjects) {
        return (double) calculateTotalScoreForStudent(studentScoresAcrossAllSubjects) / studentScoresAcrossAllSubjects.length;
    }

    private static int[] calculateTotalScoreForEachStudent(int[][] allStudentScoresPerSubject, int totalNumberOfStudents) {
        int[] totalScoreForEachStudent = new int[totalNumberOfStudents];
        for (int studentIndex = 0; studentIndex < totalNumberOfStudents; studentIndex++) {
            totalScoreForEachStudent[studentIndex] = calculateTotalScoreForStudent(allStudentScoresPerSubject[studentIndex]);
        }
        return totalScoreForEachStudent;
    }

    private static int[] calculatePositionRankingForEachStudent(int[] totalScoreForEachStudent, int totalNumberOfStudents) {
        int[] positionRankingForEachStudent = new int[totalNumberOfStudents];
        for (int studentIndex = 0; studentIndex < totalNumberOfStudents; studentIndex++) {
            int studentPosition = 1;
            for (int otherStudentIndex = 0; otherStudentIndex < totalNumberOfStudents; otherStudentIndex++) {
                if (totalScoreForEachStudent[otherStudentIndex] > totalScoreForEachStudent[studentIndex]) {
                    studentPosition++;
                }
            }
            positionRankingForEachStudent[studentIndex] = studentPosition;
        }
        return positionRankingForEachStudent;
    }

    private static void printStudentScoreTable(int[][] allStudentScoresPerSubject,
                                                int totalNumberOfStudents, int totalNumberOfSubjects) {
        System.out.println(DIVIDER_EQUALS);
        System.out.print("STUDENT     ");
        for (int subjectIndex = 0; subjectIndex < totalNumberOfSubjects; subjectIndex++) {
            System.out.print("SUB" + (subjectIndex + 1 + "      "));
        }
        System.out.print("TOT      AVE       POS     \n");
        System.out.println(DIVIDER_EQUALS);

        int[] totalScoreForEachStudent = calculateTotalScoreForEachStudent(allStudentScoresPerSubject, totalNumberOfStudents);
        int[] positionRankingForEachStudent = calculatePositionRankingForEachStudent(totalScoreForEachStudent, totalNumberOfStudents);

        for (int studentIndex = 0; studentIndex < totalNumberOfStudents; studentIndex++) {
            System.out.printf("%s  ", "Student " + (studentIndex + 1));
            for (int subjectIndex = 0; subjectIndex < totalNumberOfSubjects; subjectIndex++) {
                System.out.printf("  %d      ", allStudentScoresPerSubject[studentIndex][subjectIndex]);
            }
            double averageScoreForStudent = calculateAverageScoreForStudent(allStudentScoresPerSubject[studentIndex]);
            System.out.printf("%d       %.2f        %d     %n",
                    totalScoreForEachStudent[studentIndex],
                    averageScoreForStudent,
                    positionRankingForEachStudent[studentIndex]);
        }
        System.out.println(DIVIDER_EQUALS);
    }

    private static void printSubjectSummaryForEachSubject(int[][] allStudentScoresPerSubject,
                                                           int totalNumberOfStudents, int totalNumberOfSubjects) {
        System.out.println("SUBJECT SUMMARY");
        for (int index = 0; index < totalNumberOfSubjects; index++) {
            int highestScoreInSubject = allStudentScoresPerSubject[0][index];
            int lowestScoreInSubject = allStudentScoresPerSubject[0][index];
            int highestScoringStudentIndex = 0;
            int lowestScoringStudentIndex = 0;
            int totalScoreForSubject = 0;
            int numberOfStudentsWhoPassedSubject = 0;
            int numberOfStudentsWhoFailedSubject = 0;

            for (int studentIndex = 0; studentIndex < totalNumberOfStudents; studentIndex++) {
                int currentStudentScoreInSubject = allStudentScoresPerSubject[studentIndex][index];
                totalScoreForSubject += currentStudentScoreInSubject;

                if (currentStudentScoreInSubject > highestScoreInSubject) {
                    highestScoreInSubject = currentStudentScoreInSubject;
                    highestScoringStudentIndex = studentIndex;
                }
                if (currentStudentScoreInSubject < lowestScoreInSubject) {
                    lowestScoreInSubject = currentStudentScoreInSubject;
                    lowestScoringStudentIndex = studentIndex;
                }
                if (currentStudentScoreInSubject >= PASS_SCORE) {
                    numberOfStudentsWhoPassedSubject++;
                } else {
                    numberOfStudentsWhoFailedSubject++;
                }
            }

            double averageScoreForSubject = (double) totalScoreForSubject / totalNumberOfStudents;

            System.out.println("Subject " + (index + 1));
            System.out.println("Highest scoring student is: Student " + (highestScoringStudentIndex + 1) + " scoring " + highestScoreInSubject);
            System.out.println("Lowest Scoring student is: Student " + (lowestScoringStudentIndex + 1) + " scoring " + lowestScoreInSubject);
            System.out.println("Total Score is: " + totalScoreForSubject);
            System.out.printf("Average score is: %.2f%n", averageScoreForSubject);
            System.out.println("Number of passes: " + numberOfStudentsWhoPassedSubject);
            System.out.println("Number of Fails: " + numberOfStudentsWhoFailedSubject);
            System.out.println();
        }
    }

    private static void printOverallClassSummary(int[][] allStudentScoresPerSubject,
                                                  int totalNumberOfStudents, int totalNumberOfSubjects) {
        int[] totalScoreForEachStudent = calculateTotalScoreForEachStudent(allStudentScoresPerSubject, totalNumberOfStudents);

        int bestGraduatingStudentIndex = 0;
        int worstGraduatingStudentIndex = 0;
        int overallHighestScoreInClass = allStudentScoresPerSubject[0][0];
        int overallLowestScoreInClass = allStudentScoresPerSubject[0][0];
        int overallHighestScoringStudentIndex = 0;
        int overallHighestScoringSubjectIndex = 0;
        int overallLowestScoringStudentIndex = 0;
        int overallLowestScoringSubjectIndex = 0;
        int hardestSubjectIndex = 0;
        int easiestSubjectIndex = 0;
        int[] numberOfFailuresPerSubject = new int[totalNumberOfSubjects];
        int[] numberOfPassesPerSubject = new int[totalNumberOfSubjects];
        int classTotalScore = 0;

        for (int studentIndex = 0; studentIndex < totalNumberOfStudents; studentIndex++) {
            classTotalScore += totalScoreForEachStudent[studentIndex];

            if (totalScoreForEachStudent[studentIndex] > totalScoreForEachStudent[bestGraduatingStudentIndex]) {
                bestGraduatingStudentIndex = studentIndex;
            }
            if (totalScoreForEachStudent[studentIndex] < totalScoreForEachStudent[worstGraduatingStudentIndex]) {
                worstGraduatingStudentIndex = studentIndex;
            }

            for (int subjectIndex = 0; subjectIndex < totalNumberOfSubjects; subjectIndex++) {
                int currentScore = allStudentScoresPerSubject[studentIndex][subjectIndex];

                if (currentScore > overallHighestScoreInClass) {
                    overallHighestScoreInClass = currentScore;
                    overallHighestScoringStudentIndex = studentIndex;
                    overallHighestScoringSubjectIndex = subjectIndex;
                }
                if (currentScore < overallLowestScoreInClass) {
                    overallLowestScoreInClass = currentScore;
                    overallLowestScoringStudentIndex = studentIndex;
                    overallLowestScoringSubjectIndex = subjectIndex;
                }

                if (currentScore < PASS_SCORE) {
                    numberOfFailuresPerSubject[subjectIndex]++;
                } else {
                    numberOfPassesPerSubject[subjectIndex]++;
                }
            }
        }

        for (int subjectIndex = 0; subjectIndex < totalNumberOfSubjects; subjectIndex++) {
            if (numberOfFailuresPerSubject[subjectIndex] > numberOfFailuresPerSubject[hardestSubjectIndex]) {
                hardestSubjectIndex = subjectIndex;
            }
            if (numberOfPassesPerSubject[subjectIndex] > numberOfPassesPerSubject[easiestSubjectIndex]) {
                easiestSubjectIndex = subjectIndex;
            }
        }

        double classAverageScore = (double) classTotalScore / totalNumberOfStudents;

        System.out.println("The hardest subject is Subject " + (hardestSubjectIndex + 1) + " with " + numberOfFailuresPerSubject[hardestSubjectIndex] + " failures");
        System.out.println("The easiest subject is Subject " + (easiestSubjectIndex + 1) + " with " + numberOfPassesPerSubject[easiestSubjectIndex] + " passes");
        System.out.println("The overall Highest score is scored by Student " + (overallHighestScoringStudentIndex + 1) + " in subject " + (overallHighestScoringSubjectIndex + 1) + " scoring " + overallHighestScoreInClass);
        System.out.println("The overall Lowest score is scored by Student " + (overallLowestScoringStudentIndex + 1) + " in subject " + (overallLowestScoringSubjectIndex + 1) + " scoring " + overallLowestScoreInClass);

        System.out.println(DIVIDER_EQUALS);
        System.out.println("CLASS SUMMARY");
        System.out.println(DIVIDER_EQUALS);
        System.out.println("Best Graduating Student is: Student " + (bestGraduatingStudentIndex + 1) + " scoring " + totalScoreForEachStudent[bestGraduatingStudentIndex]);
        System.out.println(DIVIDER_EQUALS);
        System.out.println(DIVIDER_EXCLAMATION);
        System.out.println("Worst Graduating Student is: Student " + (worstGraduatingStudentIndex + 1) + " scoring " + totalScoreForEachStudent[worstGraduatingStudentIndex]);
        System.out.println(DIVIDER_EXCLAMATION);
        System.out.println(DIVIDER_EQUALS);
        System.out.println("Class total score is: " + classTotalScore);
        System.out.printf("Class Average score is: %.1f%n", classAverageScore);
        System.out.println(DIVIDER_EQUALS);
    }
}