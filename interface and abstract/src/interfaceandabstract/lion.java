package interfaceandabstract;

public class lion extends AnimalBehaviour {

	@Override
	public void callsound() {
		System.out.println("roar");

	}

	@Override
	public int run() {
		
		return 40;
	}
	
	public void food() {
		System.out.println("meat");	 }

}
