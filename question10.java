
abstract class compartment{
	abstract void notice();
}

class firstclass extends compartment{

	@Override
	void notice() {
		
		System.out.println("First Class");
	}
	
}

class ladies extends compartment{

	@Override
	void notice() {
		System.out.println("Ladies compartment");
		
	}
	
}

class general extends compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("General compartment");
	}
	
}

class luggage extends compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("Luggage compartment");
	}
	
}
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compartment arr[]=new compartment[10];
		arr[0] = new firstclass();
		arr[1] = new firstclass();
		arr[2] = new firstclass();
		arr[3] = new ladies();
		arr[4] = new ladies();
		arr[5] = new ladies();
		arr[6] = new general();
		arr[7] = new general();
		arr[8] = new luggage();
		arr[9] = new luggage();
		
		for(int i=0;i<10;i++)
		{
			if(arr[i] instanceof firstclass)
				arr[i].notice();		
			else if(arr[i] instanceof ladies)
				arr[i].notice();
			else if(arr[i] instanceof general)
				arr[i].notice();
			else if(arr[i] instanceof luggage)
				arr[i].notice();
		}

}
}