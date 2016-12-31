package week4.preorder;

public class PreOrder {

	public static TreeNode root;
	public static void preOrder(TreeNode node) {
		if (node != null) {
			System.out.print(node.val);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
    public static void buildTree(TreeNode node,int data){  
        if(root == null){  
            root = new TreeNode(data);  
        }else{  
            if(data < node.val){  
                if(node.left == null){  
                    node.left = new TreeNode(data);  
                }else{
                    buildTree(node.left,data);  
                }  
            }else{  
                if(node.right == null){  
                    node.right = new TreeNode(data);  
                }else{  
                    buildTree(node.right,data);  
                }  
            }  
        }  
    }  

	public static void main(String[] args) {  
		int[] a = {2,4,12,45,21,6,111};  
	    for (int i = 0; i < a.length; i++) {
	    	buildTree(root,a[i]);
	    }
	    preOrder(root);
	}  
	

}
