// ==============================================================
//  STEP 9 of 10  ·  Transaction history   (DAY 3)
// ==============================================================
//  WHAT:  Save each deposit and withdrawal in a history list.
//  HINT:  push() adds an item to the end of an array.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      CREATE TABLE transactions (id INTEGER PRIMARY KEY, account_id INTEGER, text TEXT);
//      INSERT INTO transactions (account_id, text) VALUES (1, 'Deposited 500');
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step09_history.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function addHistory(history, text) {
  // text is like "Deposited ₹500"
  // ✍️ Write this line:
  //    history.push(text);
  // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
}

// ---------- Do not change anything below this line ----------
module.exports = addHistory;
if (require.main === module) require("./checks").run(9);
