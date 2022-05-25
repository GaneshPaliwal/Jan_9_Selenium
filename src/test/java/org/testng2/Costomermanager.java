package org.testng2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Costomermanager {
	@BeforeClass
	public void getCustomertestData() {
		System.out.println("get customer test data object");
	}
	 @Test
	  public void creatcostomer() {
		  System.out.println("create customer");
	  }
	 @Test
	  public void updatecostomer() {
		  System.out.println("update customer");
	  } @Test
	  public void deletecostomer() {
		  System.out.println("delete customer");
	  }
	  @AfterClass
		public void flushcustmertestDataObject(){
			System.out.println("clear customer test data object");
		}

}
