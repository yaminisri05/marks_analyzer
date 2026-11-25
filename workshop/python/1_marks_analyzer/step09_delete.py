# ==============================================================
#  STEP 9 of 10  ·  Delete a student
# ==============================================================
#  WHAT:  Remove one student from the list. A ❌ link appears next to each student.
#  HINT:  list.pop(index) removes the item at that position.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      DELETE FROM students WHERE id = 2;
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step09_delete.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def delete_student(students, index):
    # ✍️ Write this line:
    #    students.pop(index)
    pass  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(9)
