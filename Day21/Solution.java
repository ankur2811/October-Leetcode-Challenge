class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int ele:asteroids)
        {
            if(st.size()==0 || ele>=0)
                st.push(ele);
            else 
            {
                while(st.size()>0 && st.peek()>0 && st.peek()<-ele)
                    st.pop();
                if(st.size()!=0 && st.peek()==-ele)
                    st.pop();
                else if(st.size()==0 || st.peek()<0)
                    st.push(ele);
            }
        }
        
        int[] ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--)
            ans[i]=st.pop();
        
        return ans;
    }
}