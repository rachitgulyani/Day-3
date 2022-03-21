class employee
{
	int empno;
	String ename,address,Phno;
	public employee(int empno,String ename,String address,String Phno) 
	{
		this.empno=empno;
		this.address=address;
		this.Phno=Phno;
		this.ename=ename;
	}
	

	public void details() 
	{
		System.out.println("Employee number:"+empno);
		System.out.println("Employee name:"+ename);
		System.out.println("Adress:"+address);
		System.out.println("Phone no.:"+Phno);
	}
}

class manager extends employee
{	
	String dept;
	int numberofreportees;
	
	public manager(int empno,String ename,String address,String Phno,String dept,int numberofreportees)
	{
		super(empno,ename,address,Phno);
		this.dept=dept;
		this.numberofreportees=numberofreportees;
	}
	public void details() 
	{
		super.details();
		System.out.println("Department:"+dept);
		System.out.println("Number of reportees:"+numberofreportees);
	}
}
public class question4 {

	public static void main(String[] args) {
		employee e1=new employee(101,"Akshay","Delhi","46546");
		employee e2=new employee(102,"Mridul","Delhi","44654");
		employee e3=new employee(103,"Ritvik","Gurugram","77546");
	
		employee m1=new manager(104,"Ajay","Bangalore","231321","HR",12);
		employee m2=new manager(105,"Kartikey","Dehradun","574681","R&D",7);
		
		e1.details();
		System.out.println();
		e2.details();
		System.out.println();
		e3.details();
		System.out.println();
		m1.details();
		System.out.println();
		m2.details();
		System.out.println();
	}

}
