package Assignment1;

import java.util.Scanner;

public class SwapTwoNumUsingThirdVar {

    public static void main(String[] args) {
        int num1, num2, temp;
        Scanner scan = new Scanner((System.in));
        System.out.println("Please input 1st Number");
        num1 = scan.nextInt();
        System.out.println("Please input 2nd Number");
        num2 = scan.nextInt();
        temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("1st variable swapped value is - "+num1);
        System.out.println("2nd variable swapped value is - "+num2);
    }
}
