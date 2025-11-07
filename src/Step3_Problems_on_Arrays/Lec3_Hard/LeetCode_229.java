package Step3_Problems_on_Arrays.Lec3_Hard;

import java.util.*;

public class LeetCode_229 {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int can1=0;
        int can2=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==can1) c1++;
            else if(nums[i]==can2) c2++;
            else if(c1==0){
                can1=nums[i];
                c1=1;
            }
            else if(c2==0){
                can2=nums[i];
                c2=1;
            }

            else{
                c1--;
                c2--;
            }
        }

        int n= nums.length;
        c1=0;
        c2=0;
        for(int i: nums){
            if(i==can1) c1++;
            else if(i==can2) c2++;
        }
        List<Integer> result= new ArrayList<>();
        int limit=n/3;
        if(c1>limit) result.add(can1);
        if(c2>limit) result.add(can2);
        return result;
    }
}
