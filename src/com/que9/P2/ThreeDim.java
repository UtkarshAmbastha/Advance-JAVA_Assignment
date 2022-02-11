package com.que9.P2;

import com.que9.P1.TwoDim;

public class ThreeDim extends TwoDim{
    private int z;
    public ThreeDim () {
        super();
    }

    public ThreeDim (int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "ThreeDim{" +
                "z=" + z +
                '}';
    }
}
