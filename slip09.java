Q.1) Write a Java program to calculate area of Cylinder and Circle. (Use super keyword).
-----------------------------
Program: CylinderCircle.java
-----------------------------

import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;

        System.out.println("Area of Circle = " + result);
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    void area() {
        double result = 2 * Math.PI * radius * (radius + height);

        System.out.println("Area of Cylinder = " + result);
    }

    void display() {
        System.out.println("Radius = " + super.radius);
        super.area();
        area();
    }
}

public class CylinderCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height of Cylinder: ");
        double height = sc.nextDouble();

        Circle c = new Circle(radius);
        Cylinder cy = new Cylinder(radius, height);

        System.out.println("\nCircle Details");
        System.out.println("----------------------");
        c.area();

        System.out.println("\nCylinder Details");
        System.out.println("----------------------");
        cy.display();

        sc.close();
    }
}
=====================================================
Output
Enter radius of Circle: 5
Enter height of Cylinder: 10

Circle Details
----------------------
Area of Circle = 78.53981633974483

Cylinder Details
----------------------
Radius = 5.0
Area of Circle = 78.53981633974483
Area of Cylinder = 471.23889803846896
=========================================================
___________________________________________________________________________________________________________________________________________________________________________________________________________

Q.2) Write a Java program to accept ‘n’ integers from the user and store them in a collection. Display them in the sorted order. The collection should not accept duplicate elements. (Use a suitable collection). Search for an element using predefined search method in the Collection framework.
------------------------------------
Program: SortedCollection.java
-------------------------------------

import java.util.Scanner;
import java.util.TreeSet;

public class SortedCollection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> numbers = new TreeSet<Integer>();

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }

        System.out.println("\nElements in Sorted Order:");
        System.out.println(numbers);

        System.out.print("\nEnter element to search: ");
        int search = sc.nextInt();

        if (numbers.contains(search)) {
            System.out.println(search + " is present in the collection.");
        } else {
            System.out.println(search + " is not present in the collection.");
        }

        sc.close();
    }
}
=======================================
Output
Enter number of integers: 6
Enter 6 integers:
40
10
30
20
10
50

Elements in Sorted Order:
[10, 20, 30, 40, 50]

Enter element to search: 30
30 is present in the collection.
===============================
____________________________________________________________________________________________________________________________________________________________________________________________________________________

OR
Q.2) Write a Java program to create a class MyDate with data members dd, mm, and yy. Implement default and parameterized constructors. Display the date in dd-mm-yy format using this keyword.
--------------------------
Program: MyDateDemo.java
-------------------------

import java.util.Scanner;

class MyDate {
    int dd;
    int mm;
    int yy;

    MyDate() {
        this.dd = 1;
        this.mm = 1;
        this.yy = 2000;
    }

    MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void displayDate() {
        System.out.println("Date: " + this.dd + "-" + this.mm + "-" + this.yy);
    }
}

public class MyDateDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int dd = sc.nextInt();

        System.out.print("Enter month: ");
        int mm = sc.nextInt();

        System.out.print("Enter year: ");
        int yy = sc.nextInt();

        MyDate date = new MyDate(dd, mm, yy);

        System.out.println("\nDate in dd-mm-yy format:");
        date.displayDate();

        sc.close();
    }
}
===============================
Output
Enter day: 25
Enter month: 10
Enter year: 2026

Date in dd-mm-yy format:
Date: 25-10-2026
