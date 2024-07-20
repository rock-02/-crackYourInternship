import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqPermutations {
    static void helper(ArrayList<Integer> arr,
            int n, Set<ArrayList<Integer>> ans,
            ArrayList<Integer> curr, int v[], ArrayList<ArrayList<Integer>> res) {

        if (curr.size() == n) {

            if (!ans.contains(curr)) {

                ans.add(new ArrayList<>(curr));

                res.add(new ArrayList<>(curr));
            }

            return;
        }

        for (int i = 0; i < n; i++) {

            if (v[i] == 1)
                continue;
            v[i] = 1;
            curr.add(arr.get(i));
            helper(arr, n, ans, curr, v, res);
            v[i] = 0;
            curr.remove(curr.size() - 1);
        }

    }

    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {

        Set<ArrayList<Integer>> ans = new HashSet<>();

        int v[] = new int[n];

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Collections.sort(arr);

        helper(arr, n, ans, new ArrayList<>(), v, res);

        return res;

    }
}
