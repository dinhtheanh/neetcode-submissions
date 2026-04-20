import math
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # count for frequencies of '1', '2' in a row,col, 3x3, then store it,
        # count for '.', if number of '.' in a row/col/a 3x3 > 9 - number of set('num" -> invalid
        col_num_sets = {}
        col_non_num_counts = [0] * 9
        square_num_sets = {}
        square_non_num_counts = [0] * 9
        for row in range(0, 9):
            row_num_set = set()
            row_non_num = 0
            for col in range(0, 9):
                col_num_set = col_num_sets.get(col, set())
                square_num_set = square_num_sets.get(self.findCur3x3(col, row), set())
                if board[row][col].isalnum():
                    row_num_set.add(board[row][col])
                    col_num_set.add(board[row][col])
                    square_num_set.add(board[row][col])
                else:
                    row_non_num += 1
                    col_non_num_counts[col] += 1
                    square_non_num_counts[self.findCur3x3(col, row)] += 1
                col_num_sets[col] = col_num_set
                square_num_sets[self.findCur3x3(col, row)] = square_num_set
            if row_non_num < 9 - len(row_num_set):
                return False
        
        for i in range(0, 9):
            if col_non_num_counts[i] < 9 - len(col_num_sets[i]):
                return False
            if square_non_num_counts[i] < 9 - len(square_num_sets[i]):
                return False
        return True

    

    def findCur3x3(self, col: int, row: int) -> int:
        cur_x = math.floor(col/3)
        cur_y = math.floor(row/3)
        return cur_x + cur_y * 3