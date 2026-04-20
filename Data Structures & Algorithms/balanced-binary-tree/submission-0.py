# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if root is None:
            return True
        if not self.isBalanced(root.right) or not self.isBalanced(root.left):
            return False       
        if abs(self.depth(root.right) - self.depth(root.left)) > 1:
            return False
        return True

    def depth(self, root: Optional[TreeNode]) -> bool:
        if root is None:
            return 0
        return 1 + max(self.depth(root.left), self.depth(root.right))
      