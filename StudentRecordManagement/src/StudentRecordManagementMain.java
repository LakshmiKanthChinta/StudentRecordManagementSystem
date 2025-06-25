import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecordManagementMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: StudentUtility.addStudent(students); break;
                case 2: StudentUtility.viewStudents(students); break;
                case 3: StudentUtility.updateStudent(students); break;
                case 4: StudentUtility.deleteStudent(students); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice! Choose between 1 to 5 ");
            }
        } while (choice != 5);

        sc.close();
    }
}
