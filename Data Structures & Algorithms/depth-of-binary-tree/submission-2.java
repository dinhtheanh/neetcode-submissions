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
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        int level = 1;

        Deque<TreeNode> myQ = new LinkedList<>();

        myQ.offer(root);

        while (myQ.size() > 0) {
            int nodeToProcess = myQ.size();

            for (int i = 0; i < nodeToProcess; i++) {
                TreeNode curNode = myQ.poll();
                if (curNode.left != null)
                    myQ.offer(curNode.left);
                if (curNode.right != null)
                    myQ.offer(curNode.right);
            }
            
            if (myQ.size() > 0) {
                level++;
            }
        }

        return level;
    }
}
