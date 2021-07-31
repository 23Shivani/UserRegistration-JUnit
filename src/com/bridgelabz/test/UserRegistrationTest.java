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
	
	@Test
	    public void givenEmailId_IfProper_Pass(){
	        boolean result = userRegistration.validateEmailId("xyz_sss@ab.co.in");
	        Assert.assertTrue(result);
	    }
	
	@Test
    public void givenMobileNum_IfLessDigits_Fail(){
        boolean result = userRegistration.validateMobileNum("9960077482");
        Assert.assertFalse(result);
    }
	
	@Test
    public void givenMobileNum_IfNotStartWith91_Fail(){
        boolean result = userRegistration.validateMobileNum("7894561273");
        Assert.assertFalse(result);
    }
	
	@Test
	public void givenPassword_IfMin8Chars_Pass() {
		boolean result = userRegistration.validatePassword("sE@sgrn1*");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_IfAtleast1UpperCase_Pass() {
		boolean result = userRegistration.validatePassword("3Rmdg*nKx");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_IfAtleast1Number_Pass() {
		boolean result = userRegistration.validatePassword("Mas1bt&Bx");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_IfNoNumeric_Fail() {
		boolean result = userRegistration.validatePassword("itbP$fDB");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_HasExact1SpecialChar_Pass() {
		boolean result = userRegistration.validatePassword("mDkk#fD1");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_IfNoSpecialChar_Fail() {
		boolean result = userRegistration.validatePassword("mDkkfD12");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_HasMoreThan1SpecialChar_Fail() {
		boolean result = userRegistration.validatePassword("jT!ew@y");
		Assert.assertFalse(result);
	}
}