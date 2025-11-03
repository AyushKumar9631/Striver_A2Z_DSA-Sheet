package Step3_Problems_on_Arrays.Lec1_Easy;

public class Leetcode_268 {
    public int missingNumber(int[] nums) {
        boolean[] isin= new boolean[nums.length+1];
        for(int i=0; i<nums.length; i++){
            isin[nums[i]]=true;
        }
        for(int i=0; i< isin.length; i++){
            if(!isin[i]) return i;
        }
        return 0;
    }
}
