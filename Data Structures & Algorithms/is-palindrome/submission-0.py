class Solution:
    def isPalindrome(self, s: str) -> bool:
        n_s = s.lower()
        new_string = []
        for letter in n_s:
            if letter.isalnum() and letter != ' ':
                new_string.append(letter)
        #new_s = ''.join(n_s)
        print(new_string)
        start = 0
        end = len(new_string) - 1
        while (start < end):
            if new_string[start] != new_string[end]:
                return False
            start += 1
            end -= 1

        return True
