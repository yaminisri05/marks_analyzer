package com.ilp.marks;

import java.util.*;

// ==============================================================
//  STEP 9 of 10  ·  Delete a student
// ==============================================================
//  WHAT:  Remove one student from the list. A ❌ link appears next to each student.
//  HINT:  students.remove(index) removes the item at that position.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      DELETE FROM students WHERE id = 2;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 9 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step09Delete {

    public static void deleteStudent(List<Student> students, int index) {
        // ✍️ Write this line:
        students.remove(index);
        // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
    }
}
