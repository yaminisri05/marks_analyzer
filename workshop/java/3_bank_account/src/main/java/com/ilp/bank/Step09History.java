package com.ilp.bank;

import java.util.*;

// ==============================================================
//  STEP 9 of 10  ·  Transaction history   (DAY 3)
// ==============================================================
//  WHAT:  Save each deposit and withdrawal in a history list.
//  HINT:  add() adds an item to the end of a List.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      CREATE TABLE transactions (id INTEGER PRIMARY KEY, account_id INTEGER, text TEXT);
//      INSERT INTO transactions (account_id, text) VALUES (1, 'Deposited 500');
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 9 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step09History {

    public static void addHistory(List<String> history, String text) {
        // text is like "Deposited ₹500"
        // ✍️ Write this line:
        //    history.add(text);
        // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
    }
}
