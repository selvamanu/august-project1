package com.TestNG_Framework;

import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Test {
	//-3,-2,-1,0,1,2,3
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void Teacer(){
		// TODO Auto-generated method stub
		
		System.out.println(10/0);
		System.out.println("done");
	}
	
	@Test(groups = "school")
	
	private void board() {
		// TODO Auto-generated method stub
		System.out.println("chalk----------2");

	}
	@Test(groups = "school")
	private void book() {
		// TODO Auto-generated method stub
		System.out.println("read----------3");

	

	}

	


}
