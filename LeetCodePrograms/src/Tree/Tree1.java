package Tree;

class Node {
	int val;
	Node left;
	Node right;
	
	Node(int v, Node l, Node r){
		val=v;
		left=l;
		right=r;
	}
	
}

public class Tree1 {
	Node root;
	public static void main(String[] args) {
		
	Node root= new Node(1, null, null);
	root.left = new Node(2, null,null);
	root.right = new Node(3, null, null);
	root.right.left =new Node(4, null, null);
	root.right.right = new Node(5, null, null);
	System.out.println(findHeight(root));
	}
	
	public static int findHeight(Node root) {
		/*if(root==null)
			return -1;*/
		if(root.left == null && root.right==null)
			return 0;
		return Math.max(findHeight(root.left),findHeight(root.right))+1;
		
		
	}
	

	
}
