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
        Queue<TreeNode> myQ = new LinkedList<>();

        if (root != null)
            myQ.offer(root);
        else
            return root;

        while (myQ.size() > 0) {
            TreeNode currentNode = myQ.poll();
            TreeNode temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = temp;

            if (currentNode.left != null)
                myQ.offer(currentNode.left);
            if (currentNode.right != null)
                myQ.offer(currentNode.right);
        }

        return root;
    }
}
