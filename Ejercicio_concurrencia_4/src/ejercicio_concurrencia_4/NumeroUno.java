package ejercicio_concurrencia_4;

public class NumeroUno extends Thread{
	private int numAleatorio1;
	

	@Override
	public void run() {
		
		System.out.println("Primer número:");
		
		setNumAleatorio1((int) (Math.random()*3+1));
		if(numAleatorio1 == 1)
			
		System.out.println(numAleatorio1);
	}
	
	
	
	public int getNumAleatorio1() {
		return numAleatorio1;
	}

	public void setNumAleatorio1(int numAleatorio) {
		this.numAleatorio1 = numAleatorio;
	}
}
