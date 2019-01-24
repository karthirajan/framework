package org.framework;

import org.testng.annotations.Test;

public class Welcome {
	
	@Test(groups={"karthi"})
	 void test9() {
	    System.out.println("9");

	}
	@Test(groups= {"ajith"})
	 void test10() {
	    System.out.println("10");

	}
	@Test(enabled=false)
	 void test11() {
	    System.out.println("11");

	}
	@Test(groups= {"achu"})
	 void test12() {
	    System.out.println("12");

	}

}
