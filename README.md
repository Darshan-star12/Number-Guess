# Number-Guess

Project Overview

The Number Guessing Game is a Java-based console application that integrates with a database using Hibernate. The game involves a user investing an amount, which is then divided into three equal parts. The system generates three random numbers, and the user gets three chances to guess the correct set. If the user succeeds, the investment amount is doubled per successful attempt; otherwise, the amount becomes zero.

Features

User Registration & Login: Stores user details in a database using Hibernate.

Investment System: User invests an amount, which is split into three equal parts.

Random Number Generation: System generates three random numbers for the game.

Three Chances to Win: User has three attempts to guess the correct set.

Winning & Losing Mechanism:

If the user correctly guesses the random numbers, the amount is doubled per correct attempt.

If incorrect, the investment amount is lost.

Database Integration: Stores user investment history and game results using Hibernate.

Technology Stack

Programming Language: Java

Database: MySQL / PostgreSQL

ORM Framework: Hibernate

JDBC for Database Connection

Maven/Gradle for Dependency Management
