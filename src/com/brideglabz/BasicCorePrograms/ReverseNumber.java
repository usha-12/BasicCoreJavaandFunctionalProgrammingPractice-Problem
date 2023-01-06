package com.brideglabz.BasicCorePrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
       int  reversed = 0;
        System.out.println("-----welcome to the reverse number program-------");
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("original number is ="+number);
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number is ="+reversed);

    }
}
