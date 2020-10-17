class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        if(n==2)
            return Math.max(nums[0],nums[1]);
        if(n==3)
            return Math.max(nums[0],Math.max(nums[1],nums[2]));
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
         Arrays.fill(dp2,-1);
        
       return Math.max(rob(0,nums,n-2,dp1),rob(1,nums,n-1,dp2));
    }
    
    public int rob(int idx,int[] nums, int n,int[] dp)
    {
        if(n<idx)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        
        return dp[n]=Math.max(rob(idx,nums,n-1,dp),rob(idx,nums,n-2,dp)+nums[n]);
    }
}