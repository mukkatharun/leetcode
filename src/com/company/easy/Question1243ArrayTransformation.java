package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1243ArrayTransformation {
    public static void main(String args[]){
        int count = 1;
        int[] arr = {2,1,2,1,1,2,2,1};
        int[] arr2 = arr.clone();
        List<Integer> array = new ArrayList<Integer>();

        while(count>0)
        {
            for(int i = 1;i < arr.length - 1; i++)
            {
                if(arr[i] < arr[i - 1] && arr[i] < arr[i + 1])
                {
                    arr2[i] = arr[i] + 1;
                }
                else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                {
                    arr2[i] = arr[i] - 1;
                }
                else {
                    arr2[i] = arr[i];
                }
            }
            if(Arrays.equals(arr, arr2))
            {
                count =0;
            }
            else count = 1;
            arr = arr2.clone();
        }
        for(int i=0;i<arr.length ;i++) {
            array.add(arr2[i]);
            System.out.println(arr2[i]);
        }
    }
}
/*
class Solution {
    public List<Integer> transformArray(int[] arr) {
        int count = 1;
        int[] arr1 = new int[arr.length];
        int[] arr2 = arr.clone();
        List<Integer> array = new ArrayList<Integer>();

        if(arr.length == 1) {
            array.add(arr[0]);
        }

        else if (arr.length == 2) {
            array.add(arr[0]);
            array.add(arr[1]);
        }

        else {
            // array.add(arr[0]);

            while(count>0)
            {
                // count = 0 ;
                 // arr1[0] = arr[0];
                    for(int i = 1;i < arr.length - 1; i++)
                    {
                        if(arr[i] < arr[i - 1] && arr[i] < arr[i + 1])
                        {
                            arr[i] = arr[i] + 1;
                            // array.add(i, arr[i]);
                            // count++;
                        }
                        else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                        {
                            arr[i] = arr[i] - 1;
                            // array.add(i, arr[i]);
                            // count++;
                        }
                        else {
                            // arr[i] = arr[i];
                        }
                    }
                 // arr[arr.length - 1] = arr[arr.length - 1];
                 if(Arrays.equals(arr, arr2))
                 {
                     count =0;
                 }
                else count = 1;
                 arr2 = arr.clone();
            }

            // array.add(arr[arr.length - 1]);

        }
        for(int i=0;i<arr.length ;i++) { array.add(arr2[i]);}
        return array;
    }
}
 */
/*
class Solution {
    public List<Integer> transformArray(int[] arr) {
        int[] copy;
        List<Integer> array = new ArrayList<Integer>();
        int len = arr.length;
        do{
            copy = Arrays.copyOf(arr,len);
            for(int i = 1; i < len -1; i++) {
                if(copy[i] < copy[i-1] && copy[i] < copy[i+1])
                {
                    arr[i]++;
                }
                else if(copy[i] > copy[i-1] && copy[i] > copy[i+1]) {
                    arr[i]--;
                }
            }
        }
        while(!Arrays.equals(arr,copy));
        for(int i=0;i<len;i++)
        {
            array.add(arr[i]);
        }
        return array;
    }
}
 */
