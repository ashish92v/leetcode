package com.test;

public class ValidBST {
	
	TreeNode node = new TreeNode(5,
			new TreeNode(1,null,null),new TreeNode(7,
												new TreeNode(3,null, null),new TreeNode(8,null, null)));
	
	public boolean validate(TreeNode root, Integer low, Integer high) {
        
        if (root == null) {
            return true;
        }
        
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        
        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
    
    public static void main(String args[]) {
    	ValidBST bst = new ValidBST();
    	
    	System.out.println(bst.isValidBST(bst.node));
    }
	
	
	
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