package Assignment1;

import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Please input a Number");
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println("Entered number is Even");
        }
        else{
            System.out.println("Entered number is Odd");
        }

    }
}
