# TaskS109E - Enums dates and records.

## Description
This project was created for academic purposes as part of the IT Academy Java & Spring specialization.
The goal is to test the generic parameters and the varargs in methods.

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
            │   │   └── Main.java
            │   └── exercises234
            │       ├── Level.java
            │       ├── Main.java
            │       └── Task.java
            ├── level2
            │   ├── exercise6
            │   │   ├── Appointment.java
            │   │   ├── ConsoleUI.java
            │   │   ├── EmptyDescriptionException.java
            │   │   ├── Main.java
            │   │   └── Program.java
            │   └── exercises12345
            │       └── Main.java
            └── level3
                ├── Main.java
                ├── PersonClass.java
                └── Person.java

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

## Level 1

### Exercise 1

I created an enum called Day with the days of week and created a method that receives a day and write on console if the day is weekend or not is weekend.

### Exercise 2

I created an enum with LOW, MEDIUM and HIGH values and a class called TASK that receives the enum in the constructor.

### Exercise 3

I added a method getColor in the enum that returns a different color name for each level.

### Exercise 4

I converted an String to the enum value with valueOf and did a try catch to find when an incorrect value is passed.

## Level 2

### Exercise 1

I showed in the terminal the local date and time using LocalDate, LocalTime and LocalDatetime.

### Exercise 2

I calculated the difference between two dates with Period. And later I calculated how many seconds will pass since one hour later.

### Exercise 3

I added and subtracted days, months and hours to a date and a time.

### Exercise 4

I formatted a date from a string with two different formats.

### Exercise 5

I created a function that receives one date and returns true if the date in anterior to today.

### Exercise 6

I created a program that stores appointments introduced by the user with a date, time and a description. The program shows the next dates.

## Level 3

### Exercise 1

I created a record and instantiated it.

### Exercise 2

I added methods in the record.

### Exercise 3

I created a validation rule that throws exception if not is correct.

### Exercise 4

I created a list of the record type and filtered it with lambda and streams.

### Exercise 5

I created a class that makes the same functionality as the record.

I observe that the Record has advantages, it requires less coding.

It not requires to pass the values on the constructor and implements automatically the toString, equals and hashCode methods.