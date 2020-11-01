class Solution {
    
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0)
            return new ArrayList<>();
        List<String> ans=new ArrayList<>();
        int i=nums[0],j=nums[0]-1;
        for(int ele:nums)
        {
            if(ele==j+1)
                j++;
            else
            {
                if(i==j)
                    ans.add(""+i);
                else
                ans.add(i+"->"+j);
                i=ele;
                j=ele;
            }
            
        }
      if(i==j)
       ans.add(""+i);
      else
       ans.add(i+"->"+j);
        return ans;
    }
}