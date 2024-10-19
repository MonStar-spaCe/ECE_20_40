public class PascalCaseExample { // PascalCase: Class names in Java typically follow this convention

    // camelCase: Method and variable names typically use this convention
    public static void main(String[] args) {
        int numberOfStudents = 25; // camelCase
        int student_count = 0;     // snake_case: Rare in Java, but seen in some cases
        String url = "https://example.com/course-enrollment"; // Example of kebab-case in a URL

        // Calling a method with camelCase
        enrollStudents(numberOfStudents, student_count);

        // PascalCase is often used in classes or constructors, but not in variables or methods
        PascalCaseExample exampleInstance = new PascalCaseExample(); 
        exampleInstance.displayMessage();
    }

    // camelCase: Method names use this convention
    public static void enrollStudents(int numberOfStudents, int student_count) {
        // Code to enroll students
        student_count = numberOfStudents;
        System.out.println("Total enrolled students: " + student_count);
    }

    // Another camelCase method
    public void displayMessage() {
        System.out.println("Hello, this is a PascalCase example class.");
    }
}


