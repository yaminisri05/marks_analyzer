package com.ilp.marks;

import java.util.*;

// ==============================================================
//  STEP 8 of 10  ·  Find the topper
// ==============================================================
//  WHAT:  Find the student with the highest marks.
//  HINT:  Start with the first student as best. If someone has more marks, they become the best.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      SELECT name, marks FROM students ORDER BY marks DESC LIMIT 1;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 8 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step08Topper {

    public static Student topper(List<Student> students) {
        Student best = students.get(0);
        for (Student s : students) {
            // ✍️ Write this line:
               if (s.marks > best.marks) best = s;
            // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
        }
        return best;
    }
}
