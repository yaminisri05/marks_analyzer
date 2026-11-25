package com.ilp.marks;

import java.util.*;

// ==============================================================
//  STEP 6 of 10  ·  Total marks
// ==============================================================
//  WHAT:  Add up the marks of all students. The page also shows the average.
//  HINT:  Start total at 0. Inside the loop, add each student's marks to total.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      SELECT SUM(marks), AVG(marks) FROM students;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 6 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step06Total {

    public static int totalMarks(List<Student> students) {
        int total = 0;
        for (Student s : students) {
            // ✍️ Write this line:
              total = total + s.marks;
            // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
        }
        return total;
    }
}
