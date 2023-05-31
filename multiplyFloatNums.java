package Assignment1;

import java.util.Scanner;

public class multiplyFloatNums {
    public static void main(String[] args) {
        float num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st float number");
        num1 = scan.nextFloat();
        System.out.println("Enter 2nd float number");
        num2 = scan.nextFloat();
        System.out.println("Multiplication of 2 float number entered is - "+(num1*num2));
    }
}
