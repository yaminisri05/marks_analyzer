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
//         4. Check it in the terminal:   node step04_show_balance.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function balanceHtml(account) {
  // ✍️ Write this line:
  //    return "<h2>Balance: ₹" + account.balance + "</h2>";
  return null; // 👈 YOUR CODE HERE (replace this line)
}

// ---------- Do not change anything below this line ----------
module.exports = balanceHtml;
if (require.main === module) require("./checks").run(4);
