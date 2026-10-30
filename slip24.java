Slip 24
1) Write a Java program to accept n names of cities from user and display them in descending order.

Program Name: CityNames.java

import java.util.*;

public class CityNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] cities = new String[n];

        for (int i = 0; i < n; i++)
            cities[i] = sc.nextLine();

        Arrays.sort(cities, Collections.reverseOrder());

        System.out.println("Cities in descending order:");

        for (String city : cities)
            System.out.println(city);
    }
}
=================================================
Output:

Enter number of cities: 4
Pune
Mumbai
Delhi
Nashik
Cities in descending order:
Pune
Nashik
Mumbai
Delhi
______________________________________________________________________________________________________________________________________________________________________________________________________________________

  
2) Create an abstract class Shape with methods area & volume. Derive two classes Sphere (radius), Cylinder (radius, height) from it. Calculate area and volume of both. (Use Method Overriding).

Program Name: ShapeDemo.java

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
        System.out.println("Area of Sphere: " + (4 * 3.142 * radius * radius));
    }

    void volume() {
        System.out.println("Volume of Sphere: " + (4.0 / 3.0 * 3.142 * radius * radius * radius));
    }
}

class Cylinder extends Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    void area() {
        System.out.println("Area of Cylinder: " + (2 * 3.142 * radius * (radius + height)));
    }

    void volume() {
        System.out.println("Volume of Cylinder: " + (3.142 * radius * radius * height));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s = new Sphere(5);
        Shape c = new Cylinder(5, 10);

        s.area();
        s.volume();

        c.area();
        c.volume();
    }
}
====================================================================
Output:

Area of Sphere: 314.2
Volume of Sphere: 523.6666666666666
Area of Cylinder: 471.3
Volume of Cylinder: 785.5
_____________________________________________________________________________________________________________________________________________________________________________________________________________

  
OR
2) Write a Java program to accept ‘N’ student names through command line, store them into the appropriate Collection and display them by using Iterator and ListIterator interface.

Program Name: StudentNames.java

import java.util.*;

public class StudentNames {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (String name : args)
            list.add(name);

        System.out.println("Using Iterator:");

        Iterator<String> i = list.iterator();

        while (i.hasNext())
            System.out.println(i.next());

        System.out.println("Using ListIterator:");

        ListIterator<String> li = list.listIterator();

        while (li.hasNext())
            System.out.println(li.next());
    }
}
=================================================================================
Sample Output (command-line arguments: Amit, Rahul, Priya):

Using Iterator:
Amit
Rahul
Priya
Using ListIterator:
Amit
Rahul
Priya
