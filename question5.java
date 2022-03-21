class company
{
	int CompId; 
	String name, HO, CEO;
	public company(int CompId,String name,String HO,String CEO)
	{
		this.CompId=CompId;
		this.name=name;
		this.HO=HO;
		this.CEO=CEO;
	}
	public void details()
	{
		System.out.println("Company Id:"+CompId);
		System.out.println("Company Name:"+name);
		System.out.println("HO:"+HO);
		System.out.println("CEO:"+CEO);
	}
	
}
class branchOffices extends company
{
	int brID;
	String location,dept;
	public branchOffices(int CompId,String name,String HO,String CEO,int brID,String location,String dept)
	{
		super(CompId,name,HO,CEO);
		this.brID=brID;
		this.location=location;
		this.dept=dept;
		
	}
	public void details()
	{
		super.details();
		System.out.println("Branch ID:"+brID);
		System.out.println("LOcation:"+location);
		System.out.println("Department:"+dept);
		
	}
}


public class question5 {
	public static void main(String args[]) {
		company b1=new branchOffices(101,"Wipro","ABC","XYZ",201,"Bangalore","Development");	
		b1.details();
	
	}

}
