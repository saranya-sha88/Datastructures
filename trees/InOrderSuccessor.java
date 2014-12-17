package trees;

public class InOrderSuccessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpecialNode root = null, temp,succ;
		 
		 root = insert(root, 20);
		  root = insert(root, 8);
		  root = insert(root, 22);
		  root = insert(root, 4);
		  root = insert(root, 12);
		  root = insert(root, 10);  
		  root = insert(root, 14);    
		  temp = root.getLeft().getRight().getRight();
		  
		  succ = getInOrderSuccessor(temp);
		  System.out.println(succ.data);
		  
		  

	}
	
 private static SpecialNode newNode(int data)
{
	SpecialNode node = new SpecialNode();
	node.data = data;
	
	return node;
}
	
	public static SpecialNode insert(SpecialNode node, int data)
	{
	  /* 1. If the tree is empty, return a new,
	      single node */
	  if (node == null)
	    return(newNode(data));
	  else
	  {
		  SpecialNode temp;  
	 
	    /* 2. Otherwise, recur down the tree */
	    if (data <= node.data)
	    {    
	         temp = insert(node.getLeft(), data);
	         node.setLeft(temp);
	         temp.setParent(node);
	    }
	    else
	    {
	        temp = insert(node.getRight(), data);
	        node.setRight(temp);
	        temp.setParent(node);
	    }    
	  
	    /* return the (unchanged) node pointer */
	    return node;
	  }
	} 
	
	public static SpecialNode getInOrderSuccessor(SpecialNode node)
	{
		SpecialNode parent;
		if(node == null)
			return null;
		
		if(node.getRight() != null)
		{
			return getLeftMostNode(node.getRight());
		}else{
			while((parent = node.getParent()) != null)
			{
				if(node.data <= parent.data)
					break;
				node = parent;
			}
		}
		
		return parent;
	}
	
	
	private static SpecialNode getLeftMostNode(SpecialNode node)
	{
		
		while(node.getLeft() != null)
			node = node.getLeft();
		
		return node;
	}

}
