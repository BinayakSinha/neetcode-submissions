class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        x=dict(Counter(nums))
        for i in x.values():
            if i>1:
                return True
        return False