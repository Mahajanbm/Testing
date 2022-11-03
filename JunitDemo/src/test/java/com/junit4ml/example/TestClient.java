package com.junit4ml.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestClient {
	@BeforeClass
	public static  void initialize() {
	System.out.println("before class method execution");
	}
	@Test(timeout = 1)
	public void testDemo()
	{System.out.println("testDemo method");
		
	}
	@Ignore
	@Test
	public void testDemo1()
	{System.out.println("testDemo1 method");
		
	}
	@AfterClass
	public static void ShutDown() {
	System.out.println("after class method execution");
	}
	

}
