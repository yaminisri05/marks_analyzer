package com.ilp.bank;

import java.util.*;

// ==============================================================
//  STEP 3 of 10  ·  Open an account   (DAY 2)
// ==============================================================
//  WHAT:  Create a new account with this name and balance 0.
//  HINT:  new Account(name, balance) makes an account object.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      CREATE TABLE accounts (id INTEGER PRIMARY KEY, name TEXT, balance REAL DEFAULT 0);
//      INSERT INTO accounts (name, balance) VALUES ('Ravi', 0);
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 3 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step03CreateAccount {

    public static Account createAccount(String name) {
        // ✍️ Write this line:
        //    return new Account(name, 0);
        return null; // 👈 YOUR CODE HERE (replace this line)
    }
}
