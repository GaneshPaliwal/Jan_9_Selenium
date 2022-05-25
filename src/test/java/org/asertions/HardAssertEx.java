package org.asertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	 @Test
	 public void hardassertEx1() {
		 System.out.println("hard assert 1");
		 int a=10;
		 Assert.assertEquals(a, 100);
		 System.out.println("After int");
		 String actstr="pune";
		 String expstr="pune";
		 Assert.assertEquals(actstr, expstr);
		 System.out.println("After string");
	 }
	 @Test
	 public void testmethod() {
		 System.out.println("Test Method");
	 }

}
