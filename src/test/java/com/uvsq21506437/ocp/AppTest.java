package com.uvsq21506437.ocp;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    

    public void testListeVide() {
    	App app = new App();
    	 ArrayList<allEmploye> liste = new ArrayList<allEmploye>();
    	 Throwable t = null;
    	try {
			App.calculSalaire(liste );
		} catch (EstListeVide e) {
			t = e.fillInStackTrace();
		}
    	
    	assertNotNull(t);
    	assertSame(EstListeVide.class, t.getClass());
    }
}
