# Java Stream and Lambda Expression Examples

## 1. Sorting Employees using Lambda Expressions

### Problem Statement:
Write a Java program to sort a list of Employee objects (name, age, salary) using lambda expressions.

### Key Concepts:
- Understanding Lambda Expressions
- Sorting Objects using Custom Comparators
- Functional Programming in Java

### Implementation:
- Use `Collections.sort()` with lambda expressions to sort employees by name, age, and salary.

---

## 2. Filtering and Sorting Students using Streams

### Problem Statement:
Create a Java program that:
- Filters students scoring above 75% using lambda expressions and stream operations.
- Sorts the filtered students by their marks.
- Displays their names in sorted order.

### Key Concepts:
- Java Streams API
- Filtering and Sorting using Lambda Expressions
- Functional Programming Paradigm

### Implementation:
- Use `stream().filter()` to filter students scoring above 75%.
- Use `stream().sorted()` to sort the filtered students by marks.

---

## 3. Processing a Large Dataset using Streams

### Problem Statement:
Write a Java program to process a large dataset of products using streams. Perform the following operations:
- Group products by their category.
- Find the most expensive product in each category.
- Calculate the average price of all products.

### Key Concepts:
- Advanced Java Stream Operations
- Grouping and Aggregating Data using Streams
- Performance Optimization with Functional Programming

### Implementation:
- Use `Collectors.groupingBy()` to group products by category.
- Use `Collectors.maxBy()` to find the most expensive product in each category.
- Use `Collectors.averagingDouble()` to calculate the average price of all products.

---

## How to Run the Programs
1. Install Java (JDK 8 or later).
2. Copy the respective Java code into a `.java` file.
3. Compile and run the program using:
   ```sh
   javac ProgramName.java
   java ProgramName
   ```

---

Happy Coding! 🚀
