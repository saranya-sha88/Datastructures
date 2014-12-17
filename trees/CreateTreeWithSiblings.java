package trees;

public class CreateTreeWithSiblings {
	
	private static SpecialNode root;
	
	public static SpecialNode createTree()
	{
		SpecialNode temp,temp1;
		root = createNewNode('A',null,null);
		temp = createNewNode('B',root,null);
		root.setChild(temp);
		temp1 = createNewNode('C',temp,null);
		temp.setChild(temp1);
		
		temp = createNewNode('D',temp1,null);
		temp1.setChild(temp);
		
		temp1 = createNewNode('E',temp,null);
		temp.setChild(temp1);
		
		return root;
	}
	
	private static SpecialNode createNewNode(char c, SpecialNode ancester, SpecialNode sibling)
	{
		SpecialNode newNode = new SpecialNode();
		newNode.setNodeName(c);
		newNode.setParent(ancester);
		newNode.setSibling(sibling);
		return newNode;
	}

}
