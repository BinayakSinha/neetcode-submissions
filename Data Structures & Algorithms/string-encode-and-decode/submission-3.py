class Solution:

    def encode(self, strs: List[str]) -> str:
        if len(strs)==0:
            return "zero"
        return "/ ".join(strs)
    def decode(self, s: str) -> List[str]:
        if(s=="zero"):
            return []
        m=s.split("/ ")
        return m