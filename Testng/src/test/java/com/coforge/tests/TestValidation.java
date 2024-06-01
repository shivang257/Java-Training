package com.coforge.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestValidation {

	@Test(groups = {"sanityTest"}, dependsOnGroups = {"smokeTest"} )
	public void verifyAnotherModule() {
		assertEquals(true, false);
		System.out.println("Verifying still another module");
	}
	
	@Test(groups = {"smokeTest"})
	public void verifyFirstModule() {
		System.out.println("Verify First Module");
	}
	
	@Test(groups = {"regressionTest"}, dependsOnGroups = {"smokeTest","sanityTest"} )
	public void verifyFinalModule() {
		System.out.println("Verifying Last Module");
	}
}
