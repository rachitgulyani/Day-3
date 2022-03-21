class movie{
	
	String MPAA_rating,title;
	int id;
	double late_fees=2;
	public String getMPAA_rating() {
		return MPAA_rating;
	}
	public void setMPAA_rating(String mPAA_rating) {
		MPAA_rating = mPAA_rating;
}
	public String getTitle() {
		return title;
}
	public void setTitle(String title) {
		this.title = title;
}
	public int getId() {
		return id;
}
	public void setId(int id) {
		this.id = id;
}
	
	public void displaydetails()
	{
		System.out.println("Title:"+getTitle());
		System.out.println("Movie ID:"+getId());
		System.out.println("Title:"+getMPAA_rating());
		
	}
	public double calcLateFees(int days)
	{
		return days*late_fees;
	}
	public boolean equals() {
		return false;
		
	}
}

class action extends movie
{
	int days;
	double late_fees=3;

	public double calcLateFees(int days)
	{
		return days*late_fees;
	}
	public boolean equals() 
	{
		if(id==super.id)
			return true;
		else
			return false;
		
    }
}
	
class comedy extends movie	
{
	int days;
	double late_fees=2.5;
	public double calcLateFees(int days)
	{
		return days*late_fees;
	}
	
	
	
}

class drama extends movie	
{
	int days;
	double late_fees=2;
	public double calcLateFees(int days)
	{
		return days*late_fees;
	}
	
}




public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie m1=new movie();
		movie m2=new action();
		
		m1.setId(101);
		
		
		m2.setId(101);
		m2.setMPAA_rating("UA");
		m2.setTitle("Ra-One");
		m2.calcLateFees(12);
		
		m2.displaydetails();
		System.out.println("Identical:-"+m2.equals());
		System.out.println("Late Fees:"+m2.calcLateFees(12));
		
		
	}
}
