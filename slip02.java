Q.1) Write a Java program to accept n names of cities from user and display them in descending order.
----------------------
program: CityNames
---------------------

import java.util.Scanner;

public class CityNames {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        String cities[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            cities[i] = sc.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cities[i].compareToIgnoreCase(cities[j]) < 0) {
                    String temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }

        System.out.println("\nCities in Descending Order:");

        for (int i = 0; i < n; i++) {
            System.out.println(cities[i]);
        }

        sc.close();
    }
}
_____________________________________________________________________________________________________________________________________________________________________________________________________

Q.2) Write a Java program to derive a class Square from class Rectangle. Create one more class Circle. Create an interface with only one method called area(). Implement this interface in all classes. Include appropriate data members and constructors in all classes. Write a Java program to accept details of Square, Circle & Rectangle and display the area.
-------------------------
Program: ShapeArea.java
-------------------------
import java.util.Scanner;

interface Area {
    void area();
}

class Rectangle implements Area {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Square extends Rectangle implements Area {
    Square(double side) {
        super(side, side);
    }

    public void area() {
        System.out.println("Area of Square = " + (length * length));
    }
}

class Circle implements Area {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle = " + (Math.PI * radius * radius));
    }
}

public class ShapeArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of Rectangle: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter side of Square: ");
        double side = sc.nextDouble();

        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();

        Rectangle rectangle = new Rectangle(length, breadth);
        Square square = new Square(side);
        Circle circle = new Circle(radius);

        System.out.println("\nAreas of Shapes:");
        System.out.println("-------------------------");

        rectangle.area();
        square.area();
        circle.area();

        sc.close();
    }
}
_____________________________________________________________________________________________________________________________________________________________________________________________________________

OR
Q.2) Write a Java program to create a Hash table containing Employee name and Salary. Display the details of the hash table. Also search for a specific Employee and display Salary of that Employee.

------------------------------------
Program: EmployeeHashTable.java
------------------------------------
import java.util.Hashtable;
import java.util.Scanner;

public class EmployeeHashTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Hashtable<String, Double> employees =
            new Hashtable<String, Double>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees.put(name, salary);
        }

        System.out.println("\nEmployee Details:");
        System.out.println("----------------------------");

        for (String name : employees.keySet()) {
            System.out.println("Employee Name : " + name);
            System.out.println("Salary        : " + employees.get(name));
            System.out.println("----------------------------");
        }

        System.out.print("\nEnter Employee Name to Search: ");
        String searchName = sc.nextLine();

        if (employees.containsKey(searchName)) {
            System.out.println("Employee Name : " + searchName);
            System.out.println("Salary        : " + employees.get(searchName));
        } else {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}
