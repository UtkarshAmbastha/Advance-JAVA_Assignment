package com.que14;



//import javax.lang.model.element.Name;
import javax.lang.model.element.Name;
import java.util.Scanner;
import java.util.Vector;
import java.util.jar.Attributes;

public class UserName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<Name> vector = new Vector<>();

        int option;

        do {
            System.out.println("Enter Your Choice" +
                    "Press 1: Enter First Name and Last Name" +
                    "Press 2: Print the number of names" +
                    "Press 3: To exit the application");

            option = sc.nextInt();
            if (option == 1) {
                System.out.println("Enter the First Name");
                sc.next();
                System.out.println("Enter the Last Name");
                sc.next();

                vector.add(null);
            } else if (option == 2) {
                System.out.println("Total names: " + vector.size());
            }
        } while (option != 3);
        System.out.println("Application Closed");
    }
}