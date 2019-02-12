package interfaceandabstract;

public class Dog  extends DomesticAnimals{

	@Override
	public void callsound() {
		System.out.println("bark");
		
	}

	@Override
	public int run() {
		return 0;
	}

	@Override
	public void food() {
		System.out.println("dogfood");
		
	}

}
