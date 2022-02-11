package com.que11;

public class OutPut {
    void outerMethod() {
        System.out.println("Inside outerMethod");
// Inner class is local to outerMethod()
        class Inner {
            void innerMethod() {
                System.out.println("Inside innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
class Test1 {
    public static void main(String[] args) {
        OutPut x = new OutPut();
        x.outerMethod();
    }
}

