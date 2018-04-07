import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Admins {

	ArrayList<Admin> adminLogins = new ArrayList<Admin>();

	public Admins() {
		try {
			readAdminsDatabase();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Admin> getAdmins() {
		return adminLogins;
	}

	public boolean findAdminLogin(String username, String password) {
		for ( int i = 0; i < getAdmins().size(); i++ ) {
			if ( getAdmins().get(i).getUsername().equals(username) ) {
				if ( getAdmins().get(i).getPassword().equals(password)) return true;
			}
		}
		return false;		
	}	
	@SuppressWarnings("resource")
	private void readAdminsDatabase() throws IOException {
		File database = new File("admindatabase.txt");
		Scanner read;
		try {
			read = new Scanner(database);
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

			if ( lines % 2 != 0 ) throw new IllegalArgumentException();

			while ( amountofMembers > 0) {
				try {
					String username = read.nextLine();
					String password = read.nextLine();
					Admin a = new Admin(username, password);
					adminLogins.add(a);
				} catch(IllegalArgumentException e) {
					System.out.println("IllegalArgumentException: Look through contacts.txt file again.");
				}
				amountofMembers--;
			}
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
