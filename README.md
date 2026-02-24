
# Student Record Manager (Java)

## Description

Student Record Manager is a console-based Java application designed to manage student information efficiently. This project demonstrates fundamental Object-Oriented Programming (OOP) concepts and uses dynamic data structures to perform operations such as adding, viewing, searching, and deleting student records.

The application also includes analytical features such as calculating the average marks of all students and identifying the topper.

---

## Features

* Add new student records (Name, Roll Number, Marks)
* View all student details in a formatted table
* Search for a student using roll number
* Delete a student record
* Calculate average marks of all students
* Display the student with the highest marks (Topper)
* Menu-driven interface for easy interaction

---

## Technologies Used

* Java (Core Java)
* ArrayList (2D ArrayList for dynamic data storage)
* Java Scanner (for user input)

---

## Project Structure

```
Student-Record-Manager/
│
├── StudentDetails.java   // Handles all student-related operations
└── Main.java             // Contains main method and user interaction logic
```

---

## How It Works

### Data Storage

The application uses a 2D ArrayList:

```
ArrayList<ArrayList<String>> student
```

Each student record is stored as:

```
[Name, Roll Number, Marks]
```

---

## Functional Overview

### 1. Add Student

Adds a new student record to the list.

### 2. View Students

Displays all student records in a formatted table using `printf()`.

### 3. Search Student

Searches for a student by roll number and displays their details.

### 4. Delete Student

Removes a student record based on roll number.

### 5. Calculate Average

Computes the average marks of all students.

### 6. Display Topper

Finds and displays the student with the highest marks.

---

## How to Run the Project

### Step 1: Compile the Files

```
javac StudentDetails.java
javac Main.java
```

### Step 2: Run the Program

```
java Main
```

---

## Sample Menu

```
Welcome to Student Record Manager
1. ADD
2. VIEW
3. SEARCH
4. DELETE
5. CALCULATE AVERAGE
6. DISPLAY TOPPER
7. EXIT
```

---

## Key Concepts Demonstrated

* Object-Oriented Programming (OOP)
* Use of ArrayList and nested data structures
* Data manipulation (CRUD operations)
* Input handling using Scanner
* Output formatting using printf

---

## Limitations

* Data is not persistent (stored only during runtime)
* Uses String for marks instead of numeric type
* No validation for incorrect input
* Not scalable for large datasets

---

## Future Improvements

* Use a proper Student class instead of ArrayList
* Store data using files or a database
* Add input validation
* Implement a graphical user interface (GUI)
* Improve error handling and edge case management

---

## Author

Palak Patel

---

## Conclusion

This project is a beginner-friendly implementation of a student management system. It is useful for understanding Java fundamentals, especially working with ArrayLists, loops, and modular programming.

---
