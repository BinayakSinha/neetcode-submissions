class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Map a sorted string key to a list of anagrams
        anagram_map = defaultdict(list)
        
        for word in strs:
            # Sorting the word creates a universal key for all its anagrams
            # "eat", "tea", "ate" all become "aet"
            key = "".join(sorted(word))
            
            # Append the original word to its matching key list
            anagram_map[key].append(word)
            
        # Return just the grouped lists
        return list(anagram_map.values())