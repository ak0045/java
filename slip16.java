Q.1) Write a Java program to display Fibonacci series.

Program: Fibonacci.java

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
==============================================================================
Output
Enter the number of terms: 7
Fibonacci Series:
0 1 1 2 3 5 8
_________________________________________________________________________________________________________________________________________________________________________________

Q.2) Write a program to sort HashMap by keys and display the details before sorting and after sorting.

Program: SortHashMap.java

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(5, "E");
        map.put(2, "B");
        map.put(4, "D");

        System.out.println("HashMap before sorting:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("\nHashMap after sorting by keys:");

        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
==================================================================================================================
Output
HashMap before sorting:
1 : A
2 : B
3 : C
4 : D
5 : E

HashMap after sorting by keys:
1 : A
2 : B
3 : C
4 : D
5 : E

_________________________________________________________________________________________________________________________________________________________________________________

  
OR
Q.2) Write a Java program to define an interface "Operation" which has methods area(), volume(). Define a constant PI having a value of 3.142.

Program: OperationDemo.java

interface Operation {
    double PI = 3.142;

    void area();
    void volume();
}

class Circle implements Operation {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle = " + (PI * radius * radius));
    }

    public void volume() {
        System.out.println("Volume is not applicable for a circle.");
    }
}

public class OperationDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);

        c.area();
        c.volume();
    }
}
================================
Output
Area of Circle = 78.55
Volume is not applicable for a circle.
