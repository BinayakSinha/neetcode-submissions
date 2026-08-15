class Solution {
    public int reverseBits(int n) {
        int out=0;
        for(int i=0;i<32;i++){
            int x=(n>>i)&1;
            out+=x<<(31-i);
        }
        return out;
    }
}
