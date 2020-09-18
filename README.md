


# TDD Bank Kata
This project explores the design of a modest banking application.  The problem comes from Sandro Mancuso's *Outside-In TDD*.  The solution comes from exercising outside-in test-driven development.  This repository consists of three branches: *master*, *problem* and *solution*.  This is the master branch, it has some meta blurb about the problem and solution; the problem branch is nothing more than a read-me with the problem statement; the solution branch contains my solution having used outside-in test-driven development.



## The Problem
The statement of the problem can be found in this project on the problem branch.  The problem can be found in its original form.

* https://codurance.com/videos/2015-05-12-outside-in-tdd-part-1
* https://codurance.com/videos/2015-05-12-outside-in-tdd-part-2
* https://codurance.com/videos/2015-05-12-outside-in-tdd-part-3

Sandro live-codes his way through the problem in these videos.  It is impressive.


## A Solution
My solution can be found on the solution branch.  This was my third take at the solution.  This time I dialled up the dependency injection to 11.  Subjectively, I think that it took a long time -- a full working day, I could probably speed up -- but it is a working piece of software and I am pleased with the design :)


## Setting Up
The coding environment was Intellij, Java 14 (compiled to 12), Maven (to handle the Jars, does not support CLI) with JUnit 5 and Mockito 2.

    mkdir tdd-bank-kata

    cd tdd-bank-kata
    git clone https://github.com/rik-howard/tdd-bank-kata.git master

    cd master
    git worktree add ../problem problem
    git worktree add ../solution solution
