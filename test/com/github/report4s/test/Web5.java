package com.github.report4s.test;

import org.testng.SkipException;
import org.testng.annotations.*;

public class Web5 extends TemplateTest {
	
	@Test(description = "Write input element")
	public void search() {
		throw new SkipException("Skipping");
	}

	@Test(description = "Click checkbox")
	public void setGender() {
		throw new SkipException("Skipping");
	}

	@Test(description = "Single select")
	public void selectCar() {
		throw new SkipException("Skipping");
	}
}
