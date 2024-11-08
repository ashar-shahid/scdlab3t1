//2022f-bse-104
package scdlab3;
import java.util.Scanner;
class Student {
    private String name;
    private double totalMarks;
    private double obtainedMarks;

    public Student(String name, double totalMarks, double obtainedMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    public String getName() {
        return name;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public double getObtainedMarks() {
        return obtainedMarks;
    }

    public double calculatePercentage() {
        return (obtainedMarks / totalMarks) * 100;
    }

    public String determineGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C+";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    public double calculateGPA() {
        String grade = determineGrade();
        switch (grade) {
            case "A+":
                return 4.0;
            case "A":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3.0;
            case "C+":
                return 2.7;
            case "C":
                return 2.0;
            default:
                return 0.0;
        }
    }

    public void displayMarkSheet() {
        System.out.println("========================================");
        System.out.println("                Mark Sheet               ");
        System.out.println("========================================");
        System.out.println("Student Name : " + getName());
        System.out.println("Total Marks  : " + getTotalMarks());
        System.out.println("Obtained Marks: " + getObtainedMarks());
        System.out.println("Percentage    : " + String.format("%.2f", calculatePercentage()) + "%");
        System.out.println("Grade         : " + determineGrade());
        System.out.println("GPA           : " + String.format("%.2f", calculateGPA()));
        System.out.println("========================================");
    }
}

public class Scdlab3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        Student student = new Student(name, totalMarks, obtainedMarks);

        student.displayMarkSheet();

        scanner.close();
    }
}
