class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        x=dict(Counter(s))
        y=dict(Counter(t))
        return x==y