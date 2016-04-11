package myPaySystem;

class TestCase{
	public enum EmpType{
		H,//hourly-rate
		S,//mouth-salary
		C,//mouth-salary commission rate
	};
	
	public boolean AddEmp(int empid,String name, String address,EmpType emptype)
	{
		return false;
	}	
	public boolean DelEmp(int empid)
	{
		return false;
	}
	public boolean TimeCard(int empid, int date, double hours)
	{
		return false;
	}
	public boolean SalesReceipt(int empid, int date , int amount)
	{
		return false;
	}
	public boolean ServiceCharge(int memberid,int amount)
	{
		return false;
	}
	public boolean ChgEmp(int empid,String name)
	{
		return false;
	}
	public boolean Payday(int date)
	{
		return false;
	}
}

public class TestMyPaySystem {
	public static void main(String[] args) 
	{
		TestCase tc=new TestCase();		
		
	}
}
