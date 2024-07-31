import java.util.ArrayList;
import java.util.List;

public class inroderList {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    List<Integer> ans;

    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        ans = new ArrayList<>();

        inorder(root);

        return ans;

    }
}
