package ejercicio_concurrencia_4;

public class Ejercicio_concurrencia_4 {

	public static void main(String[] args) {
		
		NumeroUno n1 = new NumeroUno();
		n1.start();
		NumeroDos n2 = new NumeroDos();
		n2.start();
		while (n1.isAlive()) Thread.yield();
		
		try{
			n1.join();
			n1.yield();
			n2.join();
			n2.yield();
		}catch(InterruptedException ie){
			
		}
		

	}

}
