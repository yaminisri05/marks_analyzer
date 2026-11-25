package com.ilp.marks;

import java.util.*;

// ==============================================================
//  STEP 3 of 10  ·  Marks input box
// ==============================================================
//  WHAT:  Add a box for marks. Only numbers allowed.
//  HINT:  type="number" lets the user type only numbers.
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 3 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step03MarksBox {

    public static String marksBox() {
        // ✍️ Write this line:
           return "<input name=\"marks\" type=\"number\" placeholder=\"Marks\">";
       // return null; // 👈 YOUR CODE HERE (replace this line)
    }
}
