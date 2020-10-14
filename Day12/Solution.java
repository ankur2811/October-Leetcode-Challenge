class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length())
            return false;
        
        if(A.equals(B))
        {
            HashSet<Character> hs=new HashSet<>();
            for(int i=0;i<A.length();i++)
            {
                char ch=A.charAt(i);
                if(hs.contains(ch))
                    return true;
                hs.add(ch);
            }
            return false;
        }
        int count=0;
        int[] arr=new int[3];
        int k=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)!=B.charAt(i))
            {
                count++;
                arr[k++]=i;
            }
            if(count>2)
                return false;
        }
        
        if((A.charAt(arr[0])==B.charAt(arr[1])) &&( A.charAt(arr[1])==B.charAt(arr[0])))
            return true;
        
        return false;
    }
}