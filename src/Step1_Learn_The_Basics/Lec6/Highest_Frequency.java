package Step1_Learn_The_Basics.Lec6;

/*
        Given an array nums of n integers, find the most frequent element in it
        i.e., the element that occurs the maximum number of times.
        If there are multiple elements that appear a maximum number of times, find the smallest of them.
 */

import java.util.HashMap;

public class Highest_Frequency {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int result=-1;
        int maxf=Integer.MIN_VALUE;
        for(int i: map.keySet()){
            if(map.get(i)>maxf || (map.get(i)==maxf && result>i)){
                result=i;
                maxf=map.get(i);
            }
        }

        return result;
    }
}
