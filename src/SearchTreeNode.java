
public class SearchTreeNode {
	String state;
	SearchTreeNode parent;
	String operator;
	int depth;
	int cost;
	
	public SearchTreeNode() {
		this.state = "";
		this.operator = "";
	}
	
	public SearchTreeNode(String state , SearchTreeNode parent, String operator , int depth, int cost) {
		this.state = state;
		this.parent = parent;
		this.operator = operator;
		this.depth = depth;
		this.cost = cost;
	}
	
	public static void main(String[] args) {
		SearchTreeNode x = new SearchTreeNode("",null,"",1,1);
		
	}
	

}
