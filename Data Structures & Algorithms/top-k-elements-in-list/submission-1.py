class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        m=[]
        n=[]
        x=dict(Counter(nums))
        for i,j in x.items():
            if(len(m)<k):
                m.append(i)
                n.append(j)
            else:
                s=min(n)
                if j>s:
                    y=n.index(s)
                    m[y]=i
                    n[y]=j
        return m