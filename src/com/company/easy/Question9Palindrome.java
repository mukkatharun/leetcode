package com.company.easy;

public class Question9Palindrome {
    public static boolean isPalindrome(int x) {
        boolean value = false;
        int i =0,j=0;
        int[] a = new int[10];
        if(x<0) return false;
//        if(x>=0 && x<10) value = true;
        while(x!=0)
        {
            i = x%10;
            a[j] = i;
            j++;
            x=x/10;
        }
        if(j % 2 == 0)
        {
            for (int z = 0; z < j /2; z++)
                if (a[z] != a[j - 1 - z]) return false;
            value = true;
        }
        else{
            for (int z = 0; z < j-1 /2; z++)
                if (a[z] != a[j - 1 - z]) return false;
            value = true;
        }
        return value;
    }
    public static void main(String args[]) {
        boolean value = isPalindrome(9);
        System.out.println(value);
    }
}
