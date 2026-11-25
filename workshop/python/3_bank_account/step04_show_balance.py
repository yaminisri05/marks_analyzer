# ==============================================================
#  STEP 4 of 10  ·  Show the balance   (DAY 2)
# ==============================================================
#  WHAT:  Show the balance in big text, like: Balance: ₹500
#  HINT:  account["balance"] is the money. str() turns a number into text so you can join it.
#
#  SQL CORNER (just read: the app already does this in the SQLite database for you)
#      SELECT balance FROM accounts WHERE id = 1;
#
#  HOW:   1. Find the line marked  👈 YOUR CODE HERE
#         2. Type the line shown just above it (in the comment)
#         3. Save the file:  Ctrl + S
#         4. Check it in the terminal:   python step04_show_balance.py
#         5. Refresh the browser page (final.py must be running)
#  Only change the marked line. Do not touch anything else.
# ==============================================================

def balance_html(account):
    # ✍️ Write this line:
    #    return "<h2>Balance: ₹" + str(account["balance"]) + "</h2>"
    return None  # 👈 YOUR CODE HERE (replace this line)


# ---------- Do not change anything below this line ----------
if __name__ == "__main__":
    import checks
    checks.run(4)
