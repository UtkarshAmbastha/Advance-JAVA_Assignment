package com.que1;

import java.time.LocalTime;
import java.util.ArrayList;

public class RestrauntMenu {

    static ArrayList<Dish> menulist;

    static {

        Dish chickenLollipop = new Dish(1,"Chicken Lollipop", LocalTime.now());
        Dish chickenEggFriedRice = new Dish(2, "Chicken Egg Fried Rice", LocalTime.now());
        Dish chickenDumBiryani = new Dish(3, "Chicken Dum Biryani", LocalTime.now());
        Dish dalMakhani = new Dish(4, "Dal Makhani", LocalTime.now());
        Dish paneerButterMasala = new Dish(5, "Paneer Butter Masala", LocalTime.now());

        menulist = new ArrayList<Dish>();

        menulist.add(chickenLollipop);
        menulist.add(chickenEggFriedRice);
        menulist.add(chickenDumBiryani);
        menulist.add(dalMakhani);
        menulist.add(paneerButterMasala);
    }
}
