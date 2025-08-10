package AnythingJava;


public class Student {
    /**
     * This is a Student class using encapsulation
     * The attributes are privates
     * We access them through getters and setters
     * Only marks can be modified using setter
     */
    public static void main(String[] args) {
        Student s = new Student("Antonette", "STU2025");
        s.setMarks(90);
        System.out.println(s.getName());
        System.out.println(s.getStudentNumber());
        System.out.println(s.getMarks());
    }

    // attributes
    private String name;
    private final String studentNumber;
    private int marks;

    // constructor
    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for studentNumber
    public String getStudentNumber() {
        return studentNumber;
    }

    // getter for marks
    public int getMarks() {
        return marks;
    }

    // setter for marks
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100 ) {
            this.marks = marks;
        }
    }
}