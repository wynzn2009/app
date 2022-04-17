package pris.code;

import pris.model.TreeNode;

public class ConvertSortedArraytoBinarySearchTree108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums,0,nums.length);
    }

    private TreeNode help(int[] nums,int start,int end){
        if(start >= end){
            return null;
        }
        int mid = (start + end )/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums,start,mid);
        root.right = help(nums,mid+1,end);
        return root;
    }
}
