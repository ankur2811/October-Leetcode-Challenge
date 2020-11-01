class Solution {
    public int maxDistToClosest(int[] seats) {
     int max=Integer.MIN_VALUE;
        int i=0;
        while(i<seats.length)
        {
            while(seats[i]!=1)
                i++;
            max=Math.max(max,i);
            break;
        }
        int j=seats.length-1;
             while(j>=0)
        {
            while(seats[j]!=1)
                j--;
            max=Math.max(max,seats.length-1-j);
                 break;
        }
        i++;
        int k=0;
        
        while(i<j)
        {
          while(seats[i]!=1){
              i++;
              k++;
          }
            k++;
            i++;
         max=Math.max(max,k/2);  
            k=0;
        }
        
        return max;
    }
}