package com.javacodegeeks.groovy.regex;
import java.util.*;

public class GroovyRegex {

	public static void main(String[]  args) {
		String macAddress = "/([^a-zA-Z0-9]+\\.[^a-zA-Z0-9]+\\.[^a-zA-Z0-9]+\\.[^a-zA-Z0-9]+\\.[^a-zA-Z0-9])/";
		
	System.out.println(macAddress);
	}
}