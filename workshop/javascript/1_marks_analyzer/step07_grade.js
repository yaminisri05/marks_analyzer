// ==============================================================
//  STEP 7 of 10  ·  Grade with if / else
// ==============================================================
//  WHAT:  Give a grade: A for 90+, B for 75+, C for 60+, else D.
//  HINT:  A is already done. Write two elif (else if) blocks for B and C, above the else.
//
//  HOW:   1. Find the line marked  👈 YOUR CODE HERE
//         2. Type the line shown just above it (in the comment)
//         3. Save the file:  Ctrl + S
//         4. Check it in the terminal:   node step07_grade.js
//         5. Refresh the browser page (final.js must be running)
//  Only change the marked line. Do not touch anything else.
// ==============================================================

function grade(marks) {
  if (marks >= 90) return "A";
  // ✍️ Write these lines:
  //    else if (marks >= 75) return "B";
  //    else if (marks >= 60) return "C";
  // 👈 YOUR CODE HERE (type the lines above on the next lines, same spaces at the start)
  else return "D";
}

// ---------- Do not change anything below this line ----------
module.exports = grade;
if (require.main === module) require("./checks").run(7);
