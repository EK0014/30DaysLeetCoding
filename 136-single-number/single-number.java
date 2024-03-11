class Solution {
    public int singleNumber(int[] nums) {
        int temp =0; 
        for(int i=0; i<nums.length; i++){
            temp = nums[i];
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(temp==nums[j]){
                    count++;
                }
            }
            if(count==1){
                    return temp;
            }
        }
        return -1;
    }
}