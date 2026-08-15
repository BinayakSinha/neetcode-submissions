class Solution {
    public int[] twoSum(int[] num, int target) {
        int i=0;
        int j=num.length-1;
        while(i<j){
            int x=num[i]+num[j];
            if(x==target){
                return new int[]{i+1,j+1};
            }
            if(x>target){
                j--;
            }
            else if(x<target){
                i++;
            }
        }
        return new int[]{0,0};
    }
}
