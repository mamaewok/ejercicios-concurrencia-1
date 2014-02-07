package ejercicio_concurrencia_5;

public class Ejercicio_concurrencia_5 {

	public static void main(String[] args) {
		int aux1;
		int aux2;
		
		
		for(int i=0;i<3;i++){
		
		Tirada t1 = new Tirada();
			t1.start();
			aux1 = t1.getNumAleatorio1();
			try {
				t1.join(2000);
			} catch (InterruptedException e) {
				System.out.println("No se ha podido esperar");
			}
			t1.yield();
		Tirada t2 = new Tirada();
			t2.start();
			aux2 = t1.getNumAleatorio1();
			try {
				t1.join(2000);
			} catch (InterruptedException e) {
				System.out.println("No se ha podido realizar la espera");
			}
			Tirada.yield();

			
			
			if(aux1 == 1 && aux2 == 2)
				System.out.println("Ha ganado jugador 2: PAPEL");
			else if(aux1 == 1 && aux2 == 3)
				System.out.println("Ha ganado jugador 1: PIEDRA");
			else if(aux1 == 2 && aux2 == 1)
				System.out.println("Ha ganado jugador 1: PAPEL");
			else if(aux1 == 2 && aux2 == 3)
				System.out.println("Ha ganado jugador 3: TIJERA");
			else if(aux1 == 3 && aux2 == 1)
				System.out.println("Ha ganado jugador 1: TIJERA");
			else if(aux1 == 3 && aux2 == 2)
				System.out.println("Ha ganado jugador 1: PIEDRA");
			else
				System.out.println("Empate");
		}
	}
}