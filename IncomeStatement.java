import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class IncomeStatement {

	private ArrayList<Payables> revenueList;
	private ArrayList<Payables> expenseList;
	public IncomeStatement() throws FileNotFoundException
	{
		revenueList = new ArrayList<Payables>();
		expenseList = new ArrayList<Payables>();
		File revenue = new File("Data/Revenue");
		File expenses = new File("Data/Expenses");
		Scanner scan = new Scanner(revenue);
		fillArrayList(scan,revenueList,0);
		scan = new Scanner(expenses);
		fillArrayList(scan,expenseList,1);
		scan.close();
	}
	
	
	/**
	 * Adds a revenue object to the revenueList arrayList
	 * @param revenue
	 */
	public ArrayList<Payables> getRevenueList()
	{
		return revenueList;
	}
	public ArrayList<Payables> getExpenseList()
	{
		return expenseList;
	}
	public void addRevenue(Revenue revenue) 
	{
		revenueList.add(revenue);
	}
	/**
	 * Adds an expense object to the expenseList arrayList
	 * @param expense
	 */
	public void addExpense(Expenses expense) 
	{
		expenseList.add(expense);
	}
	/**
	 * Prints the income statement, first starting with the revenue, followed by expenses and finally the net profit
	 * @return string representation of an income statement
	 */
	public String print() 
	{
		return "Total\n\n" + incomeTextPrint(revenueList,expenseList);
	}
	/**
	 * Prints the income statement of a specified month, first starting with the revenue, followed by expenses and finally the net profit
	 * @param string the month to print
	 * @return
	 */
	public String print(String string) {
		ArrayList<Payables> revenueMonth = new ArrayList<Payables>();
		ArrayList<Payables> expensesMonth = new ArrayList<Payables>();
		for (int i = 0; i < revenueList.size(); i++)
		{
			Revenue x = (Revenue) revenueList.get(i);
			if (x.getMonth().equals(string))
			{
			revenueMonth.add(x);
			}
		}
		for (int i = 0; i < expenseList.size(); i++)
		{
			Expenses x = (Expenses) expenseList.get(i);
			if (x.getMonth().equals(string))
			{
			expensesMonth.add(x);
			}
		}
		return "                " + string + "\n\n" + incomeTextPrint(revenueMonth,expensesMonth);
	}
	/**
	 * Returns a string representation of the income statement
	 * @param revenueList2 list of revenue objects
	 * @param expenseList2 list of expense objects
	 * @return
	 */
	public String incomeTextPrint(ArrayList<Payables> revenueList2,ArrayList<Payables> expenseList2)
	{
		int total = 0;
		String incomeText = "";
		incomeText += "Revenue:\n";
		for (int i = 0; i < revenueList2.size(); i++)
		{
			Revenue x = (Revenue) revenueList2.get(i);
			incomeText += x.print()+ "\n";
			total += x.getAmount();
		}
		incomeText += "\nExpenses\n";
		for (int i = 0; i < expenseList2.size(); i++)
		{
			Expenses x = (Expenses) expenseList2.get(i);
			incomeText += x.print() + "\n";
			total -= x.getAmount();
		}
		if (total < 0)
			incomeText += "\nNet Income: -$" + (total*-1);
		else
			incomeText += "\nNet Income: $" + total;
		return incomeText;	
	}
	/**
	 * Fills the given arraylist with the payable objects from the scanner
	 * @param scan scanner with the file of Payables
	 * @param revenueList2 arrayList to fill
	 */
	private void fillArrayList(Scanner scan, ArrayList<Payables> payableList, int type)
	{
		while (scan.hasNextLine())
		{
			String name = scan.next();
			int amount = scan.nextInt();
			String month = scan.next();
			int year = scan.nextInt();
			if (type == 0)
				payableList.add(new Revenue(name,amount,month,year));
			else
				payableList.add(new Expenses(name,amount,month,year));
		}
	}
}
