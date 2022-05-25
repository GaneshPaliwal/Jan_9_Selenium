package org.testng2;

//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountManager2 {
	//globle object
	@BeforeTest
//	@BeforeClass
	public void getDevEnvDetails(){
		System.out.println("get Dev Env Details");
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
	  @AfterTest
//	  @AfterClass
		public void flushtestDataObject(){
			System.out.println("flush dev env object");
		}
}
