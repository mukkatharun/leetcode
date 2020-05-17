package com.company.easy;

public class Question189ArrayRotation {
    public static void methodOne(int[] nums,int k) {
        int temp, previous;
        while(k>0) {
            previous = nums[nums.length - 1];
            for(int i = 0; i< nums.length; i++) {
                temp = nums[i];
                nums[i] = previous;
                previous = temp;
            }
            k--;
        }
        for(int i = 0;i< nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
    public static void methodtwo(int[] nums,int k) {
        int index = 0, l = nums.length;
        int[] newArr = new int[nums.length];

        for(int i = l-k;i< l; i++) {
            newArr[index++] = nums[i];
        }
        for(int i = 0; i<l-k; i++){
            newArr[index++] = nums[i];
        }

        for(int i = 0;i< nums.length; i++) {
            System.out.print(newArr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 7; //number of rotations
        System.out.println("Second Method");
        methodtwo(arr,k);
        System.out.println("First Method");
        methodOne(arr,k);
    }
}
