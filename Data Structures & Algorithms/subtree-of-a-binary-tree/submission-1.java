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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Deque<TreeNode> myQ = new LinkedList<>();
        myQ.offer(root);
        
        while(myQ.size() > 0) {     
            int size = myQ.size();

            for (int i = 0; i < size; i++) {
                TreeNode curNode = myQ.poll();

                if (curNode == null) continue;

                if (curNode.val == subRoot.val) {
                    if (isSameTree(curNode, subRoot))
                        return true;
                }

                myQ.offer(curNode.left);
                myQ.offer(curNode.right);
            }
            
        }

        return false;
    }

    public boolean isSameTree(TreeNode sameRoot,TreeNode subRoot) {
        Deque<TreeNode> ogTreeQueue = new LinkedList<>();
        Deque<TreeNode> subTreeQueue = new LinkedList<>();

        ogTreeQueue.offer(sameRoot);
        subTreeQueue.offer(subRoot);

        while (ogTreeQueue.size() > 0 && subTreeQueue.size() > 0){
            if (ogTreeQueue.size() != subTreeQueue.size())
                return false;
            
            for (int i = 0; i < ogTreeQueue.size(); i++) {
                TreeNode ogNode = ogTreeQueue.poll();
                TreeNode subNode = subTreeQueue.poll();

                if (ogNode == null && subNode == null) {
                    continue;
                }

                if (ogNode == null || subNode == null || ogNode.val != subNode.val) {
                    return false;
                }

                ogTreeQueue.offer(ogNode.left);
                subTreeQueue.offer(subNode.left);
                ogTreeQueue.offer(ogNode.right);
                subTreeQueue.offer(subNode.right);
            }
        }

        return true;
    }
}
