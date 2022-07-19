package org.testng;

import org.testng.annotations.BeforeTest;

public class ExecutionTestng {
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite1()
	{
		System.out.println("beforesuite");
	}

	@BeforeTest
	public void BeforeTest2()
	{
		System.out.println("before test");
		
	}
	
	public void Before3()
	{
		System.out.printf("before test");
		
	}

}
