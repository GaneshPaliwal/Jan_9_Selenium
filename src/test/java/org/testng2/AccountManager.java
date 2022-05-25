package org.testng2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountManager {
	//globle object
	@BeforeClass
	public void getAccounttestData(){
		System.out.println("get account test data object");
	}
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
	  @AfterClass
		public void flushtestDataObject(){
			System.out.println("clear account test data object");
		}
}
