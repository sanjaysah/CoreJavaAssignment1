package Assignment1;

import java.util.Scanner;

public class Input2NumberAddPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Please input two Numbers to add");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Addition of entered numbers are - "+(num1+num2));
    }
}
