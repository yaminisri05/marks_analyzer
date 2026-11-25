// ==============================================================
//  STEP 4 of 10  ·  Add button
// ==============================================================
//  WHAT:  Add a button. Clicking it sends the name and marks to the server.
//  HINT:  A <button> inside a form sends the form when clicked.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      CREATE TABLE students (id INTEGER PRIMARY KEY, name TEXT, marks INTEGER);
//      INSERT INTO students (name, marks) VALUES ('Ravi', 80);
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step04_add_button.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function addButton() {
  // ✍️ Write this line:
  //    return '<button type="submit">Add</button>';
  return null; // 👈 YOUR CODE HERE (replace this line)
}

// ---------- Do not change anything below this line ----------
module.exports = addButton;
if (require.main === module) require("./checks").run(4);
