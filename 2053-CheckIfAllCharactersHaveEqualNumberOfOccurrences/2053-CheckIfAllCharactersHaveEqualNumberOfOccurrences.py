# Last updated: 9/2/2026, 12:21:14 PM
class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        return len(set(Counter(s).values())) == 1