package com.ilp.login;

import java.util.*;

// ==============================================================
//  STEP 6 of 10  ·  Check the user exists
// ==============================================================
//  WHAT:  Return true if this username is in users.
//  HINT:  containsKey checks if a key is inside a Map.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      SELECT COUNT(*) FROM users WHERE username = 'ravi';
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 6 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step06UserExists {

    public static Boolean userExists(Map<String, String> users, String username) {
        // ✍️ Write this line:
        //    return users.containsKey(username);
        return null; // 👈 YOUR CODE HERE (replace this line)
    }
}
