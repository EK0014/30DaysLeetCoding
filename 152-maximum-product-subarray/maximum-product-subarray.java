class Solution {
    public int maxProduct(int[] nums) {
        int maxi = -999;
        int prod=1;

        for(int i=0;i<nums.length;i++)
        {
          prod*=nums[i];
          if(prod>maxi){
            maxi=prod;
          }
          if(prod==0){
            prod=1;
          }
           
        }
        prod=1;
        for(int i=nums.length - 1;i>=0;i--)
        {
          prod*=nums[i];
          if(maxi<prod){
            maxi=prod;
          }
          if(prod==0){
            prod=1;}
           
        }
        return maxi;
    }
    }