class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        matching_brackets = {')': '(', '}': '{', ']': '['}

        for c in s:
            if c in matching_brackets.values():  # 여는 괄호일 경우
                stack.append(c)
            elif c in matching_brackets:  # 닫는 괄호일 경우
                if not stack or stack[-1] != matching_brackets[c]:
                    return False
                stack.pop()
            else:
                return False  # 유효하지 않은 문자

        return not stack
        