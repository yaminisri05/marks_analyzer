package com.ilp.marks;

import java.util.*;

// ==============================================================
//  STEP 7 of 10  ·  Grade with if / else
// ==============================================================
//  WHAT:  Give a grade: A for 90+, B for 75+, C for 60+, else D.
//  HINT:  A is already done. Write two elif (else if) blocks for B and C, above the else.
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 7 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step07Grade {

    public static String grade(int marks) {
        if (marks >= 90) return "A";
        // ✍️ Write these lines:
          else if (marks >= 75) return "B";
          else if (marks >= 60) return "C";
        // 👈 YOUR CODE HERE (type the lines above on the next lines, same spaces at the start)
        else return "D";
    }
}
