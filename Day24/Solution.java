class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        if(tokens.length==0)
            return 0;
        if(P<tokens[0])
            return 0;
        int score=0;
        int maxs=0;
      int i=0,j=tokens.length-1;
        while(i<=j)
        {
            if(P-tokens[i]>=0)
            {
                score++;
                maxs=Math.max(maxs,score);
                P-=tokens[i];
                i++;

            }
            else if(score>0)
            {
                score--;
                P+=tokens[j];
                j--;
            }
            else
                break;
        }
        
        return maxs;
    }
}