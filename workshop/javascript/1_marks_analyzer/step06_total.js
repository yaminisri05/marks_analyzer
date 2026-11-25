// ==============================================================
//  STEP 6 of 10  ·  Total marks
// ==============================================================
//  WHAT:  Add up the marks of all students. The page also shows the average.
//  HINT:  Start total at 0. Inside the loop, add each student's marks to total.
//
//  SQL CORNER (just read: the app already does this in the SQLite database for you)
//      SELECT SUM(marks), AVG(marks) FROM students;
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step06_total.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function totalMarks(students) {
  let total = 0;
  for (const s of students) {
    // ✍️ Write this line:
    //    total = total + s.marks;
    // 👈 YOUR CODE HERE (type the line above here, in place of this comment)
  }
  return total;
}

// ---------- Do not change anything below this line ----------
module.exports = totalMarks;
if (require.main === module) require("./checks").run(6);
