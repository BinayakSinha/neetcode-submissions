class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>x=new ArrayList<>();
        x.add(new ArrayList<>());
        for(int i:nums){
            int s=x.size();
            for(int j=0;j<s;j++){
                List<Integer>subset=new ArrayList<>(x.get(j));
                subset.add(i);
                x.add(subset);
            }
        }
        return x;
    }
}
