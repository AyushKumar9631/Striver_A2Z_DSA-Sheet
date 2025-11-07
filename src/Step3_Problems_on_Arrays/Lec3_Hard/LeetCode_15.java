package Step3_Problems_on_Arrays.Lec3_Hard;

import java.util.*;

public class LeetCode_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        int i=0;
        while(i<n){
            if(nums[i]>0) break;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int n1=nums[i]+nums[j];
                int n2=nums[k];
                if(n2+n1>0) k--;
                else{
                    if(n2+n1==0){
                        List<Integer> temp= new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        result.add(temp);
                    }
                    int cur=nums[j];
                    while(j<n && nums[j]==cur) j++;
                }
            }
            int cur=nums[i];
            while(i<n && nums[i]==cur) i++;
        }
        return result;
    }
}
