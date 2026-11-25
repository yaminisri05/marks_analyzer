package com.ilp.marks;

import java.util.*;

// ==============================================================
//  STEP 2 of 10  ·  Name input box
// ==============================================================
//  WHAT:  Add a box where the user types the student name.
//  HINT:  <input> makes a text box. name="name" is how the server finds what was typed.
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 2 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step02NameBox {

    public static String nameBox() {
        // ✍️ Write this line:
           return "<input name=\"name\" placeholder=\"Student name\">";
       // return null; // 👈 YOUR CODE HERE (replace this line)
    }
}