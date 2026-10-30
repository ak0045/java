Q.1) Write a package game which will have 2 classes Indoor & Outdoor. Use a function display() to generate the list of players for the specific game. Use default & parameterized constructor.

Program 1: Indoor.java

package game;

public class Indoor {
    String game;
    String[] players;

    public Indoor() {
        game = "Table Tennis";
        players = new String[]{"Rahul", "Amit", "Sneha", "Priya"};
    }

    public Indoor(String game, String[] players) {
        this.game = game;
        this.players = players;
    }

    public void display() {
        System.out.println("Indoor Game: " + game);
        System.out.println("Players:");

        for (String player : players) {
            System.out.println(player);
        }
    }
}

Program 2: Outdoor.java
package game;

public class Outdoor {
    String game;
    String[] players;

    public Outdoor() {
        game = "Cricket";
        players = new String[]{"Virat", "Rohit", "Rahul", "Hardik"};
    }

    public Outdoor(String game, String[] players) {
        this.game = game;
        this.players = players;
    }

    public void display() {
        System.out.println("Outdoor Game: " + game);
        System.out.println("Players:");

        for (String player : players) {
            System.out.println(player);
        }
    }
}


Main Program: mainprogram.java

import game.Indoor;
import game.Outdoor;

public class mainprogram {
    public static void main(String[] args) {
        Indoor i1 = new Indoor();
        Outdoor o1 = new Outdoor();

        i1.display();

        System.out.println();

        o1.display();

        System.out.println();

        String[] indoorPlayers = {"Ajay", "Vijay"};
        String[] outdoorPlayers = {"Sachin", "Virat", "MS Dhoni"};

        Indoor i2 = new Indoor("Chess", indoorPlayers);
        Outdoor o2 = new Outdoor("Football", outdoorPlayers);

        i2.display();

        System.out.println();

        o2.display();
    }
}

====================================
Output
Indoor Game: Table Tennis
Players:
Rahul
Amit
Sneha
Priya

Outdoor Game: Cricket
Players:
Virat
Rohit
Rahul
Hardik

Indoor Game: Chess
Players:
Ajay
Vijay

Outdoor Game: Football
Players:
Sachin
Virat
MS Dhoni

======================================
  
Q.2) Write a Java program to define a class MyDate (day, month, year) with methods to accept and display MyDate object. Accept date as dd, mm, yyyy. Throw user defined exception "InvalidDateException" if the date is invalid.
Examples of invalid dates:12 15 2015,31 6 1990,29 2 2001
------------------------
Program: DateDemo.java
------------------------
  
import java.util.Scanner;

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    int day, month, year;

    void accept() throws InvalidDateException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (dd mm yyyy): ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        if (month < 1 || month > 12)
            throw new InvalidDateException("Invalid month!");

        int maxDays;

        switch (month) {
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    maxDays = 29;
                else
                    maxDays = 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;

            default:
                maxDays = 31;
        }

        if (day < 1 || day > maxDays)
            throw new InvalidDateException("Invalid day!");
    }

    void display() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public class DateDemo {
    public static void main(String[] args) {
        MyDate d = new MyDate();

        try {
            d.accept();
            d.display();
        } catch (InvalidDateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

=========================================
Output 1: Valid Date
Enter date (dd mm yyyy): 15 8 2024
Date: 15/8/2024
Output 2: Invalid Month
Enter date (dd mm yyyy): 12 15 2015
Exception: Invalid month!
Output 3: Invalid Day
Enter date (dd mm yyyy): 31 6 1990
Exception: Invalid day!
Output 4: Invalid Leap Year Date
Enter date (dd mm yyyy): 29 2 2001
Exception: Invalid day!
===================================

OR
Q.2) Write a Java program to define a class Student having rollno, name and percentage. Define Default and parameterized constructor. Overload the constructor. Accept the 5 student details and display it. (Use this keyword).

Program: StudentDemo.java

import java.util.Scanner;

class Student {
    int rollno;
    String name;
    float percentage;

    Student() {
        rollno = 0;
        name = "Unknown";
        percentage = 0;
    }

    Student(int rollno, String name, float percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }

    void display() {
        System.out.println(rollno + "\t" + name + "\t" + percentage);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of student " + (i + 1));

            System.out.print("Roll No: ");
            int rollno = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Percentage: ");
            float percentage = sc.nextFloat();

            s[i] = new Student(rollno, name, percentage);
        }

        System.out.println("\nRollNo\tName\tPercentage");

        for (int i = 0; i < 5; i++) {
            s[i].display();
        }
    }
}
=================================
Output
Enter details of student 1
Roll No: 1
Name: Rahul
Percentage: 85.5

Enter details of student 2
Roll No: 2
Name: Amit
Percentage: 78.5

Enter details of student 3
Roll No: 3
Name: Sneha
Percentage: 92.5

Enter details of student 4
Roll No: 4
Name: Priya
Percentage: 88.0

Enter details of student 5
Roll No: 5
Name: Ajay
Percentage: 75.5

RollNo  Name    Percentage
1       Rahul   85.5
2       Amit    78.5
3       Sneha   92.5
4       Priya   88.0
5       Ajay    75.5
