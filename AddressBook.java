public class AddressBook {
	private String fname = "";
	private String lname = "";
	private String address = "";
	private String city = "";
	private String state = "";
	private String zip = "";
	private String mob_no = "";
	private String email = "";

	public AddressBook(String fname, String lname, String address, String city,String state, String zip,
			String mob_no, String email) {
			this.fname = fname;
			this.lname = lname;
			this.address = address;
			this.zip = zip;
			this.city = city;
			this.state = state;
			this.mob_no = mob_no;
			this.email = email;
	}

	public String toString() {
        return "Contact created:\nName: " + fname+" " + lname+"\nAddress: " + address+"\nCity: " +city+"\nState: " +state+
        		"\nZip Code: " +zip +"\nMobile: " +mob_no +"\nEmail: " +email;
    }

	public static void main(String[] args) {
		System.out.println("Welcome to the AddressBook program.");
		
	}

}
