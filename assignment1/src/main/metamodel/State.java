package main.metamodel;

import java.util.ArrayList;
import java.util.List;

import main.metamodel.Transition;

public class State {

	private String name;
	private List<Transition> trans = new ArrayList<>();
	public State(String name) {
		super();
		this.name = name;
	}
	
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public List<Transition> getTransitions() {
		// TODO Auto-generated method stub
		return trans;
	}

	public Transition getTransitionByEvent(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addTransition(Transition t) {
		this.trans.add(t);
	}

}
