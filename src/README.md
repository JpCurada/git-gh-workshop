# CURADA Student Management System

**A beginner-friendly Java project to learn programming and Git!** 

Perfect for 1st and 2nd year Computer Science students who want to practice Java programming while learning Git and GitHub.

---

## 🤔 What Does This Project Do?

This program helps you manage student information. It can:

1. **Store student details** (name, age, course)
2. **Do basic math** (add, subtract, multiply, divide)  
3. **Calculate grades** (average, highest, lowest, letter grades)

When you run it, you'll see information about sample students and their grades!

---

## 🚀 How to Run This Project

### What You Need First
- Java installed on your computer
- A way to run Java code (command line, VS Code, or any IDE)

### Step-by-Step Instructions

**Step 1: Get your own copy of the project**

Since you don't have direct access to modify the original repository, you need to "fork" it first:

1. **Go to the original repository on GitHub:**
   ```
   https://github.com/JpCurada/student-management-system
   ```

2. **Click the "Fork" button** (top-right corner)
   - This creates YOUR own copy of the project
   - You'll now have: `https://github.com/YourUsername/student-management-system`

3. **Clone YOUR fork to your computer:**
   ```bash
   git clone https://github.com/YourUsername/student-management-system.git
   cd student-management-system
   ```
   *Replace "YourUsername" with your actual GitHub username*

**Step 2: Switch to the development branch**
```bash
git checkout dev
```
*We use the "dev" branch for development work, keeping "main" clean*

**Step 3: Navigate to the source code folder**
```bash
cd src
```
*This is where all the .java files are located*

**Step 4: Compile the Java files**
```bash
javac *.java
```
*This creates .class files from your .java files*

**Step 5: Run the program**
```bash
java Main
```

**Step 6: See the magic happen!**
You should see output like this:
```
=== Student Management Demo ===
Student: John Doe, Age: 20, Course: Computer Science
Student: Jane Smith, Age: 19, Course: Information Technology

=== Calculator Demo ===
5 + 3 = 8.0
10 - 4 = 6.0
...
```

---

## 📂 What's Inside This Project?

```
student-management-system/
├── README.md             ← This file
├── .gitignore            ← Tells Git what files to ignore
└── src/                  ← Source code folder
    ├── Main.java         ← Start here! Runs everything
    ├── Student.java      ← Stores student information  
    ├── Calculator.java   ← Does basic math
    └── GradeCalculator.java ← Handles grade calculations
```

**Think of it like this:**
- `src/` folder = Your workspace with all the code
- `Main.java` = The boss that tells everyone what to do
- `Student.java` = A template for creating students
- `Calculator.java` = Your basic calculator
- `GradeCalculator.java` = A smart calculator for grades

---

# 🏋️‍♀️ Practice Challenges

**Important:** Do these challenges ONE AT A TIME. After each challenge, save your work with Git!

## Level 1: I'm Just Starting! ⭐

*Perfect if you're comfortable with basic Java but want more practice*

### Challenge 1.1: Make Students Smarter

**What to do:** Add new methods to the `Student.java` file

**Your Mission:** 
1. Make sure you're in the `src/` folder: `cd src` (if not already there)
2. Open `Student.java`
3. Add these three new methods:

```java
// Method 1: Check if student is an adult
public boolean isAdult() {
    if (age >= 18) {
        return true;
    } else {
        return false;
    }
}

// Method 2: Get student's initials  
public String getInitials() {
    // Example: "John Doe" should return "J.D."
    // Hint: Use name.charAt(0) to get first letter
}

// Method 3: Update age safely
public void updateAge(int newAge) {
    // Only update if newAge is between 16 and 100
    if (newAge >= 16 && newAge <= 100) {
        this.age = newAge;
    } else {
        System.out.println("Invalid age! Must be between 16 and 100.");
    }
}
```

**How to test it:**
1. Go to `Main.java`  
2. In the `showStudentDemo()` method, add these lines:
```java
System.out.println("Is John an adult? " + student1.isAdult());
System.out.println("John's initials: " + student1.getInitials());
student1.updateAge(25);
student1.displayInfo(); // Should show updated age
```

**When you're done:** 
1. Make sure you're in the `src/` folder: `pwd` (should show path ending with /src)
2. Run your program: `javac *.java` then `java Main`
3. Check if it works correctly
4. Go back to main project folder: `cd ..`
5. Commit your changes: `git add -A` then `git commit -m "Add student validation methods"`

---

### Challenge 1.2: Upgrade Your Calculator

**What to do:** Make the calculator do more things

**Your Mission:** Add these methods to `Calculator.java`:

```java
// Method 1: Calculate power (example: 2^3 = 8)
public double power(double base, double exponent) {
    // Hint: Use Math.pow(base, exponent)
}

// Method 2: Calculate percentage (example: 20% of 100 = 20)
public double getPercentage(double value, double percent) {
    // Formula: (value * percent) / 100
}

// Method 3: Check if number is even
public boolean isEven(int number) {
    // Hint: Use the modulo operator (%)
    // If number % 2 equals 0, it's even
}
```

**How to test it:**
Add these lines to the `showCalculatorDemo()` method in `Main.java`:
```java
System.out.println("2 to the power of 3 = " + calc.power(2, 3));
System.out.println("20% of 150 = " + calc.getPercentage(150, 20));
System.out.println("Is 10 even? " + calc.isEven(10));
```

**When you're done:** Test, then commit your changes!

---

## Level 2: I'm Getting Confident! ⭐⭐

*Try these when Level 1 feels easy*

### Challenge 2.1: Grade Analytics

**What to do:** Make the grade calculator smarter

**Your Mission:** Add these methods to `GradeCalculator.java`:

```java
// Method 1: Count passing grades (70 and above)
public int countPassingGrades(double[] grades) {
    int count = 0;
    for (double grade : grades) {
        if (grade >= 70) {
            count++;
        }
    }
    return count;
}

// Method 2: Get only the passing grades
public double[] getPassingGrades(double[] grades) {
    // This is tricky! You need to:
    // 1. Count how many passing grades there are
    // 2. Create a new array with that size  
    // 3. Copy only the passing grades to the new array
    // 4. Return the new array
}

// Method 3: Check if all students passed
public boolean allStudentsPassed(double[] grades) {
    // Return true only if ALL grades are 70 or higher
}
```

**How to test it:**
```java
double[] testGrades = {85, 65, 92, 45, 78, 88};
GradeCalculator calc = new GradeCalculator();
System.out.println("Passing grades count: " + calc.countPassingGrades(testGrades));
System.out.println("Did everyone pass? " + calc.allStudentsPassed(testGrades));
```

---

### Challenge 2.2: Student Manager Class

**What to do:** Create a brand new file called `StudentManager.java`

**Your Mission:** Create a class that manages multiple students

```java
// StudentManager.java
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;
    
    // Constructor
    public StudentManager() {
        students = new ArrayList<Student>();
    }
    
    // Method 1: Add a student
    public void addStudent(Student student) {
        // Add the student to the ArrayList
    }
    
    // Method 2: Find student by name
    public Student findStudent(String name) {
        // Loop through students and find the one with matching name
        // Return the student if found, return null if not found
    }
    
    // Method 3: Show all students
    public void displayAllStudents() {
        // Loop through all students and call displayInfo() on each
    }
    
    // Method 4: Count students by course
    public int countStudentsByCourse(String course) {
        // Count how many students are in the given course
    }
}
```

**How to test it:** Create a new demo method in `Main.java`!

---

## Level 3: I Want a Real Challenge! ⭐⭐⭐

*These are for when you feel confident with Java and want to push yourself*

### Challenge 3.1: File Operations

**What to do:** Save and load student data to/from files

Create `FileHandler.java`:
```java
import java.io.*;

public class FileHandler {
    // Save students to a text file
    public void saveStudents(Student[] students, String filename) {
        // Use FileWriter to write student data to file
        // Format: Name,Age,Course (one student per line)
    }
    
    // Load students from a text file  
    public Student[] loadStudents(String filename) {
        // Use BufferedReader to read from file
        // Parse each line and create Student objects
        // Return array of students
    }
}
```

### Challenge 3.2: Input Validation Master

**What to do:** Add bulletproof validation to all your classes

**Your Mission:**
- Student names can't be empty or contain numbers
- Ages must be between 16-100
- Courses must be from a predefined list
- Grades must be between 0-100
- Handle ALL possible errors gracefully

---

# 🌟 Git Practice Challenges

**Do these Git challenges alongside your programming challenges!**

## Git Level 1: Basic Git Workflow ⭐

### Git Challenge 1.1: Your First Feature Branch

**Step-by-Step Instructions:**

1. **Check your current status**
   ```bash
   git status
   # This shows you what files have changed
   ```

2. **Make sure you're on the dev branch**
   ```bash
   git checkout dev
   # Switch to development branch (if not already there)
   ```

3. **Create a new branch for your work**
   ```bash
   git checkout -b feature/student-improvements
   # This creates AND switches to a new branch from dev
   ```

4. **Do Challenge 1.1 (Add methods to Student class)**
   *Remember to work in the `src/` folder!*

5. **Add your changes to Git**
   ```bash
   git add src/Student.java
   # This stages your changes (notice we specify the src/ path)
   ```

6. **Commit your changes**
   ```bash
   git commit -m "Add isAdult, getInitials, and updateAge methods to Student class"
   # This saves your changes with a message
   ```

7. **Push your branch to YOUR fork on GitHub**
   ```bash
   git push -u origin feature/student-improvements
   # This uploads your branch to YOUR GitHub fork
   ```

8. **Create a Pull Request**
   - Go to YOUR fork on GitHub: `https://github.com/YourUsername/student-management-system`
   - Click "Compare & pull request"
   - **Important:** Change the base repository to YOUR fork, not the original!
   - Base: `YourUsername/student-management-system` branch: `dev`
   - Compare: `YourUsername/student-management-system` branch: `feature/student-improvements`
   - Write a description of what you changed
   - Click "Create pull request"

---

### Git Challenge 1.2: Multiple Commits

**What to learn:** How to make multiple small commits instead of one big one

**Instructions:**
1. **Make sure you're on dev branch:** `git checkout dev`
2. **Create branch:** `git checkout -b feature/calculator-upgrades`
3. **Go to src folder:** `cd src` (if not already there)
4. Add ONLY the `power()` method to Calculator.java
5. **Commit:** `git add src/Calculator.java` then `git commit -m "Add power method to Calculator"`
6. Add ONLY the `getPercentage()` method  
7. **Commit:** `git add src/Calculator.java` then `git commit -m "Add percentage calculation to Calculator"`
8. Add ONLY the `isEven()` method
9. **Commit:** `git add src/Calculator.java` then `git commit -m "Add even number check to Calculator"`
10. **Push all commits:** `git push -u origin feature/calculator-upgrades`

**Why this matters:** In real projects, small commits are easier to review and debug!

---

## Git Level 2: Handling Conflicts ⭐⭐

### Git Challenge 2.1: Create Your First Merge Conflict

**What you'll learn:** How to handle when two people change the same code

**Instructions:**
1. **Create two branches from dev:**
   ```bash
   git checkout dev
   git checkout -b version-a
   # Make changes to a file in src/, commit it
   git checkout dev  
   git checkout -b version-b
   # Change the SAME file in src/ in a different way, commit it
   ```

2. **Try to merge both branches:**
   ```bash
   git checkout dev
   git merge version-a  # This will work fine
   git merge version-b  # This will create a conflict!
   ```

3. **Resolve the conflict:**
   - Open the conflicted file
   - Look for lines with `<<<<<<<`, `=======`, and `>>>>>>>`
   - Decide which code to keep
   - Remove the conflict markers
   - Commit the resolution

**Don't panic when you see conflicts - they're normal!**

---

## Git Level 3: Professional Workflows ⭐⭐⭐

### Git Challenge 3.1: Collaboration Simulation

**What you'll learn:** How real teams work together

**Instructions:**
1. **Fork this repository** (make your own copy)
2. **Clone your fork** to your computer
3. **Add a feature** to any class
4. **Push to your fork**
5. **Create a Pull Request** to the original repository
6. **Review someone else's Pull Request**
7. **Respond to feedback** on your own PR

---

# ✅ Progress Tracker

Check off each challenge as you complete it!

## Programming Challenges
- [ ] 1.1 - Student Methods (isAdult, getInitials, updateAge)
- [ ] 1.2 - Calculator Methods (power, percentage, isEven)  
- [ ] 2.1 - Grade Analytics (passing grades, all passed)
- [ ] 2.2 - Student Manager Class
- [ ] 3.1 - File Operations
- [ ] 3.2 - Input Validation

## Git Challenges
- [ ] 1.1 - First Feature Branch & Pull Request
- [ ] 1.2 - Multiple Small Commits
- [ ] 2.1 - Create & Resolve Merge Conflict
- [ ] 3.1 - Fork, Clone, PR Workflow

---

# 🆘 Help & Tips

## Stuck on Java?
- **Look at existing code** for examples and patterns
- **Start simple** - get something working, then make it better
- **Test frequently** - run your code after every small change
- **Read error messages carefully** - they usually tell you what's wrong!

## Git Confusion?
- **Use `git status` often** - it tells you what's happening
- **One thing at a time** - don't try to learn everything at once  
- **Mistakes are okay** - Git can undo almost anything
- **Ask for help** - everyone struggles with Git at first!

## Good Practices
- **Commit early and often** - small commits are better than big ones
- **Write clear commit messages** - future you will thank you
- **Test before committing** - make sure your code works
- **Use branches** - never work directly on the main branch

---

# 🎉 What's Next?

Completed all the challenges? Here are some ideas to keep growing:

## More Java Practice
- Add a simple menu system for user interaction
- Connect to a real database
- Create a web version using Spring Boot
- Add unit tests for all your methods

## Advanced Git Skills  
- Learn about Git hooks and automation
- Practice with rebasing and advanced merging
- Explore Git workflows used by real companies
- Contribute to open source projects

## Build Something New
- Create your own project from scratch
- Work on a group project with classmates
- Join a hackathon or coding competition
- Build a portfolio website to show off your work

---

**Remember:** Every expert was once a beginner. Take it one step at a time, and don't be afraid to make mistakes - that's how you learn! 🚀

**Questions?** Create an issue on GitHub or ask during our workshop sessions!