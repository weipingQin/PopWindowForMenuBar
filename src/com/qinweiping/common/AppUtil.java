package com.qinweiping.common;

public class AppUtil {

	public static boolean isEmpty(String str){
		return str == null || str.trim().length() == 0 || str.trim().equals("null");
	}
	
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
}
