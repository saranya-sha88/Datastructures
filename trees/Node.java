package trees;

public class Node {

		  Node right;
		  Node left;
		  public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getParent() {
			return parent;
		}

		public void setParent(Node parent) {
			this.parent = parent;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		Node parent;
		  int data;
		
		public Node(int data)
		{
			right = null;
			left = null;
			this.data = data;
		}
		
		public Node()
		{
			
		}

		
}
