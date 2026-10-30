Slip 20
1) Write a Java program to accept a number using the BufferedReader class and generate the multiplication table of the given number.

Program Name: MultiplicationTable.java

import java.io.*;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
}
=======================================
Output:

Enter a number: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
___________________________________________________________________________________________________________________________________________________________________________________________________________

2) Write a Java program to show Multiple Threads Execution.

Program Name: MultipleThreads.java

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Thread 1: " + i);
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Thread 2: " + i);
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Thread 3: " + i);
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}
=================================================
Sample Output:

Thread 1: 1
Thread 1: 2
Thread 2: 1
Thread 2: 2
Thread 3: 1
Thread 3: 2
Thread 1: 3
Thread 2: 3
Thread 3: 3
Thread 1: 4
Thread 2: 4
Thread 3: 4
Thread 1: 5
Thread 2: 5
Thread 3: 5

__________________________________________________________________________________________________________________________________________________
OR
2) Write a Java program to store city names and their STD codes using an appropriate collection and perform following operations:

i. Add a new city and its code (No duplicates)
ii. Remove a city from the collection
iii. Search for a city name and display the code.

Program Name: CityCode.java

import java.util.*;

public class CityCode {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Pune", 20);
        map.put("Mumbai", 22);
        map.put("Delhi", 11);

        System.out.println("City and STD Code: " + map);

        if (!map.containsKey("Nagpur"))
            map.put("Nagpur", 712);

        System.out.println("After adding: " + map);

        map.remove("Delhi");

        System.out.println("After removing: " + map);

        String city = "Pune";

        if (map.containsKey(city))
            System.out.println("STD Code: " + map.get(city));
        else
            System.out.println("City not found");
    }
}
==================================================================================
Output:

City and STD Code: {Delhi=11, Mumbai=22, Pune=20}
After adding: {Delhi=11, Mumbai=22, Nagpur=712, Pune=20}
After removing: {Mumbai=22, Nagpur=712, Pune=20}
STD Code: 20
