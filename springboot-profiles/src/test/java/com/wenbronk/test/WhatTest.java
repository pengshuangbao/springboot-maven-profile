package com.wenbronk.test;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wenbronk.profiles.App;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class WhatTest {

	@Test
	public void test1() {
		System.out.println("so what test");
	}
	
}
