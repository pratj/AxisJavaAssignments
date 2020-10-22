package com.java.designpattern.abstractfdp;

public class DeviceFactoryProducer {

	public static AbstractDeviceFactory getFactory(String factoryName) {
		if (factoryName.equalsIgnoreCase("Mobile"))
			return new MobileFactory();
		if (factoryName.equalsIgnoreCase("Computer"))
			return new ComputerFactory();
		return null;
	}

}
