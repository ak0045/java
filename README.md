1) Define an Interface Shape with abstract method area(). Write a Java program to calculate an area of Circle and Sphere. (Use final keyword).

Program Name: ShapeDemo.java

interface Shape {
    void area();
}

class Circle implements Shape {
    final double PI = 3.142;
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle: " + (PI * radius * radius));
    }
}

class Sphere implements Shape {
    final double PI = 3.142;
    final double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Sphere: " + (4 * PI * radius * radius));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Sphere s = new Sphere(5);

        c.area();
        s.area();
    }
}
=======================================
Output:

Area of Circle: 78.55
Area of Sphere: 314.2
__________________________________________________________________________________________________________________________________________________________________


2) Write a Java program to store student names and their Roll numbers using an appropriate collection and perform following operations:

i. Add a new student and its Roll number (No duplicates)
ii. Remove a student from the collection
iii. Search for a student name and display the roll number.

Program Name: StudentCollection.java

import java.util.*;

public class StudentCollection {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Rahul", 101);
        students.put("Priya", 102);
        students.put("Amit", 103);

        System.out.println("Students: " + students);

        students.putIfAbsent("Sneha", 104);

        System.out.println("After adding: " + students);

        students.remove("Amit");

        System.out.println("After removing Amit: " + students);

        String name = "Priya";

        if (students.containsKey(name))
            System.out.println("Roll number of " + name + ": " + students.get(name));
        else
            System.out.println("Student not found");
    }
}
==============================================================================================
Sample Output:

Students: {Rahul=101, Priya=102, Amit=103}
After adding: {Rahul=101, Priya=102, Amit=103, Sneha=104}
After removing Amit: {Rahul=101, Priya=102, Sneha=104}
Roll number of Priya: 102
_____________________________________________________________________________________________________________________________________________________________________________________


OR
2) Write a Java program to demonstrate Synchronization Example.

Program Name: SynchronizationDemo.java

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    Table t;

    Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Thread2 extends Thread {
    Table t;

    Thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Table obj = new Table();

        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();
        t2.start();
    }
}

Sample Output:

5
10
15
20
25
10
20
30
40
50
