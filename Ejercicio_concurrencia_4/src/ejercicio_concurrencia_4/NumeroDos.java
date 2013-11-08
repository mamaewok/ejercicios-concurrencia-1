package ejercicio_concurrencia_4;

public class NumeroDos extends Thread{
	
private int numAleatorio2;
	
	@Override
	public void run() {
		
		System.out.println("Segundo número:");
		
		numAleatorio2 = (int) (Math.random()*100+1);
		System.out.println(numAleatorio2);
	
	}
	
	public int getNumAleatorio() {
		return numAleatorio2;
	}

	public void setNumAleatorio(int numAleatorio) {
		this.numAleatorio2 = numAleatorio;
	}

}
