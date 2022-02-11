package com.que8;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int div = 100 / 0;
            System.out.println("Result = " + div);
        }
        catch (NullPointerException e) {
            System.out.println("Exception Message " +e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception :: Divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds :: Access index is out of bound");
        }
        catch (Exception e) {
            System.out.println("Exception :: " + e.getMessage());
        }

        finally {
            System.out.println("No exception found :: finally block executed successfully");
        }
    }
}
