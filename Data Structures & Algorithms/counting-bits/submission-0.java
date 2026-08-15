class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int m=0;m<=n;m++){
            int i=m;
            int val=0;
            while(i!=0){
                val+=i&1;
                i=i>>1;
            }
            arr[m]=val;
        }
        return arr;
    }
}
