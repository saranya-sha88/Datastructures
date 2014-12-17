package trees;

import java.util.List;
import java.util.Stack;

public class Build123 {

	private static Node root,root1;
	
	private Stack<Node> stack = new Stack<Node>();
	
	
	public Build123()
	{
		/*root = insert(root,4);
		root = insert(root, 3);
		root = insert(root, 5);
		root = insert(root, 2);
		root = insert(root, 1);
		root=  insert(root, 9);
		root=  insert(root, 6);
		root=  insert(root, 10);
		//root=tree.insert(root, 8);*/
		
		root1 = insert(root1,4);
		root1 = insert(root1, 2);
		root1 = insert(root1, 5);
		root1 = insert(root1, 3);
		root1 = insert(root1, 1);
		//root1=  insert(root1, 9);
		root1=  insert(root1, 6);
		root1=  insert(root1, 10);
		root = root1;
	//	root = insert(root, 2);
		//root = insert(root, 1);
		//root = insert(root, 3);
	}
	
	
	public static void main(String[] args) {
		
		//int size;
		int returnVal;
		Build123 tree1 = new Build123();
		
		returnVal = tree1.sizeIterative(root1);
		
		System.out.println(returnVal);
		
		

	}
	
	public static Node getRoot() {
		return root;
	}

	public int size(){
		return(size(root));
	}
	
	public int sizeIterative(Node root)
	{
		int sum = 0;
		boolean done = false;
		Node current = root;
		while(!done)
		{
			if(current != null)
			{
				stack.push(current);
				current = current.left;
			}
			else if(stack.size() > 0)
			{
				current = stack.pop();
				sum = sum+1;
				current = current.right;
			}else{
				done = true;
			}
		}
		
		return sum;
	}
	
	private boolean isBST2(Node node, int min, int max) { 
		  if (node==null) { 
		    return(true); 
		  } 
		  else { 
		   // left should be in range  min...node.data 
		    boolean leftOk = isBST2(node.left, min, node.data);

		    // if the left is not ok, bail out 
		    if (!leftOk) return(false);

		    // right should be in range node.data+1..max 
		    boolean rightOk = isBST2(node.right, node.data+1, max);

		    return(rightOk); 
		  } 
		} 
	
	public int maxDepth(){
		return maxDepth(root);
	}
	
	public int minValue()
	{
		return(minValue(root));
	}
	
	public void mirrorImage(Node node)
	{
		Node temp;
		
		if(node == null)
			return;
		else{
			mirrorImage(node.left);
			mirrorImage(node.right);
		    temp = node.left;
		    node.left = node.right;
		    node.right = temp;
		}
		
	}
	
	
	
	public void doubleTree(Node node)
	{
		Node temp;
		if(node == null)
			return;
		else{
			
			
			doubleTree(node.left);
			
			doubleTree(node.right);
			
			temp = node.left;
			node.left = new Node(node.data);
			node.left.left = temp;
		}
	}
	
	
	public boolean sameTree(Node root1, Node root2)
	{
		if(root1 == null && root2 == null)
		{
			return true;
		}else if(root1!= null && root2 != null){
			return ((root1.data == root2.data) && (sameTree(root1.left,root2.left)) && (sameTree(root1.right,root2.right)));
		}
		return false;
	}
	
	public void printTree(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.println(node.data);
			printTree(node.left);
			
			printTree(node.right);
		
			
			
	}
	
	public void printPostOrder(Node node)
	{
		if(node == null)
			return;
		else{
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.println(node.data);
		}
	}
	
	private int minValue(Node node)
	{
		if(node == null)
			return 0;
		else if(node.left != null)
		{
			return (minValue(node.left));
		}
		
		return node.data;
	}
	
	/*public void printPath(Node node)
	{
		List<Node> list = new ArrayList<Node>();
		list.add(node);
		printPathsRecur(node,list);
		
	}**/
	
	public void printPaths() { 
		 int[] path = new int[1000]; 
		 printPaths(root, path, 0); 
		} 

	private void printPaths(Node node, int[] path, int pathLen) { 
		 if (node==null) return; 
		 // append this node to the path array 
		 path[pathLen] = node.data; 
		 pathLen++; 
		 // it's a leaf, so print the path that led to here 
		 if (node.left==null && node.right==null) { 
		 printArray(path, pathLen); 
		 } 
		 else { 
		 // otherwise try both subtrees 
		 printPaths(node.left, path, pathLen); 
		 printPaths(node.right, path, pathLen); 
		 } 
		} 

	private void printArray(int[] ints, int len) { 
		 int i; 
		 for (i=0; i<len; i++) { 
		 System.out.print(ints[i] + " "); 
		 } 
		 System.out.println(); 
		} 

	
	private void printPathsRecur(Node node,List<Node> list)
	{
		if(node == null && list.size() == 0)
		{
			return;
		}else if(node == null && list.size() > 0)
		{
			for(Node obj : list)
			{
				System.out.print(obj.data + "	");
			}
			System.out.println();
		}else{
		 
		 printPathsRecur(node.left,list);
		 printPathsRecur(node.right,list);
		 list.add(node);
		}
			
	}
	
	private int maxDepth(Node node){
		int ld,rd;
		if(node == null)
			return 0;
		else{
			ld = 1+ maxDepth(node.left);
			rd = 1+maxDepth(node.right);
			
			if(ld > rd)
			{
				return ld;
			}else{
				return rd;
			}
		}
	}
	
	
	
	private int size(Node node)
	{
		int r,len,l;
		if(node == null)
			return 0;
		if(node.left == null && node.right == null)
			return 1;
		else{
			
			l = size(node.left);
			r = size(node.right);
			
			len = l+r+1;
		}
		
		return len;
	}
	
	public Node insert(Node root,int data)
	{
		if(root == null)
		{
			return new Node(data);
		}else{
			if(data <= root.data){
				root.left = insert(root.left,data);
			}else{
				root.right = insert(root.right,data);
			}
		}
		
		return root;
	}

}
