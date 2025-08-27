package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SimTest {
	
	@Autowired
	@Qualifier("jio")
	private Sim sim;//There are multiple sims hence we should specify
	
	public void callSim() {
		sim.call();
		
	}

}
