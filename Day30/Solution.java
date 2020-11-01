class Solution {
    public int findNumberOfLIS(int[] nums) {
     if(nums.length==0)
         return 0;
        int n=nums.length;
        int[] dp=new int[n];
        int[] count=new int[n];
        
        int max=0;
        int maxlen=0;
        
        for(int i=0;i<n;i++)
        {
            dp[i]=1;
            count[i]=1;
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]<nums[i] )
                {if(dp[i]<dp[j]+1)
                {
                    dp[i]=dp[j]+1;
                    count[i]=count[j];
                }
                else if(dp[i]==dp[j]+1)
                     count[i]+=count[j];
                }
            }
            if(dp[i]>max)
            {
                max=dp[i];
                maxlen=count[i];
            }
           else  if(dp[i]==max)
                 maxlen+=count[i];
        }
        
        return maxlen;
        
    }
}