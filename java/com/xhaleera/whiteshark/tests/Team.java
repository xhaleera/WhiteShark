package com.xhaleera.whiteshark.tests;

import java.util.Vector;

import com.xhaleera.whiteshark.annotations.WhiteSharkSerializable;
import com.xhaleera.whiteshark.annotations.WhiteSharkSerializableCollection;

@WhiteSharkSerializableCollection
public class Team extends Vector<Employee> {
	
	static final long serialVersionUID = 1;

	@WhiteSharkSerializable
	public int[] monthDays;
	
	public Team() { }
	
}
