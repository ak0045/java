Q.1) Write a Java program to check whether a given number is Positive or Negative.
----------------------------------
Program: PositiveNegative.java
---------------------------------
Code:

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is Positive.");
        } else if (num < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}

_________________________________________________________________________________________________________________________________________________________________________________________________________
Q.2) Write a Java program to define a class CricketPlayer(name, no_of_innings, no_of_times_notout, total_runs, bat_avg). Create an array of “n” player objects. Calculate the batting average for each player using a static method avg(). Handle appropriate exception while calculating average. Define static method “sortPlayer” which sort the array on the basis of average. Display the player details in sorted order.

----------------------------------
Program: CricketPlayerDemo.java
----------------------------------
  
Code:

import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    double bat_avg;

    CricketPlayer(String name, int no_of_innings,
                  int no_of_times_notout, int total_runs) {

        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.total_runs = total_runs;
        this.bat_avg = 0;
    }

    static double avg(CricketPlayer p) {
        int outs = p.no_of_innings - p.no_of_times_notout;

        if (outs <= 0) {
            throw new ArithmeticException("Cannot calculate average");
        }

        return (double) p.total_runs / outs;
    }

    static void sortPlayer(CricketPlayer players[]) {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = i + 1; j < players.length; j++) {

                if (players[i].bat_avg > players[j].bat_avg) {
                    CricketPlayer temp = players[i];
                    players[i] = players[j];
                    players[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("Name              : " + name);
        System.out.println("No. of Innings    : " + no_of_innings);
        System.out.println("Not Out           : " + no_of_times_notout);
        System.out.println("Total Runs        : " + total_runs);
        System.out.println("Batting Average   : " + bat_avg);
        System.out.println("----------------------------------------");
    }
}

public class CricketPlayerDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        CricketPlayer players[] = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Player " + (i + 1));

            System.out.print("Enter Player Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Number of Innings: ");
            int innings = sc.nextInt();

            System.out.print("Enter Number of Times Not Out: ");
            int notout = sc.nextInt();

            System.out.print("Enter Total Runs: ");
            int runs = sc.nextInt();
            sc.nextLine();

            players[i] = new CricketPlayer(name, innings, notout, runs);

            try {
                players[i].bat_avg = CricketPlayer.avg(players[i]);
            } catch (ArithmeticException e) {
                players[i].bat_avg = 0;
                System.out.println("Exception: " + e.getMessage());
            }
        }

        CricketPlayer.sortPlayer(players);

        System.out.println("\nPlayers Sorted According to Batting Average");
        System.out.println("============================================");

        for (int i = 0; i < n; i++) {
            players[i].display();
        }

        sc.close();
    }
}

______________________________________________________________________________________________________________________________________________________________________________________________________

OR
Q.2) Write a package for String operation which has two classes Con and Comp. Con class concatenates two strings, and Comp class compares two strings. Also display proper message on execution.

Step 1: Create folders
mkdir JavaProject
cd JavaProject
mkdir StringOperation

Step 2: Create Con.java

File: StringOperation/Con.java

package stringoperation;

public class Con {
    public void concatenate(String str1, String str2) {
        String result = str1 + str2;

        System.out.println("Concatenated String: " + result);
    }
}
Step 3: Create Comp.java

File: StringOperation/Comp.java

package stringoperation;

public class Comp {
    public void compare(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
    }
}

Step 4: Main Program

File: StringOperationDemo.java

import java.util.Scanner;
import stringoperation.Con;
import stringoperation.Comp;

public class StringOperationDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        Con con = new Con();
        Comp comp = new Comp();

        System.out.println("\nString Operations:");
        System.out.println("--------------------------");

        con.concatenate(str1, str2);
        comp.compare(str1, str2);

        sc.close();
    }
}
