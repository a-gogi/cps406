import java.io.*;
import java.util.*;

public class Members {
	
	private ArrayList<Member> memberlist = new ArrayList<Member>();

	public Members() throws IOException {
		// TODO Auto-generated constructor stub
		readMemberDatabase();
	}
	
	public ArrayList<Member> getMembers() {
		return memberlist;
	}
	
	public void setMembers(ArrayList<Member> memberlist) {
		this.memberlist = memberlist;
	}

	@SuppressWarnings("resource")
	private void readMemberDatabase() throws IOException {
		// TODO Auto-generated method stub
		File database = new File("database.txt");
		Scanner read = new Scanner(database);
		
		if ( ! read.hasNextInt() ) throw new IllegalArgumentException();
		int amountofMembers = read.nextInt();
		read.nextLine();

		FileReader fi = new FileReader(database);
		LineNumberReader ln = new LineNumberReader(fi);
		int lines = -1;
		
		while (ln.readLine() != null ) {
			lines++;
		}
		ln.close();
		
		if ( lines % 11 != 0 ) throw new IllegalArgumentException();
		
		while ( amountofMembers > 0) {
			try {
				String firstName = read.nextLine();
				String lastName = read.nextLine();
				String phoneNumber = read.nextLine();
				boolean membershipPaid = false;
				if ( read.nextLine().equals("true")) membershipPaid = true;
				String address = read.nextLine();
				String userid = read.nextLine();
				String password = read.nextLine();
				int timesAttended = Integer.parseInt(read.nextLine());
				int timesPaid = Integer.parseInt(read.nextLine());
				int consecTimesPaid = Integer.parseInt(read.nextLine());
				boolean attendedLastClass = false;
				if ( read.nextLine().equals("true") ) attendedLastClass = true;
				Member m = new Member(firstName, lastName, phoneNumber, membershipPaid, 
						address, userid, password, timesAttended, timesPaid, consecTimesPaid, attendedLastClass);
				memberlist.add(m);
			} catch(IllegalArgumentException e) {
				System.out.println("IllegalArgumentException: Look through contacts.txt file again.");
			}
			amountofMembers--;
		}
		read.close();
	}
	
	public boolean findUser(String userID, String password) {
		for ( int i = 0; i < getMembers().size(); i++ ) {
			if ( getMembers().get(i).getUserID().equals(userID) ) {
				if ( getMembers().get(i).getPassword().equals(password)) return true;
			}
		}
		return false;
	}

}
