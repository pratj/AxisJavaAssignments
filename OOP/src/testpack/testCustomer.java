package testpack;

//import OOP.address;
//import OOP.customer;

public class testCustomer {
	public static void main(String[] args) {

		address add = new address("Modi house", "New Delhi");
		customer cust = new customer("", add, add);
		cust.setCustomerName("PM Modi");
		cust.setResidentailAddress(add);
		cust.setOfficialAddress(add);
		System.out.println(cust.getCustomerName() + "\n");
		System.out.println(add.getAddressLine() + "\n" + add.getAddressDetails());
	}
}
