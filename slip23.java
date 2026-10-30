Slip 23
1) Write a Java program to calculate area of Cylinder and Circle. (Use super keyword).

Program Name: AreaDemo.java

class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return 3.142 * r * r;
    }
}

class Cylinder extends Circle {
    double h;

    Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    double area() {
        return 2 * 3.142 * r * (r + h);
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Cylinder cy = new Cylinder(5, 10);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Cylinder: " + cy.area());
    }
}
======================================================================
Output:

Area of Circle: 78.55
Area of Cylinder: 471.3
_________________________________________________________________________________________________________________________________________________________________________________________________

2) Write a program to sort HashMap by keys and display the details before sorting and after sorting.

Program Name: SortHashMap.java

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(5, "E");
        map.put(2, "B");
        map.put(4, "D");

        System.out.println("Before sorting: " + map);

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("After sorting: " + sortedMap);
    }
}
============================================================================================
Sample Output:

Before sorting: {1=A, 2=B, 3=C, 4=D, 5=E}
After sorting: {1=A, 2=B, 3=C, 4=D, 5=E}

टीप: HashMap मध्ये keys चा order निश्चित नसतो. त्यामुळे Before sorting चा output वेगळा असू शकतो.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


OR
2) Write a Java program to create using Runnable interface to display traffic signal.

Program Name: TrafficSignalDemo.java

class TrafficSignal implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("RED - STOP");
                Thread.sleep(2000);

                System.out.println("YELLOW - READY");
                Thread.sleep(1000);

                System.out.println("GREEN - GO");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class TrafficSignalDemo {
    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        Thread t = new Thread(signal);

        t.start();
    }
}
======================================
Sample Output:

RED - STOP
YELLOW - READY
GREEN - GO
RED - STOP
YELLOW - READY
GREEN - GO
...
