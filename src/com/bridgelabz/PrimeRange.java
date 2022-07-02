package com.bridgelabz;
import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        int lowerLimit, upperLimit;
        Scanner range = new Scanner(System.in);

        System.out.println("Enter lower limit: ");
        lowerLimit = range.nextInt();
        System.out.println("Enter upper limit : ");
        upperLimit = range.nextInt();

        PrimeRange primeRange = new PrimeRange();
        System.out.println("Prime numbers between given range are:");
        primeRange.primeRangeRec(lowerLimit, upperLimit);
    }
    public void primeRangeRec(int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            if (i == 1 || i == 0)
                continue;
            int flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}

