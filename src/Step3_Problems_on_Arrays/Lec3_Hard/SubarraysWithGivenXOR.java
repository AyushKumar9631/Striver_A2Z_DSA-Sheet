package Step3_Problems_on_Arrays.Lec3_Hard;

import java.util.HashMap;

public class SubarraysWithGivenXOR {
    public int subarraysWithXorK(int[] nums, int k) {
        HashMap<Integer, Integer> map =new HashMap<>();
        int count=0;
        map.put(0, 1);
        int cur=0;
        for(int i=0; i<nums.length; i++){
            cur=cur^nums[i];
            int p=cur^k;
            if(map.containsKey(p)) count+=map.get(p);
            map.put(cur, map.getOrDefault(cur, 0)+1);
        }
        return count;
    }
}
