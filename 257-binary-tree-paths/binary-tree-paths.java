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
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
       List<Integer> num = new ArrayList<>();
        bkt(root, num);
        return ans;
    }

    public void bkt(TreeNode root, List<Integer> s){
        if(root==null){
          return;
        }
       
        s.add(root.val);
        if(root.left==null && root.right==null){
            String str ="";
            for(int i=0; i<s.size(); i++){
                str+=s.get(i);
                if(i !=s.size()-1) str+="->";
            }
            ans.add(str);
        }
        bkt(root.left,s);
        bkt(root.right,s);
        s.removeLast();
    }
}