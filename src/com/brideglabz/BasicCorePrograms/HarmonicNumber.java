package com.brideglabz.basiccoreprograms;

import java.util.Scanner;
public class HarmonicNumber {
    public static void checkHarmonicNumber(){
        double harmonic = 0.0;
        System.out.println("Enter the Nth number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0)
            System.out.println();
        else {
            for (int i = 1; i <= number; i++){
                harmonic = harmonic+(1/(double)i);
                System.out.println("Harmonic Number :"+harmonic);
            }
            System.out.println(number+"Harmonic value = ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program of Harmonic Number ");
        checkHarmonicNumber();
    }
}

/*              Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.*/
