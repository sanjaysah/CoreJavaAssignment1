package Assignment1;

import java.util.Scanner;

public class InputANumberPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Please input a Number");
        int num = scan.nextInt();
        System.out.println("Input number entered is - "+num);
    }
}
