package com.suncafly.rules.demo.test;

import com.suncafly.rules.demo.Machine;

public interface MachineResultSet {
	
	boolean next();
	
	Machine getMachine();

}
