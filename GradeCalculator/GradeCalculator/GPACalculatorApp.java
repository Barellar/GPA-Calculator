package GradeCalculator;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// import CourseInfo;

public class GPACalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcoming message
        System.out.println("Welcome to My GPA Grading Calculator\n");

        // Prompt for the number of courses
        System.out.print("Enter the number of courses: ");
        int numberOfCourses = scanner.nextInt();

        // ArrayList to store CourseInfo objects
        ArrayList<CourseInfo> courses = new ArrayList<>();

        // Input course details
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("\nEnter details for Course " + (i + 1) + ":");
            scanner.nextLine(); // Consume newline
            System.out.print("Course Name: ");
            String name = scanner.nextLine();
            System.out.print("Course Code: ");
            String code = scanner.nextLine();

            // Input course unit with exception handling
            int unit = 0;
            boolean validUnit = false;
            while (!validUnit) {
                try {
                    System.out.print("Course Unit (1-4): ");
                    unit = scanner.nextInt();
                    if (unit >= 1 && unit <= 4) {
                        validUnit = true;
                    } else {
                        System.out.println("Please enter a valid integer between 1 and 4.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // consume invalid input
                }
            }

            // Input course score with exception handling
            int score = 0;
            boolean validScore = false;
            while (!validScore) {
                try {
                    System.out.print("Course Score (0-100): ");
                    score = scanner.nextInt();
                    if (score >= 0 && score <= 100) {
                        validScore = true;
                    } else {
                        System.out.println("Please enter a valid integer between 0 and 100.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // consume invalid input
                }
            }

            // Create CourseInfo object and add to ArrayList
            CourseInfo course = new CourseInfo(name, code, unit, score);
            courses.add(course);
        }
        // Calculate total grade points and total units
        int totalGradePoints = 0;
        int totalUnits = 0;

        for (CourseInfo course : courses) {
            totalGradePoints += course.getGradePoint() * course.getUnit();
            totalUnits += course.getUnit();
        }

        // Calculate GPA to 2 decimal places
        double gpa = (double) totalGradePoints / totalUnits;

        // Display the result in a tabular form
        System.out.println("\nResult:");
        printTableLine();
        System.out.printf("| %-34s | %-14s | %-14s | %-14s |\n", "Course Name & Code", "Course Unit", "Grade", "Grade Unit");
        printTableLine();

        for (CourseInfo course : courses) {
            System.out.printf("| %-34s | %-14d | %-14s | %-14d |\n", getCombinedNameAndCode(course.getName(), course.getCode()), course.getUnit(),  course.getGrade(), course.getGradePoint());
        }

        printTableLine();
        System.out.println();

        // Print GPA message
        System.out.printf("Your GPA is = %.2f\n", gpa);

        // Close the scanner
        scanner.close();
    }

    // Helper method to print horizontal lines for the table
    private static void printTableLine() {
        System.out.println("+------------------------------------+----------------+----------------+----------------+");
    }

    // Helper method to combine name and code
    private static String getCombinedNameAndCode(String name, String code) {
        return name + " " + code;
    }
}