class animal{
	public animal() {
		System.out.println("Animal Shouts");
	}
	void shout() {
		System.out.println("shout");
	}
}

class cat extends animal{
	public cat() {
		System.out.println("Cat shouts");
	}
	public void shout() {
	System.out.println("Meow");
}}

class dog extends animal{
	public dog() {
		System.out.println("Dog shouts");
	}
	public void shout() {
	System.out.println("Woof");}
	
}

class horse extends animal{
	public horse() {
		System.out.println("Horse shouts");
	}
	public void shout() {
	System.out.println("Neigh");
	}}
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a=new animal();
		a.shout();
		animal c=new cat();
		c.shout();
		animal d=new dog();
		d.shout();
		animal h=new horse();
		h.shout();
	}

}
