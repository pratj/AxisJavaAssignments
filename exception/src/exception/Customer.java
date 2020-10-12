package exception;

public class Customer {
	private String custNo;
	private String custName;
	private String category;

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
		try {
			if ((custNo.charAt(0) != 'C' && custNo.charAt(0) != 'c'))
				throw new InvalidInputException("Please begin customer with c");
			if ((custName.length() <= 4))
				throw new InvalidInputException("Please enter more than 4 char");
			if (!(category.equalsIgnoreCase("Platinum") || category.equalsIgnoreCase("Gold")
					|| category.equalsIgnoreCase("Siver")))
				throw new InvalidInputException("Please enter platinum/gold/silver");
		} catch (InvalidInputException ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}

}
