package Step2_Important_Sorting_Techniques.Lec2;

import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] nums) {
        int n=nums.length;
        if(n==1) return nums;
        if(n==2){
            if(nums[0]>nums[1]){
                int temp=nums[0];
                nums[0]=nums[1];
                nums[1]=temp;
            }
            return nums;
        }

        int mid=n/2;
        int[] left= mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right= mergeSort(Arrays.copyOfRange(nums, mid, n));
        return merge(left, right);
    }

    public int[] merge(int[] left, int[] right){
        int n=left.length;
        int m=right.length;
        int[] result=new int[m+n];
        int li=0;
        int ri=0;
        int i=0;
        while(li<n && ri<m){
            if(left[li]<=right[ri]){
                result[i]=left[li++];
            }
            else{
                result[i]=right[ri++];
            }
            i++;
        }

        while(li<n){
            result[i]=left[li++];
            i++;
        }
        while(ri<m){
            result[i]=right[ri++];
            i++;
        }
        return result;
    }
}
