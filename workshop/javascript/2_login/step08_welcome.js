// ==============================================================
//  STEP 8 of 10  ·  Welcome message
// ==============================================================
//  WHAT:  After login, show: Welcome, <username>!
//  HINT:  Join <h2>Welcome, + the username + !</h2> with +.
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step08_welcome.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function welcome(username) {
  // ✍️ Write this line:
  //    return "<h2>Welcome, " + username + "!</h2>";
  return null; // 👈 YOUR CODE HERE (replace this line)
}

// ---------- Do not change anything below this line ----------
module.exports = welcome;
if (require.main === module) require("./checks").run(8);
