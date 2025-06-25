# Student Record Management System (Java CLI)

This is a **Command Line Interface (CLI)** based Student Record Management System written in Java using **Eclipse IDE**. It allows users to perform basic **CRUD operations** (Create, Read, Update, Delete) on student records stored in memory using `ArrayList`.

---

## Features

- Add a student (with input validation)
- View all students
- Update student (choose to update Name, Marks, or Both)
- Delete student by ID
- Input validations:
  - ID must be unique
  - Name must contain only alphabets and spaces
  - Marks must be between 0 and 100

---

## Technologies Used

- Java (Standard Edition)
- Eclipse IDE
- Java Collections (`ArrayList`)
- `Scanner` class for user input
- Object-Oriented Programming (OOP)

---

## Project Structure

```
StudentRecordManagement/
├── Student.java # POJO class for student
├── StudentUtility.java # Utility class with logic and validations
└── StudentRecordManagementMain.java # Main class with CLI menu
```

---

## How to Run This Project

1. Clone or download the repository
2. Open the project in Eclipse IDE
3. Run `StudentRecordManagementMain.java`
4. Use the menu options to manage students via console

---

## Sample Output

```
--- Student Record Management System ---
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1
Enter ID: 101
Enter Name: Ravi Kumar
Enter Marks (0 to 100): 87.5
Student added successfully.

Enter your choice: 2
ID: 101 | Name: Ravi Kumar | Marks: 87.5

Enter your choice: 3
Enter ID to update: 101
Student Found: ID: 101 | Name: Ravi Kumar | Marks: 87.5
What do you want to update?
1. Name
2. Marks
3. Both
Enter choice: 2
Enter new marks (0 to 100): 91
Marks updated successfully.

Enter your choice: 4
Enter ID to delete: 101
Student deleted successfully.
```

---

## Author

**Chinta Lakshmi Kanth**  
Aspiring Java Developer | Passionate about clean coding and backend development

---

## License

This project is open-source and free to use for learning and educational purposes.
