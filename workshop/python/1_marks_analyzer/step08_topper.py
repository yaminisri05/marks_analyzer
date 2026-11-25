# ==============================================================
#  STEP 8 of 10  ·  Find the topper
# ==============================================================
#  WHAT:  Find the student with the highest marks.
#  HINT:  Python's max() finds the biggest. key=lambda s: s["marks"] tells it to compare by marks.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      SELECT name, marks FROM students ORDER BY marks DESC LIMIT 1;
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step08_topper.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def topper(students):
    # ✍️ Write this line:
    #    return max(students, key=lambda s: s["marks"])
    return None  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(8)
