package com.java.designpattern;

public class LoggerFactory {

	LoggerFactory() {
		// TODO Auto-generated constructor stub
	}

	public Logger getLog(String logType) {
		if (logType == null) {
			return null;
		}
		if (logType.equalsIgnoreCase("file")) {
			return new FileLogger();

		} else if (logType.equalsIgnoreCase("database")) {
			return new DatabaseLogger();

		} else if (logType.equalsIgnoreCase("console")) {
			return new ConsoleLogger();
		}

		return null;
	}

}
