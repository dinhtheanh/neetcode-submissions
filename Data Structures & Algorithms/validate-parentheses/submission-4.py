class Solution:
    def isValid(self, s: str) -> bool:
        cor = { 
            '(' : ')',
            '{' : '}',
            '[' : ']'
        }
        stack = []

        for l in s:
            if l in cor.keys():
                stack.append(l)
            else:
                if not len(stack) > 0 or cor[stack.pop()] != l:
                    return False
        
        if len(stack) > 0:
            return False

        return True