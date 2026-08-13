class StudentInfo {
    int rollNo;
    String name;

    StudentInfo(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class MarksDetails extends StudentInfo {
    int m1, m2, m3, m4, m5;

    MarksDetails(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }
}

class ResultDetails extends MarksDetails {

    ResultDetails(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name, m1, m2, m3, m4, m5);
    }

    void displayResult() {
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("Roll No   : " + rollNo);
        System.out.println("Name      : " + name);
        System.out.println("Subject 1 : " + m1);
        System.out.println("Subject 2 : " + m2);
        System.out.println("Subject 3 : " + m3);
        System.out.println("Subject 4 : " + m4);
        System.out.println("Subject 5 : " + m5);
        System.out.println("Total     : " + total);
        System.out.println("Average   : " + average);
        System.out.println("Grade     : " + grade);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        ResultDetails r =
            new ResultDetails(101, "Rahul", 85, 90, 78, 88, 92);

        r.displayResult();
    }
}