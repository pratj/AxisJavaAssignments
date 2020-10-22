package com.java.designpattern;

public class DatabaseLogger implements Logger {
	@Override
	public void log(String msg) {
		System.out.println("Datbase Logging" + msg);
	}
}
