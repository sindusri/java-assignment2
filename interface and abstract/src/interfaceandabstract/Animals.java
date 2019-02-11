package interfaceandabstract;

interface Animalsound{
	public void  callsound();
}
	interface Animaldo{
	public int run();
}
	 interface Animaleat{
		 public void food(); 
}		 

 abstract class Animals implements Animalsound,Animaldo{
	public abstract void callsound();
	public abstract int run();
	
}

abstract class AnimalBehaviour extends Animals implements Animaleat {
	
	public abstract void callsound(); 
		
	
	public abstract int run();
	public abstract void food();
		
		
	
	
	
}