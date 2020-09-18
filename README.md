


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

### Words
| Nouns          | Verbs          |
|----------------|----------------|
| account        | deposit        |
| statement      | withdraw       |
| transaction    | print          |
| amount         |                |
| balance        |                |
| stamp          |                |

### Scenarios
1 Depositing
> **Given** an *account*,<br/>
  **when** you *deposit* an *amount*,<br/>
  **then** we *store* a new *transaction*.

2 Withdrawing
> **Given** an *account*,<br/>
  **when** you *withdraw* an *amount*,<br/>
  **then** we *store* a new *transaction*.

3 Printing
> **Given** an *account*,<br/>
  **when** you *print* a *statement*,<br/>
  **then** we *display* a *stamp*, an *amount* and a *balance*, for each *transaction*.


### Descriptions
1 Depositing
* accept amount
* retrieve stamp
* create transaction from amount and stamp
* store transaction

2 Withdrawing
* accept amount
* retrieve stamp
* create transaction from -amount and stamp
* store transaction

3 Printing
* retrieve transactions
* format transactions
* display formations

### Classes
Service

    Account {}

Data

    Transaction {Amount amount; Stamp stamp}
    Formation {Amount amount; Stamp stamp; Balance balance}

Collaborators

    Stamper {Stamp stamp ()}
    Acceptor {Boolean accepts (Amount)}
    Creator {Transaction transaction (Amount, Stamp)}
    History {void store (Transaction); TransactionList transactions ();}
    Formatter {FormationList formations (TransactionList)}
    Displayer {void display (FormationList)}

### Sugar

    Amount = Integer
    Stamp = String
    TransactionList = List <Transaction>
    FormationList = List <Formation>

### Notes
1.  The acceptor accepts only positive integers so some tests should expect an exception.
3.  Withdrawing is not currently negating the amount: a requirement needs to capture this.
4.  As this project resides in a single package, the public Account methods have been made package-private to avoid IDE warnings.
