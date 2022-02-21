package main;


import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {

	private Machine machine;
	private State currentState;
	
	public void run(Machine m) {
		// TODO Auto-generated method stub
		this.machine = m;
		currentState = m.getInitialState();
	}

	public State getCurrentState() {
		// TODO Auto-generated method stub
		return currentState;
	}

	public void processEvent(String event) {
		// TODO Auto-generated method stub
		for(Transition t: currentState.getTransitions()) {
			if(t.getEvent().equals(event)) {
				currentState = t.getTarget();
			}
		}
		System.err.println("Unhandled event " + event);
		
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return machine.numberOfIntegers();
	}

}
