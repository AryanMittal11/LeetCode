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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int k = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                list.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            if (k % 2 != 0) {
                Collections.reverse(list);
            }
            ans.add(list);
            k++;
        }
        return ans;
    }

    // public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     if (root == null) {
    //         return ans;
    //     }
    //     Deque<TreeNode> queue = new LinkedList<>();
    //     queue.addFirst(root);
    //     boolean revFlag = false;
    //     while (!queue.isEmpty()) {
    //         int levelSize = queue.size();
    //         List<Integer> list = new ArrayList<>();
    //         for (int i = 0; i < levelSize; i++) {
    //             if (!revFlag) {
    //                 TreeNode currentNode = queue.removeFirst();
    //                 list.add(currentNode.val);
    //                 if (currentNode.left != null) {
    //                     queue.addLast(currentNode.left);
    //                 }
    //                 if (currentNode.right != null) {
    //                     queue.addLast(currentNode.right);
    //                 }
    //             } else {
    //                 TreeNode currentNode = queue.removeLast();
    //                 list.add(currentNode.val);
    //                 if (currentNode.right != null) {
    //                     queue.addFirst(currentNode.right);
    //                 }
    //                 if (currentNode.left != null) {
    //                     queue.addFirst(currentNode.left);
    //                 }
    //             }
    //         }
    //         revFlag = !revFlag;
    //         ans.add(list);
    //     }
    //     return ans;
    // }
}