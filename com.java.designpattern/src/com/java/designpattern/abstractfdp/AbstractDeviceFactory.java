package com.java.designpattern.abstractfdp;

public abstract class AbstractDeviceFactory {
	abstract Mobile getMobile(String Type);

	abstract Computer getComputer(String Type);

}
