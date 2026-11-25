// ==============================================================
//  STEP 9 of 10  ·  Delete a student
// ==============================================================
//  WHAT:  Remove one student from the list. A ❌ link appears next to each student.
//  HINT:  splice(index, 1) removes 1 item at that position. (slice only copies, it does not remove.)
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      DELETE FROM students WHERE id = 2;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step09_delete.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function deleteStudent(students, index) {
  // ✍️ Write this line:
  //    students.splice(index, 1);
  // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
}

// ---------- Do not change anything below this line ----------
module.exports = deleteStudent;
if (require.main === module) require("./checks").run(9);
