package carreraHilos;

public class LiebreThread implements Runnable{

	Carrera c = new Carrera();
	
	public void run(){
		
		c.setEmpiezas(false);
		int i = 0;
		System.out.println("Comienza la liebre...");
		while(i < 5 && c.isEmpiezas() == false){
			try{

				Thread.yield();
				Thread.sleep(2000);
				System.out.println("Liebre...");
			}catch(InterruptedException ie){
				System.err.println("La liebre se ha dopado");
			}
			i++;
		}
		System.out.println("Termina la liebre");
	}
	
}
