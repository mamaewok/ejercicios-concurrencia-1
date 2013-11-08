package ejercicio_concurrencia_3;

public class TirarPrimerDado extends Thread{

	private int numAleatorio1;

	@Override
	public void run() {
		
		System.out.println("Tiro dado 1");
		
		setNumAleatorio1((int) (Math.random()*6+1));
		System.out.println(numAleatorio1);
	}

	
	
	public int getNumAleatorio1() {
		return numAleatorio1;
	}

	public void setNumAleatorio1(int numAleatorio) {
		this.numAleatorio1 = numAleatorio;
	}

}
