abstract class Instrument{
	abstract void play();
}

class piano extends Instrument{

	@Override
	void play() {
		System.out.println("Piano is playing  tan tan tan tan ");
	}
	
}

class guitar extends Instrument{

	@Override
	void play() {
			System.out.println("Guitar is playing  tin  tin  tin ");
	}
	
}

class flute extends Instrument{

	@Override
	void play() {
		System.out.println("Flute is playing  toot toot toot toot");
	}
	
}

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument arr[]=new Instrument[10];
		arr[0] = new piano();
		arr[1] = new piano();
		arr[2] = new piano();
		arr[3] = new piano();
		arr[4] = new flute();
		arr[5] = new flute();
		arr[6] = new flute();
		arr[7] = new guitar();
		arr[8] = new guitar();
		arr[9] = new guitar();
		
	
		for(int i=0;i<10;i++) {
			if(arr[i] instanceof piano) //if the object is of Piano or not
			{
			arr[i].play();
			}
			if(arr[i] instanceof flute) {
			arr[i].play();
			}
			if(arr[i] instanceof guitar) {
			arr[i].play();
			}}
	}

}
