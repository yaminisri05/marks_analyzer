package com.ilp.marks;

import java.util.*;

// ==============================================================
//  STEP 5 of 10  ·  Show each student in the list
// ==============================================================
//  WHAT:  Turn one student into one line of the list: name - marks.
//  HINT:  <li> is one item of a list. Join the name, a dash, and the marks with +.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      SELECT name, marks FROM students ORDER BY id;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 5 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step05ShowList {

    public static String studentRow(Student s) {
        // s is one student. s.name is the name, s.marks is the marks.
        // ✍️ Write this line:
            return "<li>" + s.name + " - " + s.marks + "</li>";
        //return null; // 👈 YOUR CODE HERE (replace this line)
    }
}
