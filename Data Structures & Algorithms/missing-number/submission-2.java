class Solution {
    public int missingNumber(int[] nums) {
        int i=nums.length;
        for(int a=0;a<nums.length;a++){
            i^=a^nums[a];
        }
        return i;
    }
}
