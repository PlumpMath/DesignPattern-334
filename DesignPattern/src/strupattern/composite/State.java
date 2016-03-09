package strupattern.composite;

import java.util.ArrayList;
import java.util.List;

public class State implements Profitable {

	private String stateName;
	private List<Profitable> cities;
	
	public State(String stateName) {
		super();
		this.stateName = stateName;
		cities = new ArrayList<Profitable>();
	}

	@Override
	public double getProfit() {
		double profit = 0;
		for(Profitable obj : cities)
			profit += obj.getProfit();
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		cities.add(child);
	}

	@Override
	public void removeLeaf(Profitable child) {
		cities.remove(child);
	}
	
}
