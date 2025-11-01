package Step1_Learn_The_Basics.Lec6;

/*
        Given an array nums of size n which may contain duplicate elements,
        return a list of pairs where each pair contains a unique element from the array and its frequency in the array.
        You may return the result in any order, but each element must appear exactly once in the output.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Count_Frequency {
    public List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int i: map.keySet()){
            List<Integer> temp=new ArrayList<>();
            temp.add(i);
            temp.add(map.get(i));
            result.add(temp);
        }

        return result;
    }
}
