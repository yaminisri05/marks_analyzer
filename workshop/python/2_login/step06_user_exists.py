# ==============================================================
#  STEP 6 of 10  ·  Check the user exists
# ==============================================================
#  WHAT:  Return true if this username is in users.
#  HINT:  'in' checks if a key is inside a dictionary.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      SELECT COUNT(*) FROM users WHERE username = 'ravi';
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step06_user_exists.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def user_exists(users, username):
    # ✍️ Write this line:
    #    return username in users
    return None  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(6)
