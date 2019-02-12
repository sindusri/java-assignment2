package interfaceandabstract;

public class Cat extends DomesticAnimals {

	@Override
	public void callsound() {
		System.out.println("meow");
	}

	@Override
	public int run() {
		return 0;
	}

	@Override
	public void food() {
		System.out.println("catfood");
		
	}

}
