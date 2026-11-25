# ==============================================================
#  STEP 4 of 10  ·  Add button
# ==============================================================
#  WHAT:  Add a button. Clicking it sends the name and marks to the server.
#  HINT:  A <button> inside a form sends the form when clicked.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      CREATE TABLE students (id INTEGER PRIMARY KEY, name TEXT, marks INTEGER);
#      INSERT INTO students (name, marks) VALUES ('Ravi', 80);
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step04_add_button.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def add_button():
    # ✍️ Write this line:
    #    return '<button type="submit">Add</button>'
    return None  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(4)
