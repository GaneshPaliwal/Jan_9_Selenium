package org.TestngEx;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void login() {
		System.out.println("login");
	}  @Test(priority=8)
	public void logout() {
		System.out.println("logout");
	}  @Test(priority=7)
	public void createcust() {
		System.out.println("Aurangabad");
	}  @Test(priority=6)
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
	}  @Test(priority=2)
	public void Capitaldeletecust() {
		System.out.println("India");
	}




}
