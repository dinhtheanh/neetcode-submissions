# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if root.left is None and root.right is None:
            return 0
        if root.left is None:
            return max(self.maxDepth(root.right),self.diameterOfBinaryTree(root.right))
        if root.right is None:
            return max(self.maxDepth(root.left),self.diameterOfBinaryTree(root.left))
        return self.maxDepth(root.right) + self.maxDepth(root.left)

    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        else:
            return 1 + max(self.maxDepth(root.right), self.maxDepth(root.left))