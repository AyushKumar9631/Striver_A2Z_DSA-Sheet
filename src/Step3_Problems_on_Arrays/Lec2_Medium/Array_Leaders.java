package Step3_Problems_on_Arrays.Lec2_Medium;

import java.util.*;

public class Array_Leaders {
    public List<Integer> leaders(int[] nums) {
        List<Integer> list= new ArrayList<>();
        int n=nums.length;
        list.add(nums[n-1]);
        int max= nums[n-1];
        for(int i=n-2; i>=0; i--){
            if(nums[i]>max){
                list.addFirst(nums[i]);
                max=nums[i];
            }
        }
        return list;
    }
}
