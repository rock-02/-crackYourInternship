import java.util.ArrayList;
import java.util.List;

public class MedianOfBST {

    List<Integer> ans;

    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }

    public float medianNode(TreeNode root) {

        ans = new ArrayList<>();

        inorder(root);

        int n = ans.size();

        if (n % 2 == 0) {
            return (ans.get(n / 2) + ans.get(n / 2 - 1)) / 2.0f;
        } else {
            return ans.get(n / 2);
        }
    }
}
