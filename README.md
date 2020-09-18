


# TDD Bank Kata
This project explores the design of a modest banking application.  The problem comes from Sandro Mancuso's *Outside-In TDD*.  The solution comes from exercising outside-in test-driven development.


## Problem
This is the problem.

### Description -- bank kata
Create a simple bank application with the following features.

* Deposit into Account
* Withdraw from Account.
* Print a bank statement to the console.

### Acceptance criteria
The statement should have transactions in the following format.

| DATE       | AMOUNT     | BALANCE    |
|:----------:|-----------:|-----------:|
| 2014-04-10 |       +500 |      +1400 |
| 2014-04-02 |       -100 |       +900 |
| 2014-04-01 |      +1000 |      +1000 |

### Starting point
Start with a class of the following structure.

    public class Account {
        public void deposit (Integer amount) {}
        public void withdraw (Integer amount) {}
        public void printStatement () {}
    }

### Constraints
1.  You are not allowed to add any other public methods to this class.
2.  Use String and Integers for dates and amounts (keep it simple).
3.  Don't worry about spacing in the statement printed on the console.


## Solution
...
