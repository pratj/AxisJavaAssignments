package com.java.designpattern.abstractfdp;

public class MobileFactory extends AbstractDeviceFactory {

	@Override
	public Mobile getMobile(String Type) {
		if (Type.equalsIgnoreCase("smartphone")) {
			return new Smartphone();
		} else if (Type.equalsIgnoreCase("cellphone")) {
			return new Cellphone();
		}
		return null;
	}

	@Override
	public Computer getComputer(String Type) {
		return null;
	}
}
