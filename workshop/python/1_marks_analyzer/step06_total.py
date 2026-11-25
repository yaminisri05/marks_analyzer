# ==============================================================
#  STEP 6 of 10  ·  Total marks
# ==============================================================
#  WHAT:  Add up the marks of all students. The page also shows the average.
#  HINT:  Start total at 0. Inside the loop, add each student's marks to total.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      SELECT SUM(marks), AVG(marks) FROM students;
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step06_total.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def total_marks(students):
    total = 0
    for s in students:
        # ✍️ Write this line:
        #    total = total + s["marks"]
        pass  # 👈 YOUR CODE HERE (replace this line)
    return total


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(6)
