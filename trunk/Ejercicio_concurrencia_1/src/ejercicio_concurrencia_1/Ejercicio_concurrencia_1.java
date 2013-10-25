package ejercicio_concurrencia_1;

import hilos.HiloSumaImpares;
import hilos.HiloSumaPares;
import hilos.HiloSumaTerminan;

public class Ejercicio_concurrencia_1 {

	public static void main(String[] args) {
		
		Thread sumaPares = new Thread(new HiloSumaPares());
		Thread sumaImpares = new Thread(new HiloSumaImpares());
		Thread sumaTerminan = new Thread(new HiloSumaTerminan());
		
		sumaPares.start();
		sumaImpares.start();
		sumaTerminan.start();
	}

}
