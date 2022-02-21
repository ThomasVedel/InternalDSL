package main;

import java.util.HashMap;
import java.util.Map;

import main.metamodel.Transition;
import main.metamodel.State;
import main.metamodel.Machine;

public class StateMachine {
	
	private Map<String,State> states = new HashMap<>();
	private State current;
	private State initial;
	private String currentEvent;
	
	private State getState(String name) {
		if(!states.containsKey(name)) states.put(name, new State(name));
		return states.get(name);
	}
	
	public Machine build() {
		// TODO Auto-generated method stub
		return new Machine(states.values(),initial);
	}

	public StateMachine state(String name) {
		// TODO Auto-generated method stub
		current = getState(name);
		return this;
	}

	public StateMachine initial() {
		// TODO Auto-generated method stub
		initial = current;
		return this;
	}

	public StateMachine when(String event) {
		// TODO Auto-generated method stub
		currentEvent = event;
		return this;
	}

	public StateMachine to(String state) {
		// TODO Auto-generated method stub
		Transition t = new Transition(currentEvent,getState(state));
		current.addTransition(t);
		return this;
	}

	public StateMachine integer(String name) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine set(String name, int value) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine increment(String state) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return this;
	}

}
