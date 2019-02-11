package interfaceandabstract;

public class cat extends AnimalBehaviour {

	@Override
	public void callsound() {
		System.out.println("meow");
	}

	@Override
	public int run() {
		return 30;
		
		
	}

	@Override
	public void food() {
		System.out.println("meat");
		
	}
	
	}
