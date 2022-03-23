package com.userregistration;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegTest {

	String firstName = "Niket";
	String lastName = "Bhaskar";
	String email[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.con", "abc-100@abc.net",
			"abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };

	String mob = "91 9876543210";
	String pass = "hypeSqu@d11";
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void validateFirstName() {
		try {
			assertTrue(userRegistration.validate(userRegistration.first_name_pt, firstName));
		} catch (UserRegException e) {
			System.out.println(e);
		}

	}

	@Test
	public void validateLastName() {
		try {
			assertTrue(userRegistration.validate(userRegistration.last_name_pt, lastName));
		} catch (UserRegException e) {
			System.out.println(e);
		}

	}

	@Test
	public void validateEmail() {
		try {
			for (String string : email)
				assertTrue(userRegistration.validate(userRegistration.emailpt, string));

		} catch (UserRegException e) {
			System.out.println(e);
		}

	}

	@Test
	public void validateMobile() {
		try {
			assertTrue(userRegistration.validate(userRegistration.mob, mob));
		} catch (UserRegException e) {
			System.out.println(e);
		}

	}

	@Test
	public void validatePassword() {
		try {
			assertTrue(userRegistration.validate(userRegistration.passwordpt, pass));
		} catch (UserRegException e) {
			System.out.println(e);
		}

	}

}
