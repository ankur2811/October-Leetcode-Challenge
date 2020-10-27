class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int A1=0;
        int A2=1;
        int B1=0;
        int B2=1;
        
        for(int i=1;i<A.length;i++)
        {    //A1=A0
            if(A1!=Integer.MAX_VALUE)
            {
                if(A[i]==A[0])
                    A1=A1;
                else if(B[i]==A[0])
                    A1++;
                else
                    A1=Integer.MAX_VALUE;
                
            }
            //B1=B0
            if(B1!=Integer.MAX_VALUE)
            {
                if(B[i]==B[0])
                      B1=B1;
                else if(A[i]==B[0])
                    B1++;
                else
                   B1=Integer.MAX_VALUE;
            }
            //A2=B0
            if(A2!=Integer.MAX_VALUE)
            {
                if(A[i]==B[0])
                      A2=A2;
                else if(B[i]==B[0])
                    A2++;
                else
                    A2=Integer.MAX_VALUE;
            }
            //B2=A0
             if(B2!=Integer.MAX_VALUE)
            {
                if(B[i]==A[0])
                      B2=B2;
                else if(A[i]==A[0])
                    B2++;
                else
                    B2=Integer.MAX_VALUE;
            }
        }
        int ans= Math.min(Math.min(A1,A2),Math.min(B1,B2));
        if(ans==Integer.MAX_VALUE)
            ans=-1;
        
        return ans;
    }
    
   
}