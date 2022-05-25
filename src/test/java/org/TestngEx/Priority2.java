package org.TestngEx;

import org.testng.annotations.Test;

public class Priority2 {
	@Test(priority=-10)
	public void login() {
		System.out.println("login");
	}  @Test(priority=8)
	public void logout() {
		System.out.println("logout");
	}  @Test(priority=0)  // 0 priority hence execute 3rd
	public void createcust() {
		System.out.println("Aurangabad");
	}  @Test     // no prority hence execute 2nd
	public void Capitalcreatecust() {
		System.out.println("Jalgaon");
	} @Test(priority=5)
	public void updatecust() {
		System.out.println("Pune");
	}  @Test(priority=4)
	public void Capitalupdatecust() {
		System.out.println("Mumbai");
	} @Test(priority=3)
	public void deletecust() {
		System.out.println("Maharashtra");
	}  @Test(priority=0) // check asci value if priority is same
	public void Capitaldeletecust() {
		System.out.println("India");
	}




}
