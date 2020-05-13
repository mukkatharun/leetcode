package com.company.easy;

import java.util.Scanner;

public class ReverseInteger32Bit {
    public static int reverse(int num)
    {
        int reversedInteger = 0, b = 0;
        while(num != 0)
        {
            b = b * 10 + num%10;

            if((b-num%10)/10 != reversedInteger) return 0;
            else reversedInteger = b;
            num = num/10;

        }
        return reversedInteger;
    }
    public static void main(String[] args) {
        // write your code here

        System.out.println("Reverse an Interger 32 Bit");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt(); // take input
        scan.close();

        int reverseNumber = reverse(num);

        System.out.println(reverseNumber);
    }
}
