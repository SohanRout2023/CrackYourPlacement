class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i <nums.length; i++)
        {
        int element = Math.abs(nums[i]);
        int seat = element-1;
        if(nums[seat]<0)
        {
            res.add(element);
        }
        else{
            nums[seat]= -nums[seat];
        }
    }
        return res;
    }
}
