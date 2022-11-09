import java.util.ArrayList;

public class CoastGuard extends SearchTree {

	SearchTreeNode CurrentState;
	ArrayList<Ship> CurrShips;
	ArrayList<Station> AllStations;
	int Capacity;
	int CurrPassengers;
	
	
	
	@Override
	public boolean GoalTest() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int PathCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
