package trees;

public class SpecialNode {
	
	 private char nodeName;
	 
	 int data;
	 
	 private SpecialNode left;
	 
	 private SpecialNode right;
	 
	 public SpecialNode getLeft() {
		return left;
	}
	public void setLeft(SpecialNode left) {
		this.left = left;
	}
	public SpecialNode getRight() {
		return right;
	}
	public void setRight(SpecialNode right) {
		this.right = right;
	}
	private SpecialNode child;
	 
	 public SpecialNode getChild() {
		return child;
	}
	public void setChild(SpecialNode child) {
		this.child = child;
	}
	public char getNodeName() {
		return nodeName;
	}
	public void setNodeName(char nodeName) {
		this.nodeName = nodeName;
	}
	public SpecialNode getParent() {
		return Parent;
	}
	public void setParent(SpecialNode parent) {
		Parent = parent;
	}
	public SpecialNode getSibling() {
		return Sibling;
	}
	public void setSibling(SpecialNode sibling) {
		Sibling = sibling;
	}
	private SpecialNode Parent;
	 private SpecialNode Sibling;

}
