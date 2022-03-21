
 class Vehicle_ques1 {
	int regno,price;
	double mileage;
	String brand;
	
	
	public Vehicle_ques1(int regno,int price,double mileage,String brand) {
		this.regno=regno;
		this.price=price;
		this.mileage=mileage;
		this.brand=brand;
	}
	public void display() {
		System.out.println("Registration no.:"+regno);
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Mileage:"+mileage);
	}
	
	
	
	
}

public class question1 {
		public static void main(String args[]) {
		Vehicle_ques1 v1=new Vehicle_ques1(101,1500000,13.5,"Creta");
		Vehicle_ques1 v2=new Vehicle_ques1(102,1200000,12.7,"Brezza");
		
		System.out.println("CAR 1:-");
		v1.display();
		System.out.println();
		System.out.println("CAR 2:-");
		v2.display();
		
		System.out.println();
		String cheap=v1.price<v2.price?v1.brand:v2.brand;
		System.out.println("Lower price:"+cheap);
		
		String better_mileage=v1.mileage>v2.mileage?v1.brand:v2.brand;
		System.out.println("Better mileage:"+better_mileage);
	}
}
