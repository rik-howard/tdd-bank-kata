


# TDD Bank Kata: To do
| Action | Time  |
|--------|:-----:|
| Start  | 13:30 |
| End    | 21:30 |


## ✓ Before Coding
1.  ✓ Create a GitHub repo called *tdd-bank-kata*.
1.  ✓ Provide a description: *This project explores the design of a modest banking application.*.
1.  ✓ Initialise it with a read-me.
1.  ✓ Initialise it with a Git ignorance.
1.  ✓ Check out the project locally.
1.  ✓ Create a branch: *problem*
1.  ✓ Extend the problem-branch read-me with the description of the problem.
1.  ✓ Create a branch from the problem branch: *solution*.
1.  ✓ Extend the solution-branch read-me with the description of the solution.



## ✓ The Read-Me's First Paragraph
This project explores the design of a modest banking application.  The problem comes from Sandro Mancuso's *Outside-In TDD*.  The solution comes from exercising outside-in test-driven development.


## ✓ Coding
1.  ✓ Introduce *pom.xml*.
1.  ✓ Introduce *src/test/java/bank/Acceptance.java*.
1.  ✓ Code the first test: *despositing_stores_a_transaction*.
1.  ✓ ...


## ✓ After Coding
1.  ✓ Extend the master read-me with an explanation of the Git structure.
1.  ✓ Extend the master read-me with some thoughts about the solution branch.
1.  ✓ ...


## ✓ Master Read-Me
* ✓ links to videos
* ✓ explanation of branching structure
* ✓ reproduction of thrid take
* ✓ coding environment: intellij, ...

### ✓ References
* https://codurance.com/videos/2015-05-12-outside-in-tdd-part-1
* https://codurance.com/videos/2015-05-12-outside-in-tdd-part-2
* https://codurance.com/videos/2015-05-12-outside-in-tdd-part-3


## Creating the repository

    mkdir -p tdd-bank-kata && cd tdd-bank-kata
    git clone https://github.com/rik-howard/tdd-bank-kata.git master

    cd master
    git worktree add ../problem

    cd ../problem
    # Intro problem to read-me
    git push --set-upstream origin problem
    git worktree add ../solution

    cd ../solution
    # Intro solution to read-me
    git push --set-upstream origin solution


## Intellij

### Create new project
* type: Maven
* group id: net.tdd
* artifact id: tdd-bank-kata
* version: 0.0.0
* project name: tdd-bank-kata-solution
* project location: ~/studio/project/tdd-bank-kata/solution
* add *pom.xml* to Git
* add POM dependencies: JUnit 5, Mockito 2

### Arse ache
* settings: Java compiler: target byte code version: 12
* project settings: modules: sources: language level: 12
