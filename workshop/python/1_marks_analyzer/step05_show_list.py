# ==============================================================
#  STEP 5 of 10  ·  Show each student in the list
# ==============================================================
#  WHAT:  Turn one student into one line of the list: name - marks.
#  HINT:  <li> is one item of a list. Join the name, a dash, and the marks with +.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      SELECT name, marks FROM students ORDER BY id;
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step05_show_list.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def student_row(s):
    # s is one student, like {"name": "Ravi", "marks": 90}
    # ✍️ Write this line:
    #    return "<li>" + s["name"] + " - " + str(s["marks"]) + "</li>"
    return None  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(5)
