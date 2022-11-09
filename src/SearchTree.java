import java.util.ArrayList;

public abstract class SearchTree {
	SearchTreeNode InitalState;
	ArrayList<String> StateSpace;
	ArrayList<String> Operators;
	public abstract boolean GoalTest();
	public abstract int PathCost();
}
