# ==============================================================
#  STEP 10 of 10  ·  Add 4% interest   (DAY 3)
# ==============================================================
#  WHAT:  Add 4% interest to the balance (₹1000 becomes ₹1040).
#  HINT:  Interest = balance * 4 / 100. New balance = balance + interest.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      UPDATE accounts SET balance = balance * 1.04 WHERE id = 1;
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step10_interest.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def add_interest(account):
    # ✍️ Write this line:
    #    account["balance"] = account["balance"] + account["balance"] * 4 / 100
    pass  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(10)
