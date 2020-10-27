class Solution {
    public boolean winnerSquareGame(int n) {
               Boolean[] dp=new Boolean[n+1];
               return winnerSquareGame(n,dp);
        
    }
    
    public boolean winnerSquareGame(int n,Boolean[] dp)
    {
        if(n<=0)
            return false;
        if(dp[n]!=null)
            return dp[n];
        boolean winner=false;
        for(int i=1;i*i<=n;i++)
        {
            if(!winnerSquareGame(n-i*i,dp))
            {
              winner=true;
                break;
            }
        } 
        
        return dp[n]=winner;
    }
}