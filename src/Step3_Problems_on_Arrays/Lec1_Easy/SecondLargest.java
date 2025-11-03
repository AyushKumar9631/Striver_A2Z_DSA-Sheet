package Step3_Problems_on_Arrays.Lec1_Easy;

/*
        Given an array of integers nums, return the second-largest element in the array.
         If the second-largest element does not exist, return -1.
 */

public class SecondLargest {
    public int secondLargestElement(int[] nums) {
        int n= nums.length;
        if(n==1) return -1;
        int max=nums[0];
        int smax=Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(nums[i]!=max){
                if(nums[i]>max){
                    smax=max;
                    max=nums[i];
                }
                else if(nums[i]>smax){
                    smax=nums[i];
                }
            }
        }
        return (smax==Integer.MIN_VALUE)? -1: smax;
    }
}
