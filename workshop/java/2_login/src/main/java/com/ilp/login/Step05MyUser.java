package com.ilp.login;

import java.util.*;

// ==============================================================
//  STEP 5 of 10  ·  Add your own user
// ==============================================================
//  WHAT:  users stores username → password. Add yourself as a user.
//  HINT:  Use YOUR name and a password you will remember. Then log in with it.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      CREATE TABLE users (username TEXT PRIMARY KEY, password TEXT NOT NULL);
//      INSERT INTO users (username, password) VALUES ('ravi', 'ravi123');
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 5 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step05MyUser {

    public static void addMyUser(Map<String, String> users) {
        // users is a Map, like {"rajeev" = "ilp123"}
        // ✍️ Write this line:
        //    users.put("ravi", "ravi123");
        // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
    }
}
