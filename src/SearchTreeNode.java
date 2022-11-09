
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
	
	
	public String toString() {
		if(parent != null) {
			return "state :" + this.state
					 + "\n" + "parent :" + "\n" + "{" + "\n" + this.parent + "\n" + "}"
					 + "\n" + "operator :" + this.operator
					 + "\n" + "depth :" + this.depth
					 + "\n" + "cost :" + this.cost;
		}
		return "state :" + this.state
			 + "\n" + "parent : Root" 
			 + "\n" + "operator :" + this.operator
			 + "\n" + "depth :" + this.depth
			 + "\n" + "cost :" + this.cost;
	}
	
	public static void main(String[] args) {
		SearchTreeNode x = new SearchTreeNode("(1,2)",null,"",1,1);
		SearchTreeNode y = new SearchTreeNode("(1,3)",x,"",1,1);
		System.out.println(y);
	}
	

}
