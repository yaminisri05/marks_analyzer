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
//         4. Check it in the terminal:   node step05_my_user.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function addMyUser(users) {
  // users is an object, like { rajeev: "ilp123" }
  // ✍️ Write this line:
  //    users["ravi"] = "ravi123";
  // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
}

// ---------- Do not change anything below this line ----------
module.exports = addMyUser;
if (require.main === module) require("./checks").run(5);
