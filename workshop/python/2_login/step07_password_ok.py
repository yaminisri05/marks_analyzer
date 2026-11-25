# ==============================================================
#  STEP 7 of 10  ·  Check the password
# ==============================================================
#  WHAT:  Return true if the password typed matches the saved password.
#  HINT:  users[username] gives the saved password. Compare it with == .
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      SELECT password FROM users WHERE username = 'ravi';
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step07_password_ok.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def password_ok(users, username, password):
    # ✍️ Write this line:
    #    return users[username] == password
    return None  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(7)
