# VP Bank Management System (Java Console Application)

A console-based **Bank Management System** built in **Java** that allows users to manage customer banking profiles through file storage. This project demonstrates object-oriented programming fundamentals, file handling, customer account management, and menu-driven interaction.

---

## Overview

The VP Bank Management System simulates a simple banking database where users can:

- Add new customers
- Delete customer profiles
- Store account information in text files
- Manage savings, checking, and credit accounts
- Search and sort customer information (planned menu structure)
- Maintain customer records using SIN (Social Insurance Number)

This project focuses on Java fundamentals such as:

- User input handling
- File reading and writing
- Buffered I/O
- Menu systems
- Conditional account creation
- Data persistence

---

## Features

### Customer Management Features

- Add a new customer profile
- Delete customer by SIN
- Store:
  - First Name
  - Last Name
  - SIN
  - Date of Birth
  - Savings Account
  - Checking Account
  - Credit Account

---

### Banking Features

### Savings Account
- Optional for all customers
- User-defined balance

### Checking Account
- Available only for customers 18+
- Optional account balance

### Credit Account
- Available only for customers 18+
- Optional credit balance

---

### File Management

- Customer profiles saved in `Accounts.txt`
- Deleted profiles removed through temporary file reconstruction
- Persistent customer storage between sessions

---

## Technologies Used

- **Java**
- **Java Console Application**
- **File Handling (`FileWriter`, `BufferedWriter`, `BufferedReader`)**
- **Scanner Input**
- **Conditional Logic**
- **Menu-Driven Programming**

---

## Project Structure

```bash
Bank.java
Accounts.txt
temporary.txt
README.md
```

---

## How to Run

### Requirements

- Java JDK 8 or later
- Terminal / Command Prompt
- Any Java IDE (optional)

---

### Steps

1. Clone or download the project
2. Open terminal in the project folder
3. Compile the program:

```bash
javac Bank.java
```

4. Run the application:

```bash
java Bank
```

---

## Main Menu Options

```text
Welcome to the VP bank.
-----------------------
1: Add a customer
2: Delete a customer
3: Sort customers by last name, first name
4: Sort customers by SIN
5: Display customer summary (name, SIN)
6: Find profile by last name, first name
7: Find profile by SIN
8: Quit
```

---

## Example Workflow

### Add a Customer

The user enters:

- First Name
- Last Name
- Age
- SIN
- Date of Birth
- Savings account preference
- Checking account preference (18+)
- Credit account preference (18+)

---

### Delete a Customer

- Enter customer SIN
- Matching profile removed from `Accounts.txt`
- Temporary file replaces original

---

## Data Storage Format

Each customer profile is stored in structured text format:

```text
--------------
Last Name
First Name
SIN
Year
Month
Day
Savings Balance
Checking Balance
Credit Balance
----------------
```

---

## Learning Objectives

This project is useful for practicing:

- Java file handling
- Text database management
- CRUD operations (Create/Delete)
- Scanner input validation
- Conditional logic
- Menu-driven applications
- Banking system fundamentals

---

## Known Limitations

- Sorting functions listed but incomplete
- Search functions listed but incomplete
- Limited input validation
- Potential parsing issues with invalid balances
- Uses plain text instead of database
- SIN uniqueness not enforced
- Security limitations (sensitive data stored unencrypted)

---

## Future Improvements

- Full customer search by SIN/name
- Sorting by customer name or SIN
- Deposit/withdraw functions
- PIN/password security
- GUI banking interface
- Database integration (MySQL/SQLite)
- Input validation improvements
- Transaction history
- Loan management

---

## Academic / Educational Purpose

This project is designed for learning:

- Java fundamentals
- Banking data structures
- File storage systems
- Customer record management

---

## Author
Mateo Hadzimustafic
