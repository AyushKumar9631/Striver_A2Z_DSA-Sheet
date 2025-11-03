package Step3_Problems_on_Arrays.Lec1_Easy;

public class LeetCode_136 {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i: nums) result=(result^i);
        return result;
    }
}
