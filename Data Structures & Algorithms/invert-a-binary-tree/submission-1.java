/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        Deque<TreeNode> myStack = new LinkedList<>();
        
        myStack.push(root);

        while (myStack.size() > 0) {
            TreeNode curNode = myStack.pop();

            TreeNode tmp = curNode.left;
            curNode.left = curNode.right;
            curNode.right = tmp;

            if (curNode.left != null)
                myStack.push(curNode.left);

            if (curNode.right != null)
                myStack.push(curNode.right);
        }

        return root;
    }
}
