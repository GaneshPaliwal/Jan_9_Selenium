package org.asertions;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	 @Test
	 public void softassertEx1() {
		 SoftAssert sa =new SoftAssert ();
		 System.out.println("soft assert 1");
		 int a=10;
		 sa.assertEquals(a, 100);
		 System.out.println("After int");
		 String actstr="pune";
		 String expstr="pune";
		 sa.assertEquals(actstr, expstr);
		 System.out.println("After string");
		 boolean flag=true;
		 sa.assertTrue(flag);
		 System.out.println("after boolean");
		 sa.assertTrue(actstr.equals("Mumbai"));
		 System.out.println("after string");
		 sa.assertAll();
	 }
	 @Test
	 public void testmethod() {
		 System.out.println("Test Method");
	 }

}
