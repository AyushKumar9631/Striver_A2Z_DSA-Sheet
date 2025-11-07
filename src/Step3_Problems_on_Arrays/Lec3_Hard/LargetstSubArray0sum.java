package Step3_Problems_on_Arrays.Lec3_Hard;

import java.util.HashMap;

public class LargetstSubArray0sum {
    public int maxLen(int[] arr) {
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,-1);
        int maxLength=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum)) maxLength=Math.max(maxLength, i-map.get(sum));
            else map.put(sum, i);
        }
        return maxLength;
    }
}
