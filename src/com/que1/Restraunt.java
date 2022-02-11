package com.que1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Restraunt {
//    private static Object dish;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        ArrayList<Dish> dishes = RestrauntMenu.menulist;

        do {
            System.out.println("*********** Ginni's Dinin************" + "" +
                    "\nPress 1 to display Dishes." +
                    "\nPress 2 to search Dish" + "" +
                    "\nPress 0 to Exit");

            option = sc.nextInt();
            if (option == 1) {
               dishes.forEach((Dish dish ) -> System.out.println(dishes));

            } else if (option == 2) {
                int id = sc.nextInt();

                if (id < 1 || id > dishes.size()) {
                    System.out.println("This dish is not available");
                } else {
                    for (int i = 0; i < dishes.size(); i++){
                        if (dishes.get(i).dishID == id) {

                            System.out.println("Dish found....");
                            System.out.println(dishes.get(i));
                        }
                    }
                }
            }
        } while (option != 0);
    }
}
