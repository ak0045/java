Q.1) Write a Java program to reverse a number. Accept the number using command line arguments.

Program: ReverseNumber.java

public class ReverseNumber {
    public static void main(String[] args) {
        int number;
        int reverse = 0;
        int remainder;

        if (args.length == 0) {
            System.out.println("Please enter a number using command line argument");
            return;
        }

        number = Integer.parseInt(args[0]);

        System.out.println("Original Number = " + number);

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reversed Number = " + reverse);
    }
}
==========================================
Output
Original Number = 12345
Reversed Number = 54321

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Q.2) Create a class Circle (member – radius), Cylinder (members – radius, height) which implements this interface. Calculate and display the area and volume.

Program: ShapeDemo.java

import java.util.Scanner;

interface Shape {
    void calculate();
    void display();
}

class Circle implements Shape {
    double radius;
    double area;

    Circle() {
        radius = 0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public void calculate() {
        area = 3.14 * radius * radius;
    }

    public void display() {
        System.out.println("Radius of Circle = " + radius);
        System.out.println("Area of Circle = " + area);
    }
}

class Cylinder implements Shape {
    double radius;
    double height;
    double area;
    double volume;

    Cylinder() {
        radius = 0;
        height = 0;
    }

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void calculate() {
        area = 2 * 3.14 * radius * (radius + height);
        volume = 3.14 * radius * radius * height;
    }

    public void display() {
        System.out.println("Radius of Cylinder = " + radius);
        System.out.println("Height of Cylinder = " + height);
        System.out.println("Area of Cylinder = " + area);
        System.out.println("Volume of Cylinder = " + volume);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r1 = sc.nextDouble();

        Circle c = new Circle(r1);
        c.calculate();
        c.display();

        System.out.print("Enter radius of cylinder: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter height of cylinder: ");
        double h = sc.nextDouble();

        Cylinder cy = new Cylinder(r2, h);
        cy.calculate();
        cy.display();
    }
}
===========================================
Output
Enter radius of circle: 5
Radius of Circle = 5.0
Area of Circle = 78.5
Enter radius of cylinder: 5
Enter height of cylinder: 10
Radius of Cylinder = 5.0
Height of Cylinder = 10.0
Area of Cylinder = 471.0
Volume of Cylinder = 785.0

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
OR
Q.2) Write a Java program using Runnable interface to display traffic signal.

Program: TrafficDemo.java

class TrafficSignal implements Runnable {
    public void run() {
        try {
            System.out.println("Traffic Signal");

            System.out.println("RED - STOP");
            Thread.sleep(2000);

            System.out.println("YELLOW - READY");
            Thread.sleep(2000);

            System.out.println("GREEN - GO");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class TrafficDemo {
    public static void main(String[] args) {
        TrafficSignal t = new TrafficSignal();

        Thread th = new Thread(t);
        th.start();
    }
}
===================================================
Output
Traffic Signal
RED - STOP
YELLOW - READY
GREEN - GO
