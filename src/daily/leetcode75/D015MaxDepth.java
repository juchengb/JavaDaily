package daily.leetcode75;
// *** 104. Maximum Depth of Binary Tree - DFS
public class D015MaxDepth {

    public int maxDepth(TreeNode root) {
        
        if (root == null) { // 空樹深度為 0
            return 0;
        }

        int leftDepth = maxDepth(root.left); // 遞迴計算左子樹深度      
        int rightDepth = maxDepth(root.right); // 遞迴計算右子樹深度
        return Math.max(leftDepth, rightDepth) + 1; // 目前節點深度 = 較深子樹 + 自己這一層
    
    }

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}


