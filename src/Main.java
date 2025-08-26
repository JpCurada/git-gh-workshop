import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> students = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("=== Welcome to Student Infoman System ===");
        System.out.println("Type 'quit' at any time to exit the program.");
        System.out.println();
        
        String choice;
        do {
            showMainMenu();
            choice = scanner.nextLine().trim().toLowerCase();
            
            switch (choice) {
                case "1":
                    studentManagement();
                    break;
                case "2":
                    calculatorOperations();
                    break;
                case "3":
                    gradeCalculations();
                    break;
                case "4":
                    showAllStudents();
                    break;
                case "quit":
                    System.out.println("Thank you for using Student Management System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            if (!choice.equals("quit")) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
            
        } while (!choice.equals("quit"));
        
        scanner.close();
    }
    
    private static void showMainMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Student Management");
        System.out.println("2. Calculator Operations");
        System.out.println("3. Grade Calculations");
        System.out.println("4. View All Students");
        System.out.println("Type 'quit' to exit");
        System.out.print("Enter your choice: ");
    }
    
    private static void studentManagement() {
        System.out.println("\n=== STUDENT MANAGEMENT ===");
        System.out.println("1. Add New Student");
        System.out.println("2. View Student Details");
        System.out.println("3. Update Student Information");
        System.out.println("4. Remove Student");
        System.out.print("Enter your choice (or 'quit' to exit): ");
        
        String choice = scanner.nextLine().trim();
        if (choice.equals("quit")) return;
        
        switch (choice) {
            case "1":
                addNewStudent();
                break;
            case "2":
                viewStudentDetails();
                break;
            case "3":
                updateStudentInfo();
                break;
            case "4":
                removeStudent();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    
    private static void addNewStudent() {
        System.out.print("Enter student name (or 'quit' to cancel): ");
        String name = scanner.nextLine().trim();
        if (name.equals("quit")) return;
        
        System.out.print("Enter student age: ");
        String ageStr = scanner.nextLine().trim();
        if (ageStr.equals("quit")) return;
        
        int age;
        try {
            age = Integer.parseInt(ageStr);
            if (age < 16 || age > 100) {
                System.out.println("Invalid age! Age must be between 16 and 100.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format! Please enter a number.");
            return;
        }
        
        System.out.print("Enter student course: ");
        String course = scanner.nextLine().trim();
        if (course.equals("quit")) return;
        
        Student newStudent = new Student(name, age, course);
        students.add(newStudent);
        System.out.println("Student added successfully!");
        newStudent.displayInfo();
    }
    
    private static void viewStudentDetails() {
        if (students.isEmpty()) {
            System.out.println("No students found. Please add some students first.");
            return;
        }
        
        System.out.print("Enter student name to search (or 'quit' to cancel): ");
        String name = scanner.nextLine().trim();
        if (name.equals("quit")) return;
        
        Student found = findStudentByName(name);
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Student not found.");
        }
    }
    
    private static void updateStudentInfo() {
        if (students.isEmpty()) {
            System.out.println("No students found. Please add some students first.");
            return;
        }
        
        System.out.print("Enter student name to update (or 'quit' to cancel): ");
        String name = scanner.nextLine().trim();
        if (name.equals("quit")) return;
        
        Student student = findStudentByName(name);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        
        System.out.println("Current information:");
        student.displayInfo();
        
        System.out.print("Enter new age (current: " + student.getAge() + ", press Enter to keep): ");
        String ageStr = scanner.nextLine().trim();
        if (ageStr.equals("quit")) return;
        
        if (!ageStr.isEmpty()) {
            try {
                int age = Integer.parseInt(ageStr);
                if (age >= 16 && age <= 100) {
                    student.setAge(age);
                } else {
                    System.out.println("Invalid age! Keeping current age.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid age format! Keeping current age.");
            }
        }
        
        System.out.print("Enter new course (current: " + student.getCourse() + ", press Enter to keep): ");
        String course = scanner.nextLine().trim();
        if (course.equals("quit")) return;
        
        if (!course.isEmpty()) {
            student.setCourse(course);
        }
        
        System.out.println("Student information updated:");
        student.displayInfo();
    }
    
    private static void removeStudent() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        
        System.out.print("Enter student name to remove (or 'quit' to cancel): ");
        String name = scanner.nextLine().trim();
        if (name.equals("quit")) return;
        
        Student student = findStudentByName(name);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
    
    private static Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
    
    private static void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found. Please add some students first.");
            return;
        }
        
        System.out.println("\n=== ALL STUDENTS ===");
        for (int i = 0; i < students.size(); i++) {
            System.out.print((i + 1) + ". ");
            students.get(i).displayInfo();
        }
    }
    
    private static void calculatorOperations() {
        System.out.println("\n=== CALCULATOR OPERATIONS ===");
        Calculator calc = new Calculator();
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (or 'quit' to exit): ");
        
        String choice = scanner.nextLine().trim();
        if (choice.equals("quit")) return;
        
        double num1, num2;
        try {
            System.out.print("Enter first number: ");
            String input1 = scanner.nextLine().trim();
            if (input1.equals("quit")) return;
            num1 = Double.parseDouble(input1);
            
            System.out.print("Enter second number: ");
            String input2 = scanner.nextLine().trim();
            if (input2.equals("quit")) return;
            num2 = Double.parseDouble(input2);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format! Please enter valid numbers.");
            return;
        }
        
        double result = 0;
        String operation = "";
        boolean validOperation = true;
        
        switch (choice) {
            case "1":
                result = calc.add(num1, num2);
                operation = "+";
                break;
            case "2":
                result = calc.subtract(num1, num2);
                operation = "-";
                break;
            case "3":
                result = calc.multiply(num1, num2);
                operation = "*";
                break;
            case "4":
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                result = calc.divide(num1, num2);
                operation = "/";
                break;
            default:
                System.out.println("Invalid choice.");
                validOperation = false;
                break;
        }
        
        if (validOperation) {
            System.out.printf("Result: %.2f %s %.2f = %.2f%n", num1, operation, num2, result);
        }
    }
    
    private static void gradeCalculations() {
        System.out.println("\n=== GRADE CALCULATIONS ===");
        GradeCalculator gradeCalc = new GradeCalculator();
        
        System.out.print("How many grades do you want to enter? (or 'quit' to exit): ");
        String input = scanner.nextLine().trim();
        if (input.equals("quit")) return;
        
        int numGrades;
        try {
            numGrades = Integer.parseInt(input);
            if (numGrades <= 0) {
                System.out.println("Number of grades must be positive.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
            return;
        }
        
        double[] grades = new double[numGrades];
        
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + " (0-100): ");
            String gradeInput = scanner.nextLine().trim();
            if (gradeInput.equals("quit")) return;
            
            try {
                double grade = Double.parseDouble(gradeInput);
                if (grade < 0 || grade > 100) {
                    System.out.println("Grade must be between 0 and 100. Please try again.");
                    i--; // Retry this grade
                    continue;
                }
                grades[i] = grade;
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade format! Please enter a number.");
                i--; // Retry this grade
            }
        }
        
        // Display results
        System.out.println("\n=== GRADE ANALYSIS ===");
        System.out.print("Entered grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%.1f", grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println();
        
        double average = gradeCalc.calculateAverage(grades);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Letter Grade: " + gradeCalc.getLetterGrade(average));
        System.out.printf("Highest Grade: %.2f%n", gradeCalc.getHighest(grades));
        System.out.printf("Lowest Grade: %.2f%n", gradeCalc.getLowest(grades));
        
        // Count passing grades (assuming 70+ is passing)
        int passingCount = 0;
        for (double grade : grades) {
            if (grade >= 70) {
                passingCount++;
            }
        }
        System.out.println("Passing Grades (70+): " + passingCount + " out of " + grades.length);
        
        double passingPercentage = (double) passingCount / grades.length * 100;
        System.out.printf("Passing Percentage: %.1f%%%n", passingPercentage);
    }
}
