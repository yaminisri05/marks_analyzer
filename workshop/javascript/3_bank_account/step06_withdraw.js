// ==============================================================
//  STEP 6 of 10  ·  Withdraw money   (DAY 3)
// ==============================================================
//  WHAT:  Take the amount out of the balance.
//  HINT:  New balance = old balance - amount.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      UPDATE accounts SET balance = balance - 200 WHERE id = 1;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step06_withdraw.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function withdraw(account, amount) {
  // ✍️ Write this line:
  //    account.balance = account.balance - amount;
  // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
}

// ---------- Do not change anything below this line ----------
module.exports = withdraw;
if (require.main === module) require("./checks").run(6);
