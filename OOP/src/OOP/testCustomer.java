package OOP;

public class testCustomer {
	public static void main(String[] args) {
		customer cust = new customer();
		cust.setCustomerName("PM Modi");
		address add = new address("Modi house", "New Delhi");
		cust.setResidentailAddress(add);
		System.out.println(cust.getCustomerName() + "\n");
		System.out.println(add.getAddressLine() + "\n" + add.getAddressDetails());
	}
}
