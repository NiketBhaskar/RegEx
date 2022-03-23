package com.userregistration;
import java.util.regex.Pattern;

public class UserRegistration {
	final static String first_name_pt = "^[A-Z][a-zA-Z]{2,}";
	final static String last_name_pt = "^[A-Z][a-zA-Z]{2,}";

	final static String emailpt = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";

	final static String mob = "[1-9][0-9]\\s[1-9][0-9]{9}";

	final static String passwordpt = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

	ValidateUserDetail validateDetail = (pattern, detail) -> Pattern.matches(pattern, detail);

	boolean validate(String pattern, String string) throws UserRegException {

		if (validateDetail.validateUserDetail(pattern, string)) {

			System.out.println(string + " is valid");
			return true;
		} else {

			throw new UserRegException(string + " is invalid");
		}

	}
}
