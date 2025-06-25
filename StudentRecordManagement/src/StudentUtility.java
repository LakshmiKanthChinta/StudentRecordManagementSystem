import java.util.ArrayList;
import java.util.Scanner;

public class StudentUtility {
	private static Scanner sc = new Scanner(System.in);

	// Method to add student
	public static void addStudent(ArrayList<Student> students) {
		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		if (isIdExists(students, id)) {
			System.out.println("Error: ID already exists. Use a unique ID.");
			return;
		}

		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		if (!isValidName(name)) {
			System.out.println("Error: Name must contain only letters and spaces.");
			return;
		}

		System.out.print("Enter Marks (0 to 100): ");
		double marks = sc.nextDouble();
		if (marks < 0 || marks > 100) {
			System.out.println("Error: Marks must be between 0 and 100.");
			return;
		}

		students.add(new Student(id, name, marks));
		System.out.println("Student added successfully.");
	}

	// Method to view all student details
	public static void viewStudents(ArrayList<Student> students) {
		if (students.isEmpty()) {
			System.out.println("No student records found.");
		} else {
			for (Student s : students) {
				System.out.println(s);
			}
		}
	}

	// Method to update student details
	public static void updateStudent(ArrayList<Student> students) {
		System.out.print("Enter ID to update: ");
		int id = sc.nextInt();
		Student student = findStudentById(students, id);

		if (student != null) {
			System.out.println("Student Found: " + student);

			System.out.println("What do you want to update?");
			System.out.println("1. Name");
			System.out.println("2. Marks");
			System.out.println("3. Both");
			System.out.print("Enter choice: ");
			int option = sc.nextInt();
			sc.nextLine(); // clear buffer

			switch (option) {
			case 1:
				System.out.print("Enter new name: ");
				String name = sc.nextLine();
				if (!isValidName(name)) {
					System.out.println("Error: Name must contain only letters and spaces.");
					return;
				}
				student.setName(name);
				System.out.println("Name updated successfully.");
				break;

			case 2:
				System.out.print("Enter new marks (0 to 100): ");
				double marks = sc.nextDouble();
				if (marks < 0 || marks > 100) {
					System.out.println("Error: Marks must be between 0 and 100.");
					return;
				}
				student.setMarks(marks);
				System.out.println("Marks updated successfully.");
				break;

			case 3:
				System.out.print("Enter new name: ");
				String fullName = sc.nextLine();
				if (!isValidName(fullName)) {
					System.out.println("Error: Name must contain only letters and spaces.");
					return;
				}

				System.out.print("Enter new marks (0 to 100): ");
				double newMarks = sc.nextDouble();
				if (newMarks < 0 || newMarks > 100) {
					System.out.println("Error: Marks must be between 0 and 100.");
					return;
				}

				student.setName(fullName);
				student.setMarks(newMarks);
				System.out.println("Name and Marks updated successfully.");
				break;

			default:
				System.out.println("Invalid option selected.");
			}

		} else {
			System.out.println("Student with ID " + id + " not found.");
		}
	}

	// Method to delete student 
	public static void deleteStudent(ArrayList<Student> students) {
		System.out.print("Enter ID to delete: ");
		int id = sc.nextInt();
		Student student = findStudentById(students, id);

		if (student != null) {
			students.remove(student);
			System.out.println("Student deleted successfully.");
		} else {
			System.out.println("Student with ID " + id + " not found.");
		}
	}

	// Helper method to validate name
	private static boolean isValidName(String name) {
		return name.matches("^[A-Za-z ]+$");
	}

	// Helper method to validate marks
	private static boolean isIdExists(ArrayList<Student> students, int id) {
		return findStudentById(students, id) != null;
	}

	// Helper method to find the student by Id
	private static Student findStudentById(ArrayList<Student> students, int id) {
		for (Student s : students) {
			if (s.getId() == id)
				return s;
		}
		return null;
	}
}
