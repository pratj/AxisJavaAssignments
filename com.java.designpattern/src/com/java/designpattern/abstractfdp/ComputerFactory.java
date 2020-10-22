package com.java.designpattern.abstractfdp;

public class ComputerFactory extends AbstractDeviceFactory {
	@Override
	public Computer getComputer(String Type) {
		if (Type.equalsIgnoreCase("personal computer")) {
			return new PersonalComputer();
		} else if (Type.equalsIgnoreCase("laptop")) {
			return new Laptop();
		}
		return null;
	}

	@Override
	public Mobile getMobile(String Type) {
		return null;
	}

}
