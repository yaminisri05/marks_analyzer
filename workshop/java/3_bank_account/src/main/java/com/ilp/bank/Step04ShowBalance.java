package com.ilp.bank;

import java.util.*;

// ==============================================================
//  STEP 4 of 10  ·  Show the balance   (DAY 2)
// ==============================================================
//  WHAT:  Show the balance in big text, like: Balance: ₹500
//  HINT:  account.balance is the money.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      SELECT balance FROM accounts WHERE id = 1;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Stop the app (Ctrl + C) and run it again:  mvn -o spring-boot:run
//         5. Refresh the browser page. Step 4 turns green when it is right.
//  Only change the marked line. Do not touch anything else.
// ==============================================================

public class Step04ShowBalance {

    public static String balanceHtml(Account account) {
        // ✍️ Write this line:
        //    return "<h2>Balance: ₹" + account.balance + "</h2>";
        return null; // 👈 YOUR CODE HERE (replace this line)
    }
}
