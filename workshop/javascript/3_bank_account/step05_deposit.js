// ==============================================================
//  STEP 5 of 10  ·  Deposit money   (DAY 2)
// ==============================================================
//  WHAT:  Add the amount to the balance.
//  HINT:  New balance = old balance + amount.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      UPDATE accounts SET balance = balance + 500 WHERE id = 1;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step05_deposit.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function deposit(account, amount) {
  // ✍️ Write this line:
  //    account.balance = account.balance + amount;
  // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
}

// ---------- Do not change anything below this line ----------
module.exports = deposit;
if (require.main === module) require("./checks").run(5);
