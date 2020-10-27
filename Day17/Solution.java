class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> hs=new HashSet<>();
        HashSet<String> ans=new HashSet<>();
        for(int i=0;i<s.length()-9;i++)
        {
            String st=s.substring(i,i+10);
            if(hs.contains(st))
            {
                ans.add(st);
            }
            hs.add(st);
        }
        
        return new ArrayList<>(ans);
    }
}