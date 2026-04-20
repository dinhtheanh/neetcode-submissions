class Solution:
    def isPalindrome(self, s: str) -> bool:
        n_s = s.lower()
        start = 0
        end = len(n_s) - 1
        while (start < end):
            while (not n_s[start].isalnum() or n_s[start] == ' ') and start < end:
                start += 1
            while (not n_s[end].isalnum() or n_s[end] == ' ') and start < end:
                end -= 1
            if n_s[start] != n_s[end]:
                return False
            start += 1
            end -= 1

        return True
