package testpack;

//import OOP.address;

public class customer {
	private String customerName;
	private address residentailAddress;
	private address officialAddress;

	public address getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(address officialAddress) {
		this.officialAddress = officialAddress;
	}

	customer() {

	}

	customer(String customerName, address residentAddress, address officialAddress) {
		this.customerName = customerName;
		this.residentailAddress = residentAddress;
		this.officialAddress = officialAddress;
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

	public void setResidentailAddress(address add) {
		this.residentailAddress = add;
	}

	public String getCustomerDeatils() {

		return "Customer: " + customerName + "\nResidential Address:" + residentailAddress + "Official Address"
				+ officialAddress;
	}
}
