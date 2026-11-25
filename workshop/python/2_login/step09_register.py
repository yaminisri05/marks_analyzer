# ==============================================================
#  STEP 9 of 10  ·  Sign up a new user
# ==============================================================
#  WHAT:  Save a new username and password, so new people can sign up.
#  HINT:  Same as step 5, but use the username and password the person typed.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      INSERT INTO users (username, password) VALUES ('kiran', 'kiran123');
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step09_register.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def register(users, username, password):
    # ✍️ Write this line:
    #    users[username] = password
    pass  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(9)
