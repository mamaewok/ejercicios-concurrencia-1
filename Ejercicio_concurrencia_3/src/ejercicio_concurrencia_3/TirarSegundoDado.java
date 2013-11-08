package ejercicio_concurrencia_3;

public class TirarSegundoDado extends Thread{

	private int numAleatorio2;
	
	@Override
	public void run() {
		
		System.out.println("Tiro dado 2");
		
		numAleatorio2 = (int) (Math.random()*6+1);
		System.out.println(numAleatorio2);
	
	}
	
	public int getNumAleatorio() {
		return numAleatorio2;
	}

	public void setNumAleatorio(int numAleatorio) {
		this.numAleatorio2 = numAleatorio;
	}
}
