// Last updated: 2/13/2026, 9:46:52 AM
class Solution {
    void inorder(List<Integer> ans,TreeNode root)
        {
          if(root==null)
                return;
            inorder(ans,root.left);
            ans.add(root.val);
            inorder(ans,root.right);
        }
    public List<Integer> inorderTraversal(TreeNode root) {
        
            
                List<Integer> ans=new ArrayList<>();
                inorder(ans,root);
                return ans;
               }
                      }
                      