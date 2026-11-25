package com.ilp.marks;

import java.util.*;

// ==============================================================
//  STEP 4 of 10  ·  Add button
// ==============================================================
//  WHAT:  Add a button. Clicking it sends the name and marks to the server.
//  HINT:  A <button> inside a form sends the form when clicked.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      CREATE TABLE students (id INTEGER PRIMARY KEY, name TEXT, marks INTEGER);
//      INSERT INTO students (name, marks) VALUES ('Ravi', 80);
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 4 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step04AddButton {

    public static String addButton() {
        // ✍️ Write this line:
          return "<button type=\"submit\">Add</button>";
       // return null; // 👈 YOUR CODE HERE (replace this line)
    }
}
