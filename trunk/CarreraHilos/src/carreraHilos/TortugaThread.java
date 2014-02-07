package carreraHilos;

public class TortugaThread extends Thread{

	Carrera c = new Carrera();
	
	public void run(){
		int i = 0;
		System.out.println("Comienza la tortuga...");
		while(i < 5 && c.isEmpiezas() == true){
			try{
				Thread.yield();      //espera a que acabe el thread principal(main)
				Thread.sleep(5000);
				System.out.println("Tortuga...");
			}catch(InterruptedException ie){
				System.err.println("La tortuga se ha dopado");
			}
			i++;
		}
		System.out.println("Termina la tortuga");
	}
}
