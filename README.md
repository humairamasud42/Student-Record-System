# Student Record System

## Overview

This project is a Student Record System developed in Java using Collections and File I/O.

The system allows:

* Storing student records using ArrayList
* Writing records to a file
* Reading records from a file
* Finding highest CGPA
* Counting students below a certain CGPA

---

## Features

* ArrayList implementation
* File handling using BufferedWriter and BufferedReader
* Try-with-resources for automatic resource management
* Student record analysis

---

## Technologies Used

* Java
* VS Code
* Collections Framework
* File Handling

---

## Project Structure

```text
StudentRecordSystem
│
├── Student.java
├── Main.java
└── students.txt
```

---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

---

## Sample Output

```text
Student records written to file successfully.

Reading from file:

Name: Ali, CGPA: 3.5
Name: Sara, CGPA: 2.1
Name: Ahmed, CGPA: 3.9
Name: Zainab, CGPA: 1.8

Student with Highest CGPA:
Name: Ahmed, CGPA: 3.9

Students below CGPA 2.5: 2
```

---

## Concepts Demonstrated

* Classes & Objects
* Encapsulation
* ArrayList
* File I/O
* BufferedReader
* BufferedWriter
* try-with-resources

---

## Author

Developed as part of Java OOP coursework.

