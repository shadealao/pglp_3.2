package com.uvsq21506437.ocp;

public class Vendeur extends allEmploye{
	final private int base = 2000;
	private int commission;
	public Vendeur(int commission) {
		this.commission = commission;
	}
	
	/**
	 * Salaire d'un vendeur.
	 */
	@Override
	public double salaire() {
		return base+commission;
	}

}

