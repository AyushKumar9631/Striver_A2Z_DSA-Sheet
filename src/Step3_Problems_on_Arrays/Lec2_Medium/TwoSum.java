package Step3_Problems_on_Arrays.Lec2_Medium;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements=  new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(complements.containsKey(target-nums[i])) return new int[]{i, complements.get(target-nums[i])};
            complements.put(nums[i], i);
        }
        return null;
    }
}
