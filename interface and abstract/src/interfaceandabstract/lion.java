package interfaceandabstract;

 public class Lion extends WildAnimals {

	@Override
	public void callsound() {
		System.out.println("roar");
		
	}

	@Override
	public int run() {
		return 0;
	}

	@Override
	public void food() {
		System.out.println("meat");
		
	}

}
