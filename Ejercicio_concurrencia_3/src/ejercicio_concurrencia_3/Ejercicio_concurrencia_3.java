package ejercicio_concurrencia_3;

public class Ejercicio_concurrencia_3 {

	public static void main(String[] args) {
	
		TirarPrimerDado t1 = new  TirarPrimerDado();
		t1.start();
		TirarSegundoDado t2 = new TirarSegundoDado();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException ie){
			
		}
		
		if(t1.getNumAleatorio1() > t2.getNumAleatorio()){
			System.out.println("El dado 1 gana");
		}
		else if(t1.getNumAleatorio1() < t2.getNumAleatorio()){
			System.out.println("El dado 2 gana");
		}
		else
			System.out.println("Empate");
		
		//if()
	}
	
	
}
