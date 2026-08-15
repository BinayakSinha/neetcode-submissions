class Solution {
    public int rob(int[] nums) {
        int[]arr=nums;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=2;i<nums.length;i++){
            int val=0;
            for(int j=0;j<i-1;j++){
                val=Math.max(arr[j],val);
            }
            arr[i]+=val;
        }
        return Math.max(arr[arr.length-1],arr[arr.length-2]);
    }
}
