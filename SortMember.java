import java.util.ArrayList;


public class SortMember {

	public SortMember(){

	}
	/*
	 * Sort array list by amount of times paid (uses insertion sort)
	 * @param: arraylist
	 * @return: sorted arraylist
	 */
	public ArrayList<Member> sortPaid(ArrayList<Member> arr){
		int n = (arr.size());

		for (int i=1; i<n; ++i)
		{
			Member key = arr.get(i);
			int j = i-1;
			while (j>=0 && arr.get(j).getTimesPaid() < key.getTimesPaid())
			{
				arr.set(j+1, arr.get(j));
				j = j-1;
			}
			arr.set(j+1, key); 
		}
		return arr;   	
	}
	/*
	 * Sort array list by attendance (uses insertion sort)
	 * @param: arraylist
	 * @return: sorted arraylist
	 */
	public ArrayList<Member> sortAttendance(ArrayList<Member> arr){
		int n = (arr.size());

		for (int i=1; i<n; ++i)
		{
			Member key = arr.get(i);
			int j = i-1;
			while (j>=0 && arr.get(j).getTimesAttended() < key.getTimesAttended())
			{
				arr.set(j+1, arr.get(j));
				j = j-1;
			}         
			arr.set(j+1, key);
		}
		return arr;   	
	}

	public ArrayList<Member> sortByFirstName(ArrayList<Member> arr) {
		Member temp;
		for ( int i = 0; i < arr.size(); i++ ) {
			for ( int j = 1; j < arr.size() - i; j++ ) {
				if ( arr.get(j - 1).getFirstName().compareTo(arr.get(j).getFirstName()) > 0) {
					temp = arr.get(j-1);
					arr.set(j-1, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		return arr;
	}

	public ArrayList<Member> sortByLastName(ArrayList<Member> arr) {
		Member temp;
		for ( int i = 0; i < arr.size(); i++ ) {
			for ( int j = 1; j < arr.size() - i; j++ ) {
				if ( arr.get(j - 1).getLastName().compareTo(arr.get(j).getLastName()) > 0) {
					temp = arr.get(j-1);
					arr.set(j-1, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
		return arr;
	}

}

