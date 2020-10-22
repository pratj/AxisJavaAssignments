package com.java.designpattern.abstractfdp;

public class Client {
	public static void main(String[] args) {

		AbstractDeviceFactory Factory = DeviceFactoryProducer.getFactory("mobile");

		Mobile sp = Factory.getMobile("smartphone");
		sp.using();
		Mobile cp = Factory.getMobile("cellphone");
		cp.using();
		Factory = DeviceFactoryProducer.getFactory("computer");
		Computer lp = Factory.getComputer("laptop");
		lp.using();
		Computer pc = Factory.getComputer("personal computer");
		pc.using();

	}

}
