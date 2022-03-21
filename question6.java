class car{
	int noOfgears,speed;
	public void drive(int noOfgears,int speed)
	{
		this.noOfgears=noOfgears;
		this.speed=speed;
		
	}
	public void details() {
		System.out.println("Number of gears:"+noOfgears);
		System.out.println("Speed:"+speed);
	}
}


class SportsCar extends car{
	int airbags;
	public SportsCar(int noOfgears,int speed,int airbags)
	{
		super.drive(noOfgears, speed);
		this.airbags=airbags;
		
	}
	public void details() {
	super.details();
	System.out.println("No. of airbags:"+airbags);
	}
}

public class question6 {

	public static void main(String[] args) {
	car c1=new SportsCar(6,180,4);
	c1.details();
	}

}
