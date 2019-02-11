package interfaceandabstract;

public class dog extends AnimalBehaviour {

	@Override
	public void callsound() {
		System.out.println("woof");

	}

	@Override
	public int run() {
		
		return 50;
	}
	public void food() {
		System.out.println("meat");	 }
}
