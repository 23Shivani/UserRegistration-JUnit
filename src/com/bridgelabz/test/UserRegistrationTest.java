package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.main.UserRegistrationMain;

public class UserRegistrationTest {
	UserRegistrationMain userRegistration = new UserRegistrationMain();
	
	@Test
	public void givenFirstName_FirstLetterUpperCase_Pass() {
		 boolean result = userRegistration.validateFirstName("Shivani");
		 Assert.assertTrue(result);
		}
	@Test
	public void givenFirstName_LessThanThreeChar_Fail() {
		boolean result = userRegistration.validateFirstName("vu2");
		Assert.assertFalse(result);
	}

	@Test
	public void givenFirstName_IfNumber_Fail() {
		boolean result = userRegistration.validateFirstName("Shiv3ni");
		Assert.assertFalse(result);
	}

	@Test
	public void givenFirstName_IfSpecialChar_Fail() {
		boolean result = userRegistration.validateFirstName("Shiv@");
		Assert.assertFalse(result);
	}
	@Test
	public void givenLastName_FirstLetterUpperCase_Pass(){
	    boolean result = userRegistration.validateLastName("Gharve");
	    Assert.assertTrue(result);
	}
	
	@Test 
	public void givenLastName_LessThanThreeChar_Fail() {
		boolean result = userRegistration.validateLastName("gh");
		Assert.assertFalse(result);
	}
}