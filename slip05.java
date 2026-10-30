Q.1) Write a Java program to display the contents of a file in reverse order.
_____________________________________________
Step 1: Create text file – vi test.txt

Hello Java
Welcome to File Handling
This is a test file
______________________________________________

Step 2: Main Program – ReverseFile.java

Code:

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReverseFile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        String content = "";

        try {
            FileReader fr = new FileReader(fileName);
            int ch;

            while ((ch = fr.read()) != -1) {
                content = content + (char) ch;
            }

            fr.close();

            System.out.println("\nFile contents in reverse order:");
            System.out.println("--------------------------------");

            for (int i = content.length() - 1; i >= 0; i--) {
                System.out.print(content.charAt(i));
            }

        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read.");
        }

        sc.close();
    }
}
==========================================
Hello Java
Welcome to File Handling
This is a test file
___________________________________________________________________________________________________________________________________________________________________________________________________________________

Q.2) Write a Java program to create base class Employee (empcode, empname). Derive the classes Manager (designation, club_dues), Scientist (deptname, publications) from Employee class. Accept the details of n employees and display the information.

-------------------------------
Program: EmployeeDemo.java
------------------------------
  
Code:

import java.util.Scanner;

class Employee {
    int empcode;
    String empname;

    Employee(int empcode, String empname) {
        this.empcode = empcode;
        this.empname = empname;
    }

    void display() {
        System.out.println("Employee Code : " + empcode);
        System.out.println("Employee Name : " + empname);
    }
}

class Manager extends Employee {
    String designation;
    double club_dues;

    Manager(int empcode, String empname, String designation, double club_dues) {
        super(empcode, empname);
        this.designation = designation;
        this.club_dues = club_dues;
    }

    void display() {
        super.display();

        System.out.println("Designation   : " + designation);
        System.out.println("Club Dues     : " + club_dues);
        System.out.println("--------------------------------");
    }
}

class Scientist extends Employee {
    String deptname;
    String publications;

    Scientist(int empcode, String empname, String deptname, String publications) {
        super(empcode, empname);
        this.deptname = deptname;
        this.publications = publications;
    }

    void display() {
        super.display();

        System.out.println("Department    : " + deptname);
        System.out.println("Publications  : " + publications);
        System.out.println("--------------------------------");
    }
}

public class EmployeeDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee employees[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.println("1. Manager");
            System.out.println("2. Scientist");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Code: ");
            int empcode = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String empname = sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Designation: ");
                String designation = sc.nextLine();

                System.out.print("Enter Club Dues: ");
                double club_dues = sc.nextDouble();
                sc.nextLine();

                employees[i] = new Manager(
                    empcode, empname, designation, club_dues
                );

            } else if (choice == 2) {
                System.out.print("Enter Department Name: ");
                String deptname = sc.nextLine();

                System.out.print("Enter Publications: ");
                String publications = sc.nextLine();

                employees[i] = new Scientist(
                    empcode, empname, deptname, publications
                );

            } else {
                System.out.println("Invalid choice.");
                i--;
            }
        }

        System.out.println("\nEmployee Information");
        System.out.println("==============================");

        for (int i = 0; i < n; i++) {
            employees[i].display();
        }

        sc.close();
    }
}


________________________________________________________________________________________________________________________________________________________________________________________________________________

OR
Q.2) Write a Java program to create an abstract class Shape with methods area & volume. Derive two classes Sphere (radius), Cylinder (radius, height) from it. Calculate area and volume of both. (Use Method Overriding).

---------------------------
Program: ShapeDemo.java
----------------------------

Code:

import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void volume();
}

class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    void area() {
        double a = 4 \* Math.PI \* radius \* radius;

        System.out.println("Area of Sphere = " + a);
    }

    void volume() {
        double v = (4.0 / 3.0) \* Math.PI \* radius \* radius \* radius;

        System.out.println("Volume of Sphere = " + v);
    }
}

class Cylinder extends Shape {
    double radius;
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    void area() {
        double a = 2 \* Math.PI \* radius \* (radius + height);

        System.out.println("Area of Cylinder = " + a);
    }

    void volume() {
        double v = Math.PI \* radius \* radius \* height;

        System.out.println("Volume of Cylinder = " + v);
    }
}

public class ShapeDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Sphere: ");
        double sphereRadius = sc.nextDouble();

        System.out.print("Enter radius of Cylinder: ");
        double cylinderRadius = sc.nextDouble();

        System.out.print("Enter height of Cylinder: ");
        double cylinderHeight = sc.nextDouble();

        Sphere sphere = new Sphere(sphereRadius);
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);

        System.out.println("\nSphere Details");
        System.out.println("----------------------");
        sphere.area();
        sphere.volume();

        System.out.println("\nCylinder Details");
        System.out.println("----------------------");
        cylinder.area();
        cylinder.volume();

        sc.close();
    }
}
======================================
OUTPUT:
Enter file name: test.txt

File contents in reverse order:
--------------------------------
elif tset a si sihT
gnildnaH eliF ot emocleW
=========================================
avaJ olleH
