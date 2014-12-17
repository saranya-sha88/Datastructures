package trees;

public class LeastCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Build123 tree = new Build123();
		Node temp = findLeastCommonAncestor(tree.getRoot(),tree.getRoot().getLeft().left,tree.getRoot().getLeft().getRight());
		
		System.out.println(temp.data);
		

	}
	
	
	public static Node findLeastCommonAncestor(Node root, Node n1,Node n2)
	{
		if(root == null)
			return null;
		if(root == n1)
			return n1;
		else if (root == n2)
			return n2;
		
		Node lNode = findLeastCommonAncestor(root.left,n1,n2);
		Node rNode = findLeastCommonAncestor(root.right,n1,n2);
		
		if(lNode != null && rNode != null) return root;
		
		return (lNode != null)? lNode:rNode;
	}

}
