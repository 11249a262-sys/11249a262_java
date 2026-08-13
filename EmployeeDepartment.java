import java.util.Scanner;

public class EmployeeDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Department of Employee 1: ");
        String dept1 = sc.nextLine();

        System.out.print("Enter Department of Employee 2: ");
        String dept2 = sc.nextLine();

        if (dept1.equalsIgnoreCase(dept2)) {
            System.out.println("Employees are working in the same department.");
        } else {
            System.out.println("Employees are working in different departments.");
        }

        sc.close();
    }
}