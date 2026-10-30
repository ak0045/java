1)Write a Java program to find addition of Two Numbers using Command Line Arguments.
  
class Addition {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        System.out.println("Addition of two numbers = " + sum);
    }
}
_________________________________________________________________________________________________________________________________________________________________________________________________________________
  
2) Write a Java program to define a class Book with data members bookId, bookName, and price. Store details of 5 books using an array of objects and display it. 

import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double price;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Book Price: ");
        price = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Price     : Rs. " + price);
        System.out.println("--------------------------------");
    }
}

public class BookDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Book books[] = new Book[5];

        System.out.println("Enter details of 5 books:");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            books[i] = new Book();
            books[i].acceptDetails(sc);
        }

        System.out.println("\nDetails of all books:");
        System.out.println("--------------------------------");

        for (int i = 0; i < 5; i++) {
            books[i].displayDetails();
        }

        sc.close();
    }
}
____________________________________________________________________________________________________________________________________________________________________________________________________________

2) Write a java program to define a class person(pid, pname, age, gender). Define default and parameterized constructor. Overload the constructor. Accept the 5 person details and display it.
  (use this keyword). 

import java.util.Scanner;

class Person {
    int pid;
    String pname;
    int age;
    String gender;

    Person() {
        this.pid = 0;
        this.pname = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println("Person ID : " + pid);
        System.out.println("Name      : " + pname);
        System.out.println("Age       : " + age);
        System.out.println("Gender    : " + gender);
        System.out.println("-----------------------------");
    }
}

public class PersonDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Person persons[] = new Person[5];

        System.out.println("Enter details of 5 persons:");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter Person ID: ");
            int pid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Person Name: ");
            String pname = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            persons[i] = new Person(pid, pname, age, gender);
        }

        System.out.println("\nDetails of 5 Persons:");
        System.out.println("=============================");

        for (int i = 0; i < 5; i++) {
            persons[i].display();
        }

        sc.close();
    }
}
