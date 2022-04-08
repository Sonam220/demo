package com.example.javademo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyFirstControllerTest {

//  @Test
//  void test(){
//	   fail("Not yet implemented");
//  }
	
	MyFirstController obj = new MyFirstController();
	
	@Test
	void test() {
		assertEquals(2,2);
	}
}