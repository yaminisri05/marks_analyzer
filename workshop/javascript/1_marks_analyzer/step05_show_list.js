// ==============================================================
//  STEP 5 of 10  ·  Show each student in the list
// ==============================================================
//  WHAT:  Turn one student into one line of the list: name - marks.
//  HINT:  <li> is one item of a list. Join the name, a dash, and the marks with +.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      SELECT name, marks FROM students ORDER BY id;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step05_show_list.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function studentRow(s) {
  // s is one student, like { name: "Ravi", marks: 90 }
  // ✍️ Write this line:
  //    return "<li>" + s.name + " - " + s.marks + "</li>";
  return null; // 👈 YOUR CODE HERE (replace this line)
}

// ---------- Do not change anything below this line ----------
module.exports = studentRow;
if (require.main === module) require("./checks").run(5);
