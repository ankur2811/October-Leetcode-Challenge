class Solution {
    Integer[][][] dp;
    public int maxProfit(int k, int[] prices) {
        if(k>=prices.length/2)
        {
            int profit=0;
            for(int i=1;i<prices.length;i++)
            {
                if(prices[i]>prices[i-1])
                    profit+=prices[i]-prices[i-1];
            }
            return profit;
        }
        dp=new Integer[prices.length+1][k+1][2];
        return helper(prices,0,1,0,k);
    }
    
    public int helper(int[] prices,int idx,int buy,int txn,int k)
    {
        if(idx>=prices.length || txn>=k)
            return 0;
        if(dp[idx][txn][buy]!=null)
            return dp[idx][txn][buy];
        if(buy==1)
            return dp[idx][txn][buy]=Math.max(-prices[idx]+helper(prices,idx+1,0,txn,k),helper(prices,idx+1,buy,txn,k));
        else
            return dp[idx][txn][buy]=Math.max(prices[idx]+helper(prices,idx+1,1,txn+1,k),helper(prices,idx+1,buy,txn,k));
        
    }
}