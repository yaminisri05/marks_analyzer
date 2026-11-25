// ==============================================================
//  STEP 9 of 10  ·  Sign up a new user
// ==============================================================
//  WHAT:  Save a new username and password, so new people can sign up.
//  HINT:  Same as step 5, but use the username and password the person typed.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      INSERT INTO users (username, password) VALUES ('kiran', 'kiran123');
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step09_register.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function register(users, username, password) {
  // ✍️ Write this line:
  //    users[username] = password;
  // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
}

// ---------- Do not change anything below this line ----------
module.exports = register;
if (require.main === module) require("./checks").run(9);
