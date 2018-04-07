import java.util.ArrayList;


public class Member {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private boolean membershipPaid;
	private String address;
	private String userid;
	private String password;
	private int timesAttended;
	private int timesPaid;
	private int consecTimesPaid;
	boolean attendedLastClass;

	public Member(String firstName, String lastName, String phoneNumber, boolean membershipPaid, 
			String address, String userid, String password, int timesAttended, int timesPaid, int consecTimesPaid, boolean attendedLastClass ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.membershipPaid = membershipPaid;
		this.address = address;
		this.userid = userid;
		this.password = password;
		this.timesAttended = timesAttended;
		this.timesPaid = timesPaid;
		this.consecTimesPaid = consecTimesPaid;
		this.attendedLastClass = attendedLastClass;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean getMembershipPaid() {
		return membershipPaid;
	}

	public void setMembershipPaid(boolean membershipPaid) {
		this.membershipPaid = membershipPaid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserID() {
		return userid;
	}

	public void setUserID(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTimesAttended() {
		return timesAttended;
	}

	public void setTimesAttended(int timesAttended) {
		this.timesAttended = timesAttended;
	}

	public int getTimesPaid() {
		return timesPaid;
	}

	public void setTimesPaid(int timesPaid) {
		this.timesPaid = timesPaid;
	}
	
	public int getConsecTimesPaid() {
		return consecTimesPaid;
	}

	public void setConsecTimesPaid(int consecTimesPaid) {
		this.consecTimesPaid = consecTimesPaid;
	}

	public boolean getAttendedLastClass() {
		return attendedLastClass;
	}

	public void setAttendedLastClass(boolean attendedLastClass) {
		this.attendedLastClass = attendedLastClass;
	}

	public String print() {
		String temp = "Name: " + getFirstName() + " " + getLastName();
		if ( !getPhoneNumber().isEmpty() ) {
			temp += "\nNumber: " + getPhoneNumber();
		}
		if ( !getAddress().isEmpty() ) {
			temp += "\nAddress: " + getAddress();
		}
		if ( getMembershipPaid() == true ) {
			temp += "\nMembership paid!\n";
		}
		else {
			temp += "\nMembership not paid.\n";
		}
		return temp;
	}

}
