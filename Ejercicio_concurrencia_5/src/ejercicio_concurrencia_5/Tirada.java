package ejercicio_concurrencia_5;

public class Tirada extends Thread{
	private int numAleatorio1;

	@Override
	public void run() {
		
		System.out.println("Primer número:");
		setNumAleatorio1((int) (Math.random()*3+1));
		if(numAleatorio1 == 1)
			System.out.println("Piedra"); 
		else if(numAleatorio1 == 2)
			System.out.println("Papel");
		else
			System.out.println("Tijera");
		
	}
	
	public int getNumAleatorio1() {
		return numAleatorio1;
	}

	public void setNumAleatorio1(int numAleatorio) {
		this.numAleatorio1 = numAleatorio;
	}

}
