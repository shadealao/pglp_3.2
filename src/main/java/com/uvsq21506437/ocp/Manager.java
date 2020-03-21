package com.uvsq21506437.ocp;

public class Manager extends allEmploye{
	final private int base = 1500;
	private int NbEmployes;
	public Manager(int NbEmployes) {
		this.NbEmployes = NbEmployes;
	}
	
	@Override
	public double salaire() {
		return base+this.NbEmployes*100;
	}
	
}
