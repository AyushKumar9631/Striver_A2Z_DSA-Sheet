package Step3_Problems_on_Arrays.Lec2_Medium;

public class LeetCode_169 {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int vote=1;
        for(int i=1; i<nums.length; i++){
            if(vote==0){
                candidate=nums[i];
                vote++;
            }
            else if(nums[i]==candidate) vote++;
            else vote--;
        }
        return candidate;
    }
}
