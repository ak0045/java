1) Define an Interface “Integer” with a abstract method check(). Write a Java program to check whether a given number is Positive or Negative.

Program Name: PositiveNegative.java

interface Integer {
    void check();
}

class NumberCheck implements Integer {
    int num;

    NumberCheck(int num) {
        this.num = num;
    }

    public void check() {
        if (num > 0)
            System.out.println(num + " is Positive");
        else if (num < 0)
            System.out.println(num + " is Negative");
        else
            System.out.println(num + " is Zero");
    }
}

public class PositiveNegative {
    public static void main(String[] args) {
        NumberCheck n = new NumberCheck(-10);
        n.check();
    }
}
==============================================================================
Output:

-10 is Negative
_____________________________________________________________________________________________________________________________________________________________________________________________________________


2) Write a java program to demonstrate Synchronization Example.

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
===========================================================
Output:

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

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

OR
2) Write a program to create link list of integer objects. Do the following:

i. Add element at first position.
ii. Delete last element.
iii. Display the size of link list.

Program Name: LinkedListDemo.java

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original LinkedList: " + list);

        list.addFirst(5);

        System.out.println("After adding at first position: " + list);

        list.removeLast();

        System.out.println("After deleting last element: " + list);

        System.out.println("Size of LinkedList: " + list.size());
    }
}
=======================================================================
Output:

Original LinkedList: [10, 20, 30, 40]
After adding at first position: [5, 10, 20, 30, 40]
After deleting last element: [5, 10, 20, 30]
Size of LinkedList: 4
