package com.uvsq21506437.ocp;

import java.util.ArrayList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Vendeur v1 = new Vendeur(10);
    	Vendeur v2 = new Vendeur(20);
    	Vendeur v3 = new Vendeur(30);
    	Employe e1 = new Employe(2005);
    	Employe e2 = new Employe(2010);
    	
    	ArrayList<allEmploye>listesalarie = new ArrayList<allEmploye>(); 
    	listesalarie.add(v1);
    	listesalarie.add(v2);
    	listesalarie.add(v3);
    	listesalarie.add(e1);
    	listesalarie.add(e2);
    	listesalarie.add(new Manager(20));
    	double salaireTotal = 0;
    	
    	for(int i = 0; i< listesalarie.size(); i++) {
    		salaireTotal += listesalarie.get(i).salaire();
    	}
    	
    	System.out.println("Salaires total "+salaireTotal);
    }
}
