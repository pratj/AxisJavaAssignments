package OOP;

public class customer {
	private String customerName;
	private address residentailAddress;

	customer() {

	}

	customer(String customerName, address residentAddress) {
		this.customerName = customerName;
		this.residentailAddress = residentAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public address getResidentailAddress() {
		return residentailAddress;
	}

	public void setResidentailAddress(address residentailAddress) {
		this.residentailAddress = residentailAddress;
	}

	public String getCustomerDeatils() {

		return "Customer: " + customerName + "\nResidential Address:" + residentailAddress;
	}
}
