package trees;

public class FindSiblingNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public SpecialNode findSibling(SpecialNode node)
	{
		SpecialNode root;
		
		if(node.getParent() == null)
		{
			System.out.println("No sibling");
			return null;
		}else if(node.getSibling() != null)
		{
			return node.getSibling();
		}else{
		  root = node.getParent();
		  
		  
		  return root.getChild();
		}
	}
}
