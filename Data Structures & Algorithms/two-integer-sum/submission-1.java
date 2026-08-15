class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            arr.put(target-nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(arr.containsKey(nums[i])){
                int j=arr.get(nums[i]);
                if(i!=j){
                    int[] s={i,arr.get(nums[i])};
                    return s;
                }
            }
        }
        int[]x={};
        return x;
    }
}
