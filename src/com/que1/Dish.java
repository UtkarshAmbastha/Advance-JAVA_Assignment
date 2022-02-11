package com.que1;

import java.time.LocalTime;

public class Dish {
    int dishID;
    String dishName;
    LocalTime creationTime;

    Dish(int dishID, String dishName, LocalTime creationTime) {

        this.dishID = dishID;
        this.dishName = dishName;
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishID=" + dishID +
                ", dishName='" + dishName + '\'' +
                ", creationTime=" + creationTime +
                '}';
    }
}
