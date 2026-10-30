Slip 18
1) Write a Java program to find the sum of elements of an array. Also display the array elements in ascending order.

Program Name: ArraySumSort.java

import java.util.*;

public class ArraySumSort {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 4};

        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];

        System.out.println("Sum of elements: " + sum);

        Arrays.sort(a);

        System.out.println("Array in ascending order:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
===============================================
Output:

Sum of elements: 20
Array in ascending order:
1 2 4 5 8
____________________________________________________________________________________________________________________________________________________________________________________________________________
2) Write a Java Program which defines class Product with data member as id, name and price. Store the information of 5 products and Display the name of product having minimum price (Use array of object).

Program Name: ProductDemo.java

import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product[] p = new Product[5];

        p[0] = new Product(1, "Laptop", 55000);
        p[1] = new Product(2, "Mobile", 20000);
        p[2] = new Product(3, "Tablet", 15000);
        p[3] = new Product(4, "Keyboard", 1200);
        p[4] = new Product(5, "Mouse", 500);

        Product min = p[0];

        for (int i = 1; i < p.length; i++) {
            if (p[i].price < min.price)
                min = p[i];
        }

        System.out.println("Product having minimum price: " + min.name);
    }
}
====================================================================================================================
Output:

Product having minimum price: Mouse

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------  
OR
2) Write a Java program to accept ‘N’ student names through command line, store them into the appropriate Collection and display them by using Iterator and ListIterator interface.

Program Name: StudentNames.java

import java.util.*;

public class StudentNames {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        for (String name : args)
            students.add(name);

        System.out.println("Using Iterator:");
        Iterator<String> it = students.iterator();

        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("Using ListIterator:");
        ListIterator<String> lit = students.listIterator();

        while (lit.hasNext())
            System.out.println(lit.next());
    }
}
============================================================================
Sample Output (command-line arguments: Amit, Rahul, Priya):

Using Iterator:
Amit
Rahul
Priya
Using ListIterator:
Amit
Rahul
Priya
