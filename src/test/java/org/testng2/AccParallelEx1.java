package org.testng2;

import org.testng.annotations.Test;

public class AccParallelEx1 {

	 @Test
	  public void creatAccuount() {
		  System.out.println("create Accuount");
	  }
	 @Test
	  public void updateAccuount() {
		  System.out.println("update Accuount");
	  } @Test
	  public void deleteAccuount() {
		  System.out.println("delete Accuount");
	  }
	 
}
