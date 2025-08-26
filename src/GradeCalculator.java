public class GradeCalculator {
    
    // Calculate average of grades
    public double calculateAverage(double[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }
    
    // Convert numerical grade to letter grade
    public String getLetterGrade(double grade) {
        if (grade >= 97) return "A+";
        if (grade >= 93) return "A";
        if (grade >= 90) return "A-";
        if (grade >= 87) return "B+";
        if (grade >= 83) return "B";
        if (grade >= 80) return "B-";
        if (grade >= 77) return "C+";
        if (grade >= 73) return "C";
        if (grade >= 70) return "C-";
        if (grade >= 65) return "D";
        return "F";
    }
    
    // Find highest grade in array
    public double getHighest(double[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        
        double highest = grades[0];
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    
    // Find lowest grade in array
    public double getLowest(double[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        
        double lowest = grades[0];
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
