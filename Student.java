class Student {
    String name;
    int rollNo;
    int marks;

    // Constructor
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }

    // Method to display student details
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("---------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 92);
        Student s2 = new Student("Priya", 102, 76);

        s1.display();
        s2.display();
    }
}