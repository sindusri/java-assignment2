package interfaceandabstract;

public class main {
	
	public static void main(String[] args) {
		
		
		
		AnimalBehaviour[] animal = new AnimalBehaviour[3];
		animal[0] = new cat();
        animal[1] = new dog();
        animal[2] = new lion();
		
		animal[0].callsound();
		animal[0].food();
	}
	

}
