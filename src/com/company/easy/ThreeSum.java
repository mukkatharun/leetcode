package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[]args) {
        //solution but exceeds leet code time limit
        int[] nums = {-1,-2,3,4,5};
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i< nums.length - 2 ;i++)
        {
            for(int j = i + 1; j< nums.length - 1; j++)
            {
                for(int k = j + 1;k< nums.length; k++ ) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    if(nums[i] + nums[j] + nums[k] == 0 && result.indexOf(list) == -1) {
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        System.out.println(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
    }
}

//solution but exceeds leet code time limit exceeded


// another solution but limit time exceeded again
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        for(int i = 0; i< nums.length - 2 ;i++)
//        {
//            int j = i + 1;
//            int k = nums.length - 1;
//            while(j<k){
//                int sum = nums[i] + nums[j] + nums[k];
//                if(sum < 0) {
//                    j++;
//                }
//                else if(sum > 0) {
//                    k--;
//                }
//                else {
//                    List<Integer> list = new ArrayList<Integer>();
//                    list.add(nums[i]);
//                    list.add(nums[j]);
//                    list.add(nums[k]);
//                    if(nums[i] + nums[j] + nums[k] == 0 && result.indexOf(list) == -1) {
//                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                    }
//                    j++;
//                }
//            }
//        }
//        return result;
//    }
//}
