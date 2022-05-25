package org.testng2;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Costomermanager2 {
	@BeforeTest
	public void getQAenvdetails() {
		System.out.println("get QA env Details");
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
	  @AfterTest
		public void flushAcctestDataObject(){
			System.out.println("Flush QA env  object");
		}

}
