# ==============================================================
#  STEP 6 of 10  ·  Withdraw money   (DAY 3)
# ==============================================================
#  WHAT:  Take the amount out of the balance.
#  HINT:  New balance = old balance - amount.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      UPDATE accounts SET balance = balance - 200 WHERE id = 1;
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step06_withdraw.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def withdraw(account, amount):
    # ✍️ Write this line:
    #    account["balance"] = account["balance"] - amount
    pass  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(6)
