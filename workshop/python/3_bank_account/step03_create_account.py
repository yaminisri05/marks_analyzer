# ==============================================================
#  STEP 3 of 10  ·  Open an account   (DAY 2)
# ==============================================================
#  WHAT:  Create a new account with this name and balance 0.
#  HINT:  An account is a dictionary with two keys: name and balance.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      CREATE TABLE accounts (id INTEGER PRIMARY KEY, name TEXT, balance REAL DEFAULT 0);
#      INSERT INTO accounts (name, balance) VALUES ('Ravi', 0);
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step03_create_account.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def create_account(name):
    # ✍️ Write this line:
    #    return {"name": name, "balance": 0}
    return None  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(3)
