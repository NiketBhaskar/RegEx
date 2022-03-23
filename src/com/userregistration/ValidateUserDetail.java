package com.userregistration;
@FunctionalInterface
public interface ValidateUserDetail {

	boolean validateUserDetail(String pattern,String detail);

}