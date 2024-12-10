class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            int l=0,h=n-1;
            while(l<=h){
                int temp=nums[l];
                nums[l]=nums[h];
                nums[h]=temp;
                l++;
                h--;
            }
            return;    
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }    
        }
        int l=ind+1,h=n-1;
        while(l<=h){
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
            h--;
        }    
    }
}
