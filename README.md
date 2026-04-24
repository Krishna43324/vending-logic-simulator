## Student Information
- Name: Krishna Chinta
- Email: kchinta1@umbc.edu

## Project Title
Vending-Logic-Simulator

## Project Overview
This project contains a java program that provides a list of available snacks, their associated costs, and their alphanumeric IDs using a 2D array structure. The program simulates a real-world vending machine interface where users can select an item by its coordinate (like A1 or B2), input payment, and receive change along with their selected product.

## Goal of this Project
The goal of this project is to demonstrate the practical application of multidimensional arrays to solve organizational problems. By mapping a vending machine's inventory to a matrix, the program successfully provides an easy interface for users that want to order from a vending machine. Furthermore, the project serves as an exercise in implementing transaction logic, ensuring that user input is validated against predefined costs before a purchase is finalized.

## Technologies and Concepts Used
1. Java
2. String Parsing
3. Data Structures (2D list)
4. Error Handling
5. The Scanner class/library

## Key Features & Functionality

Matrix-Based Inventory: Uses 2D arrays to keep product names, prices, and IDs perfectly synced.

Coordinate Mapping: Allows the user to select items using familiar alphanumeric codes (e.g., A1, B2) which the program then maps to specific array indices.

Payment Validation Loop: Includes a while loop that checks if the user has provided enough money, prompting for additional funds until the cost is met.

Automated Change Calculation: Once the transaction is valid, the system calculates the difference between the payment and the cost to return the correct change.

Formatted Visual Menu: Displays the entire machine inventory in a clean, readable grid format when the program starts.

## Setup:
1. Install the Java Development Kit if not able to execute .java files from this link: https://www.oracle.com/java/technologies/downloads/
2. Clone the repository by typing ‘git clone https://github.com/Krishna43324/vending-logic-simulator.git’
3. Use the terminal to type ‘javac VendingMachine.java’. Press enter and then type ‘java VendingMachine’.
4. View the options that the vending machine program provides. When receiving the prompt ‘Please enter '1' or '5' to access something in this vending machine.’, type either ‘1’ or ‘5’ to enter a dollar bill before buying an item.
5. When receiving the prompt ‘Please enter the ID of the candy/chocolate you want.’, type one of the valid options (A1,C3,D4,etc).
6. The program may ask you to reinput ‘1’ or ‘5’ again in the case that the product you want to buy is more expensive than the money you inputted.




## Sample Input/Output
```
A1: Hershey Bar = $0.5  B1: Kit Kat = $0.5  C1: Crunch = $0.5  D1: Reese's = $0.5  

A2: Strawberry GummyBear = $0.1  B2: Blueberry GummyBear = $0.1  C2: Lime GummyBear = $0.1  D2: Cherry Gummybear = $0.1  

A3: White Chocolate = $1.0  B3: Dark Chocolate = $1.0  C3: Milk Chocolate = $0.9  D3: Bittersweet Choclate = $1.0  

A4: Ferrero Rocher = $1.5  B4: Ghiradelli = $1.5  C4: Nestle = $1.0  D4: Godiva = $1.5  

Please enter '1' or '5' to access something in this vending machine.
1
Please enter the ID of the candy/chocolate you want.
D4
You picked D4
Please pay more to buy this product. Then we will give your choice of product.
1
Here is your change: $0.5 and your item: D4 Godiva

```


## My Role && Contribution
This project was fully designed and implemented by me. I wrote the whole Java program that provided the full functionality to allow users to select items from the vending machine and to validate user input to ensure that the user provided a sufficient amount of money.

## Reflection
One of the main challenges was input validation. Making sure the user does not type input of different types and different ranges of numbers took a lot of testing.
