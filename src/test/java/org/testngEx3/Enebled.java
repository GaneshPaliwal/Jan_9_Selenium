package org.testngEx3;

import org.testng.annotations.Test;

public class Enebled {
	public class Ex3 {
		@Test(priority=1,enabled=true)
		public void login() {
			System.out.println("login");

		}  @Test(priority=5,enabled=true)
		public void logout() {
			System.out.println("logout");
		}  @Test(priority=2,enabled=true)
		public void createcust() {
			System.out.println("create cust");
		} 
		} @Test(priority=3,enabled=true)
		public void updatecust() {
			System.out.println("update cust");
		}  
		 @Test(priority=4,enabled=false)
		public void deletecust() {
			System.out.println("delete cust");
		} 



	}
