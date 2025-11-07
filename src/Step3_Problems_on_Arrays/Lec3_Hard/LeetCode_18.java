package Step3_Problems_on_Arrays.Lec3_Hard;

import java.util.*;

public class LeetCode_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        while(i<n-3){
            if(target<0 && nums[i]>=0) break;
            int j=i+1;
            while(j<n-2){
                int k=j+1;
                int l=n-1;
                while(k<l){
                    int n1=nums[i]+nums[j]+nums[k];
                    int n2=nums[l];
                    if(n2+n1>target)l--;
                    else{
                        if(n1+n2==target){
                            List<Integer> temp= new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            result.add(temp);
                        }
                        int cur=nums[k];
                        while(k<n && nums[k]==cur) k++;
                    }
                }
                int cur=nums[j];
                while(j<n && nums[j]==cur) j++;
            }
            int cur=nums[i];
            while(i<n && nums[i]==cur) i++;
        }
        return result;
    }
}
