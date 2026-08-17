class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> out = new ArrayList<>();
          Queue<TreeNode> queue = new LinkedList<>();
           if(root == null){
            return out;
           }

        queue.add(root);

        while(!queue.isEmpty()){
            int n= queue.size();
        List<Integer> level = new ArrayList<>();

        for(int i=0; i<n; i= i+1){
            TreeNode node = queue.remove();
            level.add(node.val);

            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
           out.add(level);
        }
        return out;
    }
}