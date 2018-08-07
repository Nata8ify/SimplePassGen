package com.n8ify.genpass.utils;


public class LogUtil {
	
	public static void println(Class source, Object out) {
		System.out.println(String.format("%s :: %s", source.getSimpleName(), out));
	}
}
