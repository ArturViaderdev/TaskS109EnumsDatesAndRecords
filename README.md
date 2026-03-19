# TaskS109E - Enums dates and records.

## Description
This project was created for academic purposes as part of the IT Academy Java & Spring specialization.
The goal is to test the enums, dates and records.

The project is structured in three levels of increasing complexity.

## 🛠 Technologies
- Java

##    Project Structure
````bash
├── pom.xml
├── README.md
└── src
    └── main
        └── java
            ├── level1
            │   ├── exercise1
            │   │   ├── Day.java
            │   │   ├── Main.java
            │   │   └── Program.java
            │   └── exercises234
            │       ├── Level.java
            │       ├── Main.java
            │       ├── Program.java
            │       └── Task.java
            ├── level2
            │   ├── exercise6
            │   │   ├── Appointment.java
            │   │   ├── ConsoleUI.java
            │   │   ├── EmptyDescriptionException.java
            │   │   ├── Main.java
            │   │   └── Program.java
            │   └── exercises12345
            │       ├── Main.java
            │       └── Program.java
            └── level3
                ├── Main.java
                ├── PersonClass.java
                ├── Person.java
                └── Program.java

````

## 🚀 Instal.lation and Execution
1. Clone the repository:
````bash
git clone https://github.com/ArturViaderdev/TaskS109EnumsDatesAndRecords
cd TaskS109EnumsDatesAndRecords/src/main/java
````
You can do cd into the exercise folder you want to execute and execute with:
````
java Main.java
````
Or run with IntelliJ IDEA.

The projects are inside src/main/java.

## This task covers three fundamental Java topics

This task covers three fundamental Java topics that will help you write clearer, safer, and more modern code:
**enums** to represent finite and controlled values, **dates and times** using the Java Time API to handle time in a robust way, and **records**, a Java feature for declaring immutable data classes with less code.

***

### Level 1: Enums

**Enums (enumerations)** allow you to define a set of constant values, giving them meaningful names and improving code safety. They are very useful for representing closed options such as days of the week, priority levels, or entity states. Unlike `String` or `int` values, enums prevent errors from invalid values and can include behavior (methods).

In this level, you’ll work on creating enums, using them in conditions and classes, and extracting useful information from them.

**Exercises:**

### Exercise 1
Create an enum called `Day` with the days of the week. Write a function that receives a `Day` and prints whether it’s a weekday or weekend.

***Answer***

I created an enum called `Day` with the days of the week and wrote a method that receives a day and prints to the console whether it’s a weekend or not.

### Exercise 2

Create an enum `Level` with values `LOW`, `MEDIUM`, and `HIGH`. Create a class `Task` with a `Level` property and show how behavior changes depending on the level.

***Answer***

I created an enum with the values `LOW`, `MEDIUM`, and `HIGH`, and a class called `Task` that receives the enum in its constructor.

### Exercise 3

Add methods inside the enum and check that they can contain logic (e.g., `getColor()` for each `Level`).

***Answer***

I added a `getColor` method to the enum that returns a different color name for each level.

### Exercise 4

Convert a `String` to an enum (using `valueOf`) and handle errors if the value is invalid.

***Answer***

I converted a `String` to an enum value using `valueOf`, and used a `try-catch` block to handle invalid values.

***

### Level 2: Dates and Times

Working with dates and times is fundamental in many projects. Since Java 8, the **`java.time` API** offers a robust and clear way to handle time, avoiding the problems of the old `Date` class.

You’ll learn to represent time precisely (`LocalDate`, `LocalTime`, `LocalDateTime`), perform time calculations, compare dates, format them, and work with schedules or calendars. This is a key tool for developing time-related applications.

**Exercises:**

### Exercise 1

Display the current date and time using `LocalDate`, `LocalTime`, and `LocalDateTime`.

***Answer***

I displayed the local date and time in the terminal using `LocalDate`, `LocalTime`, and `LocalDateTime`.

### Exercise 2

Calculate the difference between two dates (using `Period` or `Duration`).

***Answer***

I calculated the difference between two dates using `Period`, and then calculated how many seconds would pass one hour later.

### Exercise 3

Add or subtract days, months, or hours from a date.

***Answer***

I added and subtracted days, months, and hours from a date and time.

### Exercise 4

Format a date using `DateTimeFormatter` (in different formats).

***Answer***

I formatted a date from a `String` using two different formats.


### Exercise 5

Create a function that indicates whether a given date is earlier than today.

***Answer***

I created a function that receives a date and returns `true` if the date is earlier than today.

### Exercise 6

Create a calendar with appointments stored as `LocalDateTime` and display the upcoming ones.

***Answer***

I created a program that stores appointments entered by the user, including a date, time, and description. The program then shows the upcoming appointments.

***

### Level 3: Records

**Records** are a modern Java feature designed to reduce boilerplate code when you only need to encapsulate data. They are immutable by default, automatically provide `getters`, `toString`, `equals`, and `hashCode`, and improve code readability.

This level will help you understand how to create and use records, add basic logic, validate values, and compare them to regular classes. They are very useful for building simple, clean data models.

**Exercises:**

### Exercise 1

Create a record called `Person(String name, int age)` and show how to instantiate it.

***Answer***

I created a record and instantiated it.

### Exercise 2
Add custom methods inside a record.

***Answer***

I added custom methods to the record.

### Exercise 3
Create a record with validation in the constructor (e.g., age cannot be negative).

***Answer***

I created a validation rule that throws an exception if the data is invalid.

### Exercise 4

Create a list of `Person` objects and filter it using lambdas and streams (e.g., show only adults).

***Answer***

I created a list of record instances and filtered it using lambdas and streams.

### Exercise 5
Compare a record with a traditional class and comment on the differences in readability and usefulness.

***Answer***

I created a class with the same functionality as the record.

I observed that records have advantages because they require less code.
They don’t require explicit value assignments in the constructor and automatically implement the `toString`, `equals`, and `hashCode` methods.

***




