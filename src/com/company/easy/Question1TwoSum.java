package com.company.easy;

import java.util.Scanner;

public class Question1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for(int i=0; i< nums.length; i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if (target == (nums[i] + nums[j]))
                {
                    a[0] = i; a[1] = j;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();
        }
        System.out.println("enter target value");
        int target = s.nextInt();
        s.close();
        twoSum(arr,target);
    }
}
