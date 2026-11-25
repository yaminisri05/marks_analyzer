package com.ilp.bank;

import java.util.*;

// ==============================================================
//  STEP 10 of 10  ·  Add 4% interest   (DAY 3)
// ==============================================================
//  WHAT:  Add 4% interest to the balance (₹1000 becomes ₹1040).
//  HINT:  Interest = balance * 4 / 100. New balance = balance + interest.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      UPDATE accounts SET balance = balance * 1.04 WHERE id = 1;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 10 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step10Interest {

    public static void addInterest(Account account) {
        // ✍️ Write this line:
        //    account.balance = account.balance + account.balance * 4 / 100;
        // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
    }
}
