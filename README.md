
# 🎓 Student Grade System (Console-Based Java Application)

The **Student Grade System** is a simple **console-based Java program** that calculates a student’s total marks, average, and grade based on input marks. It demonstrates the use of **classes**, **inheritance**, and **interfaces** in Java.

## 🧩 Project Structure
```

project/
└── student/
├── student.java        // Base class for storing student details
├── Result.java         // Interface defining result calculation
├── GradeSystem.java    // Derived class that implements grade logic
└── Main.java           // Entry point to take input and display output

````

## ⚙️ Features
- Accepts roll number, name, and marks from user input  
- Calculates total and average marks  
- Assigns grade based on the average  
- Displays result (pass/fail)  
- Implements **inheritance** and **interface** concepts  

## 🧮 Grading Criteria
| Average Marks | Grade | Result |
|----------------|--------|--------|
| 75 - 100       | A      | Pass   |
| 60 - 74        | B      | Pass   |
| 40 - 59        | C      | Pass   |
| Below 40       | Fail   | Fail   |

## 💻 How to Run
1. Open any Java IDE (like Eclipse or IntelliJ) or use the terminal.  
2. Create the package structure `project.student`.  
3. Add the following Java files:
   - `student.java`
   - `Result.java`
   - `GradeSystem.java`
   - `Main.java`
4. Compile all files:
   ```bash
   javac project/student/*.java
````

5. Run the program:

   ```bash
   java project.student.Main
   ```
6. Enter the required details when prompted.

## 🧑‍💻 Example Output

```
Enter Roll No: 101
Enter Name: Mahesh
Enter marks of 3 subjects:
78
82
69

Roll No : 101
Name : Mahesh
Total : 229
Average : 76.33
Grade : A
___________________________
```

## 🧠 Concepts Used

* Class and Object
* Inheritance (`extends`)
* Interface (`implements`)
* Method Overriding
* Loops and Conditional Statements
* User Input using Scanner

## 📄 License

This project is open-source and free to use for learning and educational purposes.
