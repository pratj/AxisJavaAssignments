package com.java.designpattern;

public class TestLogger {
	public static void main(String[] args) {
		LoggerFactory logFactory = new LoggerFactory();

		Logger fl = logFactory.getLog("file");
		fl.log(" success");
		Logger dl = logFactory.getLog("database");
		dl.log(" success");
		Logger cl = logFactory.getLog("console");
		cl.log(" success");

	}

}