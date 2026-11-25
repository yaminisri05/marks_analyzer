# ==============================================================
#  STEP 5 of 10  ·  Deposit money   (DAY 2)
# ==============================================================
#  WHAT:  Add the amount to the balance.
#  HINT:  New balance = old balance + amount.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      UPDATE accounts SET balance = balance + 500 WHERE id = 1;
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step05_deposit.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def deposit(account, amount):
    # ✍️ Write this line:
    #    account["balance"] = account["balance"] + amount
    pass  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(5)
