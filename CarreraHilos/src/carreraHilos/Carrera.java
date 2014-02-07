package carreraHilos;

public class Carrera {

	private boolean empiezas = true;

	public static void main(String[] args) {
		
		Thread tortuga = new TortugaThread(); // creo tortuga a traves de
												// extends thread
		Thread liebre = new Thread(new LiebreThread()); // creo liebre a partir
														// de implement runnable
		// LiebreThread l = new LiebreThread();
		// Thread liebre = new Thread(l);
		System.out.println("Comienza la carrera!!!");
		System.out.println("¿La liebre esta viva?: " + liebre.isAlive()); //comprobar si esta vivo
		tortuga.start(); //arrancan
		liebre.start();	
		System.out.println("¿La tortuga esta viva?: " + tortuga.isAlive()); //comprobar si esta vivo
	}
	
	public  boolean isEmpiezas() {
		return empiezas;
	}

	public void setEmpiezas(boolean empiezas) {
		this.empiezas = empiezas;
	}
}
