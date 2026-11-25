// ==============================================================
//  STEP 8 of 10  ·  Find the topper
// ==============================================================
//  WHAT:  Find the student with the highest marks.
//  HINT:  Start with the first student as best. If someone has more marks, they become the best.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      SELECT name, marks FROM students ORDER BY marks DESC LIMIT 1;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step08_topper.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function topper(students) {
  let best = students[0];
  for (const s of students) {
    // ✍️ Write this line:
    //    if (s.marks > best.marks) best = s;
    // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
  }
  return best;
}

// ---------- Do not change anything below this line ----------
module.exports = topper;
if (require.main === module) require("./checks").run(8);
