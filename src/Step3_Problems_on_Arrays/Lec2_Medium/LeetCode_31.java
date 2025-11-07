package Step3_Problems_on_Arrays.Lec2_Medium;

public class LeetCode_31 {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int a=-1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                a=i;
                break;
            }
        }
        if(a==-1){
            reverse(nums, 0, n-1);
            return;
        }

        int b=findLargest(nums, a+1, n-1, nums[a]);
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;

        reverse(nums, a+1, n-1);
    }

    public int findLargest(int[] nums, int s, int e, int target){
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]<=target) e=mid-1;
            else s=mid+1;
        }
        return e;
    }

    public void reverse(int[] nums, int s, int e){
        while(s<e){
            int temp=nums[s];
            nums[s++]=nums[e];
            nums[e--]=temp;
        }
    }
}
