class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(set.contains(a)){
                return true;
            }
            set.add(a);
        }
        return false;
    }
}