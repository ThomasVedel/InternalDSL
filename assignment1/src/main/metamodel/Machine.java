package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Machine {

	private List<State> states = new ArrayList<State>();
	private State initialState;
	public Machine(Collection<State> states, State initialState) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
	}
	
	public List<State> getStates() {
		// TODO Auto-generated method stub
		return states;
	}

	public State getInitialState() {
		// TODO Auto-generated method stub
		return initialState;
	}

	public State getState(String name) {
		// TODO Auto-generated method stub
		return states.get(0);
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return states.size();
	}

	public boolean hasInteger(String state) {
		// TODO Auto-generated method stub
		return false;
	}

}
