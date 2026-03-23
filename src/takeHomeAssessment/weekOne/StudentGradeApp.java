package takeHomeAssessment.weekOne;

import java.util.Scanner;

public class StudentGradeApp {

    static final String SAVING = "Saving >>>>>>>>>>>>>>>>>>>>>>>>>";
    static final String SAVED_SUCCESSFULLY = "Saved successfully";
    static final int MIN_SCORE = 0;
    static final int MAX_SCORE = 100;
    static final String EQUAL_SIGNS = "======================================================";
    static final String DIVIDER_EXCLAMATION = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students do you have? ");
        int totalNumberOfStudents = sc.nextInt();

        System.out.println("How many subjects do they offer? ");
        int totalNumberOfSubject = sc.nextInt();

        System.out.println(SAVING);
        System.out.println(SAVED_SUCCESSFULLY);
        System.out.println();
        System.out.println();

        int[][] allStudentsScoresPerSubject = new int[totalNumberOfStudents][totalNumberOfSubject];

        collectStudentScores(sc,totalNumberOfStudents,totalNumberOfSubject,allStudentsScoresPerSubject);
        System.out.println();
        System.out.println();
        displayStudentScoreTable(totalNumberOfSubject, totalNumberOfStudents, allStudentsScoresPerSubject);
        System.out.println();
        System.out.println();
        displaySubjectSummary(totalNumberOfSubject,allStudentsScoresPerSubject);
        System.out.println();
        System.out.println();
        displayOverAllSummary(totalNumberOfSubject,totalNumberOfStudents,allStudentsScoresPerSubject);
    }

    public static void displayOverAllSummary(int totalNumberOfSubject, int totalNumberOfStudents, int[][] allStudentsScoresPerSubject) {

        int[] totalScoresPerStudent = calculateTotalScoreForEachStudent(allStudentsScoresPerSubject);
        int[] bestGraduatingStudent = calculateBestGraduatingStudent(totalScoresPerStudent);
        int[] worstGraduatingStudent = calculateWorstGraduatingStudent(totalScoresPerStudent);

        int[] overallHighestScore = calculateOverallHighestScore(totalNumberOfStudents,totalNumberOfSubject,allStudentsScoresPerSubject);
        int[] overallLowestScore = calculateOverallLowestScore(totalNumberOfStudents,totalNumberOfSubject,allStudentsScoresPerSubject);

        int classTotalScore = calculateClassTotalScore(totalScoresPerStudent);
        double classAverageScore = calculateClassAverageScore(totalScoresPerStudent);

        int[] hardestSubject = calculateHardestSubject(allStudentsScoresPerSubject,totalNumberOfSubject);
        int[] easiestSubject = calculateEasiestSubject(allStudentsScoresPerSubject,totalNumberOfSubject);


        System.out.println("The hardest subject is Subject " + (hardestSubject[1] + 1) + " with " + hardestSubject[0] + " failures");
        System.out.println("The easiest subject is Subject " + (easiestSubject[1] + 1) + " with " + easiestSubject[0] + " passes");
        System.out.println("The overall Highest score is scored by Student " + (overallHighestScore[2] + 1) + " in subject " + (overallHighestScore[1] + 1) + " scoring " + overallHighestScore[0]);
        System.out.println("The overall Lowest score is scored by Student " + (overallLowestScore[2] + 1) + " in subject " + (overallLowestScore[1] + 1) + " scoring " + overallLowestScore[0]);

        System.out.println(EQUAL_SIGNS);
        System.out.println("CLASS SUMMARY");
        System.out.println(EQUAL_SIGNS);
        System.out.println("Best Graduating Student is: Student " + (bestGraduatingStudent[1] + 1) + " scoring " + bestGraduatingStudent[0]);
        System.out.println(EQUAL_SIGNS);
        System.out.println(DIVIDER_EXCLAMATION);
        System.out.println("Worst Graduating Student is: Student " + (worstGraduatingStudent[1] + 1) + " scoring " + worstGraduatingStudent[0]);
        System.out.println(DIVIDER_EXCLAMATION);
        System.out.println(EQUAL_SIGNS);
        System.out.println("Class total score is: " +  classTotalScore);
        System.out.printf("Class Average score is: %.1f%n", classAverageScore);
        System.out.println(EQUAL_SIGNS);    }

    public static int[] calculateEasiestSubject(int[][] allStudentsScoresPerSubject, int totalNumberOfSubjects) {
        int[] totalPassesPerSubject = calculateTotalPassesPerSubject(allStudentsScoresPerSubject, totalNumberOfSubjects);

        int easiestSubject = 0;
        int numberOfPasses = 0;
        for (int subject = 0; subject < totalNumberOfSubjects; subject++) {
            if(totalPassesPerSubject[subject] > numberOfPasses) {
                easiestSubject = subject ;
            }
            numberOfPasses = Math.max(totalPassesPerSubject[subject] , numberOfPasses);

        }

        return new int[]{numberOfPasses, easiestSubject};

    }

    public static int[] calculateHardestSubject(int[][] allStudentsScoresPerSubject, int totalNumberOfSubjects) {
        int[] totalPassesPerSubject = calculateTotalPassesPerSubject(allStudentsScoresPerSubject, totalNumberOfSubjects);

        int hardestSubject = 0;
        int numberOfPasses = totalPassesPerSubject[0];

        for (int subjectIndex = 0; subjectIndex < totalNumberOfSubjects; subjectIndex++) {
            if (totalPassesPerSubject[subjectIndex] < numberOfPasses) {
                numberOfPasses = totalPassesPerSubject[subjectIndex];
                hardestSubject = subjectIndex;
            }
        }

        int totalNumberOfStudents = allStudentsScoresPerSubject.length;
        int numberOfFails = totalNumberOfStudents - numberOfPasses;

        return new int[]{numberOfFails, hardestSubject};
    }

    public static int[] calculateTotalPassesPerSubject(int[][] allStudentsScoresPerSubject, int totalNumberOfSubjects) {
        int[] totalPassesPerSubject = new int[totalNumberOfSubjects];
        for (int subjectIndex = 0; subjectIndex < totalNumberOfSubjects; subjectIndex++) {
            int passes = 0;
            for (int[] studentScores : allStudentsScoresPerSubject) {
                if (studentScores[subjectIndex] >= 50) {
                    passes++;
                }
            }
            totalPassesPerSubject[subjectIndex] = passes;
        }
        return totalPassesPerSubject;
    }



    public static int[] calculateOverallLowestScore(int totalNumberOfStudents, int totalNumberOfSubject, int[][] allStudentsScoresPerSubject) {
        int overallLowestScore = allStudentsScoresPerSubject[0][0];
        int overallLowestStudent = 0;
        int overallLowestSubject = 0;

        for (int student = 0; student < totalNumberOfStudents; student++) {
            for (int subject = 0; subject < totalNumberOfSubject; subject++) {

                if (allStudentsScoresPerSubject[student][subject] < overallLowestScore) {
                    overallLowestStudent = student;
                    overallLowestSubject = subject;
                }

                overallLowestScore = Math.min(allStudentsScoresPerSubject[student][subject], overallLowestScore);
            }
        }

        return new int[]{overallLowestScore, overallLowestSubject, overallLowestStudent};
    }

    public static int[] calculateOverallHighestScore(int totalNumberOfStudents, int totalNumberOfSubject, int[][] allStudentsScoresPerSubject) {
        int overallHighestScore = 0 ;
        int overallHighestStudent = 0 ;
        int overallHighestSubject = 0 ;
        for (int student = 0; student < totalNumberOfStudents; student++) {

            for (int subject = 0; subject < totalNumberOfSubject; subject++) {

                if (allStudentsScoresPerSubject[student][subject] > overallHighestScore) {
                    overallHighestStudent = student;
                    overallHighestSubject = subject;
                }

                overallHighestScore = Math.max(allStudentsScoresPerSubject[student][subject], overallHighestScore);

            }

        }

        return new int[]{overallHighestScore, overallHighestSubject,overallHighestStudent};
    }

    public static double calculateClassAverageScore(int[] totalScoresPerStudent) {
        int totalScore = calculateClassTotalScore(totalScoresPerStudent);
        return (double) totalScore / totalScoresPerStudent.length;
    }

    public static int calculateClassTotalScore(int[] totalScoresPerStudent) {
        int totalScore = 0;
        for (int score : totalScoresPerStudent) {
            totalScore += score;
        }
        return totalScore;
    }

    public static int[] calculateWorstGraduatingStudent(int[] totalScoresPerStudent) {
        int worstGraduatingStudent = 0 ;
        int worstScore = totalScoresPerStudent[0] ;
        for (int student = 0; student < totalScoresPerStudent.length; student++) {
            if(totalScoresPerStudent[student] < worstScore) {
                worstGraduatingStudent = student;
            }
            worstScore = Math.min(totalScoresPerStudent[student], worstScore);

        }

        return new int[]{worstScore, worstGraduatingStudent};
    }

    public static int[] calculateBestGraduatingStudent(int[] totalScoresPerStudent) {
        int bestGraduatingStudent = 0;
        int bestScore = 0;
        for (int student = 0; student < totalScoresPerStudent.length; student++) {
            if(totalScoresPerStudent[student] > bestScore) {
                bestGraduatingStudent = student ;
            }
            bestScore = Math.max(totalScoresPerStudent[student], bestScore);

        }

        return new int[]{bestScore, bestGraduatingStudent};
    }

    public static void displaySubjectSummary(int totalNumberOfSubject, int[][] allStudentsScoresPerSubject) {

        int[] totalScoresPerSubject = calculateTotalScorePerSubject(allStudentsScoresPerSubject,totalNumberOfSubject);
        double[] averageScorePerSubject = calculateAverageScorePerSubject(allStudentsScoresPerSubject,totalNumberOfSubject);
        for(int subject = 0; subject < totalNumberOfSubject; subject++) {

            int[] highestScoringStudent = calculateHighestScoringStudent(allStudentsScoresPerSubject,subject);
            int[] lowestScoringStudent = calculateLowestScoringStudent(allStudentsScoresPerSubject,subject);

            int[] numberOfPassAndFails = calculateNumberOfPassAndFails(allStudentsScoresPerSubject,subject);


            System.out.println();
            System.out.println(EQUAL_SIGNS);
            System.out.println("SUBJECT SUMMARY");
            System.out.println("Subject " + (subject+1));
            System.out.printf("Highest scoring student is: Student %d scoring %d ", (highestScoringStudent[1] + 1), highestScoringStudent[0]);
            System.out.println();
            System.out.printf("Lowest scoring student is: Student %d scoring %d ", lowestScoringStudent[1] + 1, lowestScoringStudent[0]);
            System.out.println();
            System.out.println("Total Score is: " + totalScoresPerSubject[subject]);
            System.out.printf("Average Score is: %.2f%n",averageScorePerSubject[subject]);
            System.out.println("Number of passes: " + numberOfPassAndFails[0]);
            System.out.println("Number of fails: " + numberOfPassAndFails[1]);


        }


    }

    public static int[] calculateNumberOfPassAndFails(int[][] allStudentsScoresPerSubject, int subject) {
        int pass = 0;
        int fails = 0;

        for (int[] student : allStudentsScoresPerSubject) {
            if (student[subject] >= 50) {
                pass++;
            } else {
                fails++;
            }

        }

        return new int[]{pass, fails};

    }

    public static int[] calculateTotalScorePerSubject(int[][] allStudentsScoresPerSubject, int totalNumberOfSubject) {
        int[] totalScoresPerSubject = new int[totalNumberOfSubject];
        for(int subject = 0; subject < totalNumberOfSubject; subject++) {
            int totalScorePerSubject = 0;
            for(int[] student : allStudentsScoresPerSubject) {
                totalScorePerSubject += student[subject];
            }
            totalScoresPerSubject[subject] = totalScorePerSubject;
        }

        return totalScoresPerSubject;
    }

    public static double[] calculateAverageScorePerSubject(int[][] allStudentsScoresPerSubject, int totalNumberOfSubject) {
        double[] averageScoresPerSubject = new double[totalNumberOfSubject];
        for(int subject = 0; subject < totalNumberOfSubject; subject++) {
            double totalScorePerSubject = 0;
            for(int[] student : allStudentsScoresPerSubject) {
                totalScorePerSubject += student[subject];
            }
            averageScoresPerSubject[subject] = totalScorePerSubject/allStudentsScoresPerSubject.length;
        }

        return averageScoresPerSubject;
    }

    public static int[] calculateHighestScoringStudent(int[][] allStudentsScoresPerSubject, int subject) {
        int highestScoringStudent = 0;
        int highestScore = 0;
        for (int student = 0; student < allStudentsScoresPerSubject.length; student++) {
            if(allStudentsScoresPerSubject[student][subject] > highestScore) {
                highestScoringStudent = student;
            }
            highestScore = Math.max(allStudentsScoresPerSubject[student][subject], highestScore);

        }

        return new int[]{highestScore, highestScoringStudent};
    }


    public static int[] calculateLowestScoringStudent(int[][] allStudentsScoresPerSubject, int subject) {
        int lowestScoringStudent = 0 ;
        int lowestScore = allStudentsScoresPerSubject[0][subject] ;
        for (int student = 0; student < allStudentsScoresPerSubject.length; student++) {
            if(allStudentsScoresPerSubject[student][subject] < lowestScore) {
                lowestScoringStudent = student;
            }
            lowestScore = Math.min(allStudentsScoresPerSubject[student][subject], lowestScore);

        }

        return new int[]{lowestScore, lowestScoringStudent};
    }

    public static void displayStudentScoreTable(int totalNumberOfSubject,int totalNumberOfStudents, int[][] allStudentsScoresPerSubject) {
        System.out.println(EQUAL_SIGNS);
        System.out.print("STUDENT   ");
        for(int subject = 1; subject <= totalNumberOfSubject ; subject++){
            System.out.print("   SUB"+subject);
        }

        System.out.print("     TOT     AVE     POS\n");
        System.out.println(EQUAL_SIGNS);

        int[] totalScoresPerStudent = calculateTotalScoreForEachStudent(allStudentsScoresPerSubject);
        int[] studentPosition = calculateEachStudentPosition(totalScoresPerStudent);

        for(int student = 0; student < totalNumberOfStudents ; student++){
            System.out.printf("Student %s",student+1);
            for(int subject = 0; subject < totalNumberOfSubject ; subject++){
                System.out.printf("     %d",allStudentsScoresPerSubject[student][subject]);
            }
            System.out.printf("     %d", totalScoresPerStudent[student]);
            System.out.printf("     %.2f",calculateStudentAverageScore(allStudentsScoresPerSubject[student]));
            System.out.printf("     %d",studentPosition[student]);
            System.out.println();
        }

        System.out.println(EQUAL_SIGNS);
        System.out.println(EQUAL_SIGNS);

    }

    public static int[] calculateEachStudentPosition(int[] totalScoresPerStudent) {
        int[] studentPosition = new int[totalScoresPerStudent.length];

        for(int student = 0; student < totalScoresPerStudent.length ; student++){

            int currentStudentPosition = 1;

            for(int scores : totalScoresPerStudent){
                if(scores > totalScoresPerStudent[student]){
                    currentStudentPosition++;
                }
            }
            studentPosition[student] = currentStudentPosition;
        }
        return studentPosition;
    }

    public static int[] calculateTotalScoreForEachStudent(int[][] allStudentsScoresPerSubject) {
        int[] totalScorePerStudent = new int[allStudentsScoresPerSubject.length];
        for(int student = 0; student < allStudentsScoresPerSubject.length ; student++){
            totalScorePerStudent[student] = calculateStudentTotalScore(allStudentsScoresPerSubject[student]);
        }
        return totalScorePerStudent;
    }

    public static double calculateStudentAverageScore(int[] allStudentsScoresAcrossAllSubjects) {
        int totalScore = calculateStudentTotalScore(allStudentsScoresAcrossAllSubjects);
        return (double) totalScore / allStudentsScoresAcrossAllSubjects.length;
    }

    public static int calculateStudentTotalScore(int[] allStudentsScoresAcrossAllSubjects) {
        int totalScore = 0;
        for (int allStudentsScoresAcrossAllSubject : allStudentsScoresAcrossAllSubjects) {
            totalScore += allStudentsScoresAcrossAllSubject;
        }
        return totalScore;
    }

    public static void collectStudentScores(Scanner scanner, int totalNumberOfStudents, int totalNumberOfSubject, int[][] allStudentsScoresPerSubject) {
        for(int student = 1 ; student <= totalNumberOfStudents ; student++ ) {
            for(int subject = 1 ; subject <= totalNumberOfSubject ; subject++ ) {
                System.out.println("Entering score for student " + student);
                System.out.println("Enter score for subject " + subject);
                int studentScore = scanner.nextInt();

                while (studentScore < MIN_SCORE || studentScore > MAX_SCORE) {
                    System.out.println("Invalid score for student " + student + ". Enter valid score for subject " + subject);
                    studentScore = scanner.nextInt();
                }
                System.out.println(SAVING);
                System.out.println(SAVED_SUCCESSFULLY);
                allStudentsScoresPerSubject[student-1][subject-1] = studentScore;
            }
        }

    }
}