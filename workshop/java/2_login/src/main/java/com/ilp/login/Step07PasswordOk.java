package com.ilp.login;

import java.util.*;

// ==============================================================
//  STEP 7 of 10  ·  Check the password
// ==============================================================
//  WHAT:  Return true if the password typed matches the saved password.
//  HINT:  users.get(username) gives the saved password. In Java, compare Strings with .equals(), not ==.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      SELECT password FROM users WHERE username = 'ravi';
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 7 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step07PasswordOk {

    public static Boolean passwordOk(Map<String, String> users, String username, String password) {
        // ✍️ Write this line:
        //    return users.get(username).equals(password);
        return null; // 👈 YOUR CODE HERE (replace this line)
    }
}
