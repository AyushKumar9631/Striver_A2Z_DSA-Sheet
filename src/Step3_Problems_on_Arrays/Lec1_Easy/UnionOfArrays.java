package Step3_Problems_on_Arrays.Lec1_Easy;

import java.util.ArrayList;

public class UnionOfArrays {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> list= new ArrayList<>();
        int n1= nums1.length;
        int n2=nums2.length;
        int i1=0;
        int i2=0;
        while(i1<n1 && i2<n2){
            int cur=Math.min(nums1[i1], nums2[i2]);
            list.add(cur);
            while(i1<n1 && nums1[i1]<=cur) i1++;
            while(i2<n2 && nums2[i2]<=cur) i2++;
        }

        while(i1<n1){
            int cur=nums1[i1];
            list.add(cur);
            while(i1<n1 && nums1[i1]<=cur) i1++;
        }

        while(i2<n2){
            int cur=nums2[i2];
            list.add(cur);
            while(i2<n2 && nums2[i2]<=cur) i2++;
        }

        int[] ans=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
