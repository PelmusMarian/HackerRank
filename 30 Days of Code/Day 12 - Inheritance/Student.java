package solution;

public class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] score) {
        super(firstName, lastName, id);
        this.testScores = score;
    }

    public char calculate() {
        char grade = 'f';
        int average, sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
        }
        average = sum / testScores.length;
        if (average >= 90 && average <= 100) {
            grade = 'O';
        }
        if (average >= 80 && average < 90) {
            grade = 'E';
        }
        if (average >= 70 && average < 80) {
            grade = 'A';
        }
        if (average >= 55 && average < 70) {
            grade = 'P';
        }
        if (average >= 40 && average < 55) {
            grade = 'D';
        }
        if (average < 40) {
            grade = 'T';
        }
        return grade;
    }
}
