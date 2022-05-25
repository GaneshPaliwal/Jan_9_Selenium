package org.TestngEx;

import org.testng.annotations.Test;

public class Ex2 {
	@Test
	public void testmethod1() {
		System.out.println("india");
		testmethod2();       // direct calling 
	} // @Test        only gives output of 1st and 3rd method 
	// beacause the word test is commented. it gives o/p but not
	// pass the testmethod2()
	public void testmethod2() {
		System.out.println("Maharashtra");
	}  @Test
	public void testmethod3() {
		System.out.println("jalgaon");
	} // @Test
	public void testmethod4() {
		System.out.println("test method4");
	}





}
