class Solution:
    def isPalindrome(self, s: str) -> bool:
        newStr = ''
        for c in s:
            if c.isalnum():
                newStr += c.lower()
        print(newStr)
        if newStr == newStr[::-1] :
            return True
        return False
        