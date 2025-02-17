class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # print(''.join(sorted(s)))
        # print(''.join(sorted(t)))

        if ''.join(sorted(s)) == ''.join(sorted(t)) :
            return True
        return False