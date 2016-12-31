package week3.bst;

import java.util.List;

public class BinarySearchTree {
	public static TreeNode root;
	public static List<BinarySearchTree> solution;
    public static void generateTrees(TreeNode node,int data){  
        if(root == null){  
            root = new TreeNode(data);  
        }else{  
            if(data < node.val){  
                if(node.left == null){
                    node.left = new TreeNode(data);
                }else{  
                	generateTrees(node.left,data);  
                }  
            }else{  
                if(node.right == null){
                    node.right = new TreeNode(data);  
                }else{  
                	generateTrees(node.right,data); 
                }
            }  
        }  
    }  
    
    public static void preOrder(TreeNode node){  
        if(node != null){  
            preOrder(node.left); 
            preOrder(node.right);
        }
    }  
	
	public static void main(String[] args) {
		int n = 3;
		for (int j = 1; j < n+1; j++) {
			generateTrees(root, j);
			for (int k = 1; k < n+1; k++) {
				if (k != j) {
					generateTrees(root, k);
				}
			}
			preOrder(root);
			root = null;
		}
	}

}
