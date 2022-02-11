package com.que9.P;


import com.que9.P1.TwoDim;
import com.que9.P2.ThreeDim;

public class MAIN {
    public static void main(String[] args) {
        TwoDim reference;
        System.out.println(reference = new TwoDim(2,4));
        System.out.println(reference = new ThreeDim(3,9,12));
    }
}
