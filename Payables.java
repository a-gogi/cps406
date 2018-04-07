
public class Payables {
	private String name;
	private int amount;
	private String month;
	private int year;
	public Payables(String name, int amount, String month, int year)
	{
		this.name = name;
		this.amount = amount;
		this.month = month;
		this.year = year;
	}
	public String getName() 
	{
		return name;
	}
	public int getAmount()
	{
		return amount;
	}
	public String getMonth()
	{
		return month;
	}
	public String getMonthAndYear()
	{
		return month + " " + year;
	}
	public String print()
	{
		return this.getName() + "	$" + this.getAmount();
	}
}
