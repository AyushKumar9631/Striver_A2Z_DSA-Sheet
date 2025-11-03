package Step3_Problems_on_Arrays.Lec1_Easy;

/*
        Given an array of integers nums, return the value of the largest element in the array
 */

public class LargestElement {
    public int largestElement(int[] nums) {
        int result=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>result) result=nums[i];
        }
        return result;
    }
}
