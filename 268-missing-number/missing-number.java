class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       int prevnum = 0;
       for(int i=1; i<n; i++){
        if(nums[0]!=0){
            prevnum = 0;
            return prevnum;
        }
        prevnum = nums[i]-1; 
        if(nums[i-1]!=prevnum){
            return prevnum;
        }
       }
       if(nums[n-1]!=n){
        prevnum = n;
        return prevnum;
       }
       return prevnum;
    }
}